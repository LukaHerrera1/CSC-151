import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import { base44 } from "@/api/base44Client";
import { Button } from "@/components/ui/button";
import { Card, CardContent } from "@/components/ui/card";
import { Pencil, Trash2, Eye, Plus, Download, FolderOpen } from "lucide-react";

function formatCurrency(n) {
  return "$" + (n || 0).toLocaleString(undefined, { minimumFractionDigits: 2, maximumFractionDigits: 2 });
}

function downloadCSV(estimates) {
  const headers = [
    "Project Name","Location","Length (ft)","Width (ft)","Thickness (in)",
    "Workers","Hourly Rate","Cost/CuFt","Area (sqft)","Volume (cuft)",
    "Concrete Cost","Labor Hours","Labor Cost","Total Cost"
  ];
  const rows = estimates.map(e => [
    e.project_name, e.location, e.length_ft, e.width_ft, e.thickness_in,
    e.num_workers, e.hourly_rate, e.concrete_cost_per_cf, e.area_sqft,
    e.volume_cuft, e.concrete_cost, e.labor_hours, e.labor_cost, e.total_cost
  ]);
  const csv = [headers, ...rows].map(r => r.map(v => `"${v ?? ""}"`).join(",")).join("\n");
  const blob = new Blob([csv], { type: "text/csv" });
  const url = URL.createObjectURL(blob);
  const a = document.createElement("a");
  a.href = url;
  a.download = "estimates.csv";
  a.click();
  URL.revokeObjectURL(url);
}

export default function Projects() {
  const navigate = useNavigate();
  const [estimates, setEstimates] = useState([]);
  const [loading, setLoading] = useState(true);

  const load = async () => {
    setLoading(true);
    const data = await base44.entities.Estimate.list("-created_date", 100);
    setEstimates(data);
    setLoading(false);
  };

  useEffect(() => { load(); }, []);

  const handleDelete = async (id) => {
    await base44.entities.Estimate.delete(id);
    setEstimates(estimates.filter(e => e.id !== id));
  };

  return (
    <div className="min-h-screen bg-background">
      <div className="max-w-4xl mx-auto px-4 py-8">
        <div className="flex flex-col sm:flex-row sm:items-center justify-between gap-4 mb-8">
          <div>
            <h1 className="text-2xl font-semibold tracking-tight">Saved Projects</h1>
            <p className="text-sm text-muted-foreground mt-0.5">{estimates.length} estimate{estimates.length !== 1 ? "s" : ""} on file</p>
          </div>
          <div className="flex gap-2">
            {estimates.length > 0 && (
              <Button variant="outline" size="sm" onClick={() => downloadCSV(estimates)} className="gap-1.5">
                <Download className="w-4 h-4" /> Export CSV
              </Button>
            )}
            <Button size="sm" onClick={() => navigate("/new")} className="gap-1.5">
              <Plus className="w-4 h-4" /> New Estimate
            </Button>
          </div>
        </div>

        {loading ? (
          <div className="flex justify-center py-20">
            <div className="w-6 h-6 border-2 border-muted-foreground/30 border-t-primary rounded-full animate-spin" />
          </div>
        ) : estimates.length === 0 ? (
          <Card className="border-dashed">
            <CardContent className="flex flex-col items-center justify-center py-16 text-center">
              <FolderOpen className="w-12 h-12 text-muted-foreground/40 mb-4" />
              <p className="text-muted-foreground font-medium">No estimates yet</p>
              <p className="text-sm text-muted-foreground/70 mt-1 mb-4">Create your first concrete pad estimate to get started.</p>
              <Button onClick={() => navigate("/new")} className="gap-1.5">
                <Plus className="w-4 h-4" /> Create Estimate
              </Button>
            </CardContent>
          </Card>
        ) : (
          <div className="space-y-3">
            {estimates.map((est) => (
              <Card key={est.id} className="hover:shadow-md transition-shadow">
                <CardContent className="p-4 sm:p-5">
                  <div className="flex flex-col sm:flex-row sm:items-center justify-between gap-3">
                    <div className="min-w-0">
                      <h3 className="font-semibold text-base truncate">{est.project_name}</h3>
                      {est.location && <p className="text-sm text-muted-foreground truncate">{est.location}</p>}
                      <div className="flex flex-wrap gap-x-4 gap-y-1 mt-2 text-xs text-muted-foreground">
                        <span>{est.area_sqft} sq ft</span>
                        <span>{est.volume_cuft} cu ft</span>
                        <span className="font-medium text-foreground">{formatCurrency(est.total_cost)}</span>
                      </div>
                    </div>
                    <div className="flex items-center gap-1.5 shrink-0">
                      <Button variant="ghost" size="icon" className="h-8 w-8" onClick={() => navigate("/summary", { state: { estimate: est } })}>
                        <Eye className="w-4 h-4" />
                      </Button>
                      <Button variant="ghost" size="icon" className="h-8 w-8" onClick={() => navigate("/new", { state: { estimate: est } })}>
                        <Pencil className="w-4 h-4" />
                      </Button>
                      <Button variant="ghost" size="icon" className="h-8 w-8 text-destructive hover:text-destructive" onClick={() => handleDelete(est.id)}>
                        <Trash2 className="w-4 h-4" />
                      </Button>
                    </div>
                  </div>
                </CardContent>
              </Card>
            ))}
          </div>
        )}
      </div>
    </div>
  );
}