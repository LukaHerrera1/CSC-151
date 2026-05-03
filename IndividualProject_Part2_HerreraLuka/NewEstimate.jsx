import { useState } from "react";
import { useNavigate, useLocation } from "react-router-dom";
import { base44 } from "@/api/base44Client";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Label } from "@/components/ui/label";
import { Card, CardContent, CardHeader, CardTitle } from "@/components/ui/card";
import { Calculator, Save, ArrowLeft } from "lucide-react";

function calcEstimate(data) {
  const area = data.length_ft * data.width_ft;
  const thicknessFt = data.thickness_in / 12;
  const volume = area * thicknessFt;
  const concreteCost = volume * data.concrete_cost_per_cf;
  const laborHours = area / 50;
  const workers = data.num_workers || 1;
  const rate = data.hourly_rate || 0;
  const laborCost = laborHours * rate * workers;
  const totalCost = concreteCost + laborCost;
  return {
    area_sqft: Math.round(area * 100) / 100,
    volume_cuft: Math.round(volume * 100) / 100,
    concrete_cost: Math.round(concreteCost * 100) / 100,
    labor_hours: Math.round(laborHours * 100) / 100,
    labor_cost: Math.round(laborCost * 100) / 100,
    total_cost: Math.round(totalCost * 100) / 100,
  };
}

export default function NewEstimate() {
  const navigate = useNavigate();
  const location = useLocation();
  const editing = location.state?.estimate || null;

  const [form, setForm] = useState({
    project_name: editing?.project_name || "",
    location: editing?.location || "",
    length_ft: editing?.length_ft || "",
    width_ft: editing?.width_ft || "",
    thickness_in: editing?.thickness_in || "",
    num_workers: editing?.num_workers || 1,
    hourly_rate: editing?.hourly_rate || "",
    concrete_cost_per_cf: editing?.concrete_cost_per_cf || "",
  });
  const [saving, setSaving] = useState(false);

  const set = (key) => (e) => setForm({ ...form, [key]: e.target.value });

  const numVal = (v) => {
    const n = parseFloat(v);
    return isNaN(n) ? 0 : n;
 };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setSaving(true);
    const data = {
      project_name: form.project_name,
      location: form.location,
      length_ft: numVal(form.length_ft),
      width_ft: numVal(form.width_ft),
      thickness_in: numVal(form.thickness_in),
      num_workers: numVal(form.num_workers) || 1,
      hourly_rate: numVal(form.hourly_rate),
      concrete_cost_per_cf: numVal(form.concrete_cost_per_cf),
    };
    const calcs = calcEstimate(data);
    const payload = { ...data, ...calcs };

    if (editing) {
      await base44.entities.Estimate.update(editing.id, payload);
    } else {
      await base44.entities.Estimate.create(payload);
    }
    setSaving(false);
    navigate("/projects");
  };

  const fields = [
    { key: "project_name", label: "Project Name", type: "text", placeholder: "e.g. Backyard Patio", required: true },
    { key: "location", label: "Location", type: "text", placeholder: "e.g. 123 Main St" },
    { key: "length_ft", label: "Length (feet)", type: "number", placeholder: "0", required: true },
    { key: "width_ft", label: "Width (feet)", type: "number", placeholder: "0", required: true },
    { key: "thickness_in", label: "Thickness (inches)", type: "number", placeholder: "4", required: true },
    { key: "num_workers", label: "Number of Workers", type: "number", placeholder: "1" },
    { key: "hourly_rate", label: "Hourly Labor Rate ($)", type: "number", placeholder: "25" },
    { key: "concrete_cost_per_cf", label: "Concrete Cost per Cu Ft ($)", type: "number", placeholder: "6", required: true },
  ];

  return (
    <div className="min-h-screen bg-background">
      <div className="max-w-2xl mx-auto px-4 py-8">
        <button onClick={() => navigate(-1)} className="flex items-center gap-1.5 text-sm text-muted-foreground hover:text-foreground mb-6 transition-colors">
          <ArrowLeft className="w-4 h-4" /> Back
        </button>

        <Card className="border-0 shadow-lg">
          <CardHeader className="pb-2">
            <CardTitle className="text-2xl font-semibold tracking-tight flex items-center gap-2">
              <Calculator className="w-6 h-6 text-primary" />
              {editing ? "Edit Estimate" : "New Estimate"}
            </CardTitle>
            <p className="text-sm text-muted-foreground mt-1">
              Enter pad dimensions and costs to generate your estimate.
            </p>
          </CardHeader>
          <CardContent>
            <form onSubmit={handleSubmit} className="space-y-5 mt-2">
              <div className="grid grid-cols-1 sm:grid-cols-2 gap-4">
                {fields.map((f) => (
                  <div key={f.key} className={f.key === "project_name" ? "sm:col-span-2" : ""}>
                    <Label htmlFor={f.key} className="text-xs font-medium uppercase tracking-wider text-muted-foreground mb-1.5 block">
                      {f.label} {f.required && <span className="text-destructive">*</span>}
                    </Label>
                    <Input
                      id={f.key}
                      type={f.type}
                      step={f.type === "number" ? "any" : undefined}
                      placeholder={f.placeholder}
                      value={form[f.key]}
                      onChange={set(f.key)}
                      required={f.required}
                      className="h-11 bg-muted/40 border-border/60 focus:bg-background transition-colors"
                    />
                  </div>
                ))}
              </div>

              <div className="pt-2">
                <Button type="submit" disabled={saving} className="w-full h-12 text-base font-medium gap-2">
                  <Save className="w-4 h-4" />
                  {saving ? "Saving..." : editing ? "Update Estimate" : "Calculate & Save"}
                </Button>
              </div>
            </form>
          </CardContent>
        </Card>
      </div>
    </div>
  );
}