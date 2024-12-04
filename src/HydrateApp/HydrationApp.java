
package HydrateApp;

public class HydrationApp extends Diet2 {
   
    private double waterIntake;
    private double hydrationGoal;

    public HydrationApp(double waterIntake, double hydrationGoal) {
        this.waterIntake = waterIntake;
        this.hydrationGoal = hydrationGoal;
    }

    public double getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(double waterIntake) {
        this.waterIntake = waterIntake;
    }

    public double getHydrationGoal() {
        return hydrationGoal;
    }

    public void setHydrationGoal(double hydrationGoal) {
        this.hydrationGoal = hydrationGoal;
    }

    @Override
    public String toString() {
        return "Water Intake: " + waterIntake + " ml, Hydration Goal: " + hydrationGoal + " ml";
    }
}
