package labwork5_21;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		AbstractFactory planeFactory = FactoryProducer.getFactory("Plane");
		Plane plane1 = planeFactory.getPlane("Passenger");
		AbstractFactory plantFactory = FactoryProducer.getFactory("Plant");
		Plant plantA = plantFactory.getPlant("A");
		plantA.build(plane1.fly());
		Plane plane2 = planeFactory.getPlane("Fighter");
		Plant plantB = plantFactory.getPlant("B");
		plantB.build(plane2.fly());
		Plane plane3 = planeFactory.getPlane("Sports");
		Plant plantC = plantFactory.getPlant("C");
		plantC.build(plane3.fly());
	}
}
