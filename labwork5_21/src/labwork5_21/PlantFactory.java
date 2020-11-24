package labwork5_21;

public class PlantFactory extends AbstractFactory{
	@Override
	public Plane getPlane(String plane) {
		return null;
	}
	@Override
	public Plant getPlant(String plantType) {
		if (plantType.equalsIgnoreCase("A")) {
			return new PlantA();
		}
		else if (plantType.equalsIgnoreCase("B")) {
			return new PlantB();
		}
		else if (plantType.equalsIgnoreCase("C")) {
			return new PlantC();
		}
		return null;
	}
}
