package labwork5_21;

public class PlantA implements Plant {
	@Override
	public void build(String p) {
		System.out.print("Завод А строит пассажирские самолеты: " + p);
	}
}
