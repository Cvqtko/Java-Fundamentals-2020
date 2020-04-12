package exercise_more_03;

public class Engine {

	private String model;
	private int power;
	private String displacement;
	private String efficiency;

	public Engine(String model, int power, String displacement, String efficienc) {
		this.model = model;
		this.power = power;
		this.displacement = displacement;
		this.efficiency = efficienc;
	}

	public Engine(String model, int power) {
		this(model, power, "n/a", "n/a");
	}

	public Engine(String model, int power, String displacement) {
		this(model, power, displacement, "n/a");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public String getEfficienc() {
		return efficiency;
	}

	public void setEfficienc(String efficienc) {
		this.efficiency = efficienc;
	}

	@Override
	public String toString() {
		return "  " + this.model + ":" + "\n"
				+ String.format("    Power: %s%n" + "    Displacement: %s%n" + "    Efficiency: %s%n", this.power,
						this.displacement, this.efficiency);
	}

}
