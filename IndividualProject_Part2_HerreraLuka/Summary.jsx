import { useLocation, useNavigate } from "react-router-dom";
import { Button } from "@/components/ui/button";
import { Card, CardContent, CardHeader, CardTitle } from "@/components/ui/card";
import { ArrowLeft, Pencil, Ruler, Box, DollarSign, Clock, Users } from "lucide-react";

function fmt(n) {
  return "$" + (n || 0).toLocaleString(undefined, { minimumFractionDigits: 2, maximumFractionDigits: 2 });
}

function StatCard({ icon: Icon, label, value, accent }) {
  return (
    <div className={`rounded-xl p-4 ${accent ? "bg-primary text-primary-foreground" : "bg-muted/50"}`}>
      <div className="flex items-center gap-2 mb-1">
        <Icon className={`w-4 h-4 ${accent ? "text-primary-foreground/70" : "text-muted-foreground"}`} />
        <span className={`text-xs font-medium uppercase tracking-wider ${accent ? "text-primary-foreground/70" : "text-muted-foreground"}`}>
          {label}
        </span>
      </div>
      <p className={`text-xl font-bold ${accent ? "" : "text-foreground"}`}>{value}</p>
    </div>
  );
}

export default function Summary() {
  const navigate = useNavigate();
  const location = useLocation();
  const est = location.state?.estimate;

  if (!est) {
    return (
      <div className="min-h-screen flex items-center justify-center">
        <div className="text-center">
          <p className="text-muted-foreground mb-4">No estimate selected.</p>
          <Button onClick={() => navigate("/projects")}>View Projects</Button>
        </div>
      </div>
    );
  }

  const details = [
    { label: "Length", value: `${est.length_ft} ft` },
    { label: "Width", value: `${est.width_ft} ft` },
    { label: "Thickness", value: `${est.thickness_in} in` },
    { label: "Workers", value: est.num_workers || 1 },
    { label: "Hourly Rate", value: fmt(est.hourly_rate) },
    { label: "Cost / Cu Ft", value: fmt(est.concrete_cost_per_cf) },
  ];

  return (
    <div className="min-h-screen bg-background">
      <div className="max-w-2xl mx-auto px-4 py-8">
        <button onClick={() => navigate("/projects")} className="flex items-center gap-1.5 text-sm text-muted-foreground hover:text-foreground mb-6 transition-colors">
          <ArrowLeft className="w-4 h-4" /> Back to Projects
        </button>

        <Card className="border-0 shadow-lg overflow-hidden">
          <CardHeader className="bg-muted/30 pb-4">
            <div className="flex items-start justify-between">
              <div>
                <CardTitle className="text-2xl font-semibold tracking-tight">{est.project_name}</CardTitle>
                {est.location && <p className="text-sm text-muted-foreground mt-1">{est.location}</p>}
              </div>
              <Button variant="outline" size="sm" className="gap-1.5" onClick={() => navigate("/new", { state: { estimate: est } })}>
                <Pencil className="w-3.5 h-3.5" /> Edit
              </Button>
            </div>
          </CardHeader>

          <CardContent className="p-5 space-y-6">
            {/* Key Metrics */}
            <div className="grid grid-cols-2 gap-3">
              <StatCard icon={Ruler} label="Area" value={`${est.area_sqft} sq ft`} />
              <StatCard icon={Box} label="Volume" value={`${est.volume_cuft} cu ft`} />
              <StatCard icon={DollarSign} label="Concrete Cost" value={fmt(est.concrete_cost)} />
              <StatCard icon={Clock} label="Labor Hours" value={est.labor_hours} />
              <StatCard icon={Users} label="Labor Cost" value={fmt(est.labor_cost)} />
              <StatCard icon={DollarSign} label="Total Cost" value={fmt(est.total_cost)} accent />
            </div>

            {/* Input Details */}
            <div>
              <h3 className="text-xs font-medium uppercase tracking-wider text-muted-foreground mb-3">Input Details</h3>
              <div className="grid grid-cols-2 sm:grid-cols-3 gap-x-6 gap-y-2">
                {details.map((d) => (
                  <div key={d.label} className="flex justify-between text-sm py-1.5 border-b border-border/50">
                    <span className="text-muted-foreground">{d.label}</span>
                    <span className="font-medium">{d.value}</span>
                  </div>
                ))}
              </div>
            </div>
          </CardContent>
        </Card>
      </div>
    </div>
  );
}