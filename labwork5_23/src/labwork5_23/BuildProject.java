package labwork5_23;

public abstract class BuildProject {

	public abstract void getFloars();
	public abstract void getColor();
	public abstract void getFoundation();
	public abstract void getCarcassF();
	public abstract void getWiring();
	public abstract void getPlumbing();
	public final void getCarcassBuild() {
		String carcass = "��������������";
		System.out.println("\t���� ������:");
		System.out.println("������ ������: " + carcass);
	}
	public final void BuildingPlan() {
		getCarcassBuild();
		getFloars();
		getColor();
		getFoundation();
		System.out.println("\t���� �����:");
		getCarcassF();
		getWiring();
		getPlumbing();
	}
}
