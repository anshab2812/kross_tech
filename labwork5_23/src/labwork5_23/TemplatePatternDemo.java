package labwork5_23;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		BuildProject building = new School();
		System.out.println("�����");
		building.BuildingPlan();
		System.out.println("");
		System.out.println("����-�����");
		building = new OfficeCenter();
		building.BuildingPlan();
	}

}
