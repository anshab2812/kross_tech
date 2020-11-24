package labwork5_21;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choise) {
		if (choise.equalsIgnoreCase("PLANE")) {
			return new PlaneFactory();
		}
		else if (choise.equalsIgnoreCase("PLANT")) {
			return new PlantFactory();
		}
		return null;
	}

}
