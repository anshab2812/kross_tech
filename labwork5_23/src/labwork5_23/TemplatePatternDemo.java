package labwork5_23;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		BuildProject building = new School();
		System.out.println("Ўкола");
		building.BuildingPlan();
		System.out.println("");
		System.out.println("ќфис-центр");
		building = new OfficeCenter();
		building.BuildingPlan();
	}

}
