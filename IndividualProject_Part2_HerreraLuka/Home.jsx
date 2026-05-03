import { useNavigate } from "react-router-dom";
import { Button } from "@/components/ui/button";
import { Calculator, FolderOpen, ArrowRight } from "lucide-react";

export default function Home() {
  const navigate = useNavigate();

  return (
    <div className="min-h-screen bg-background flex items-center justify-center px-4">
      <div className="max-w-md w-full text-center space-y-8">
        {/* Logo area */}
        <div>
          <div className="w-16 h-16 rounded-2xl bg-primary flex items-center justify-center mx-auto mb-5 shadow-lg">
            <Calculator className="w-8 h-8 text-primary-foreground" />
          </div>
          <h1 className="text-3xl font-bold tracking-tight">Concrete Pad Estimator</h1>
          <p className="text-muted-foreground mt-2 text-sm leading-relaxed">
            Quickly calculate materials, labor, and total cost<br />for your concrete pad projects.
          </p>
        </div>

        {/* Action buttons */}
        <div className="space-y-3">
          <Button
            onClick={() => navigate("/new")}
            className="w-full h-14 text-base font-medium gap-2 justify-between group"
          >
            <span className="flex items-center gap-2">
              <Calculator className="w-5 h-5" /> New Estimate
            </span>
            <ArrowRight className="w-4 h-4 opacity-50 group-hover:opacity-100 transition-opacity" />
          </Button>

          <Button
            variant="outline"
            onClick={() => navigate("/projects")}
            className="w-full h-14 text-base font-medium gap-2 justify-between group"
          >
            <span className="flex items-center gap-2">
              <FolderOpen className="w-5 h-5" /> View Saved Projects
            </span>
            <ArrowRight className="w-4 h-4 opacity-50 group-hover:opacity-100 transition-opacity" />
          </Button>
        </div>

        <p className="text-xs text-muted-foreground/60">
          Estimates are saved automatically and can be exported to CSV.
        </p>
      </div>
    </div>
  );
}