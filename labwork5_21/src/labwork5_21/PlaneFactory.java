package labwork5_21;

public class PlaneFactory extends AbstractFactory{
	@Override
	public Plane getPlane(String planeType) {
		if (planeType.equalsIgnoreCase("PASSENGER")) {
			return new Passenger();
		}
		else if (planeType.equalsIgnoreCase("FIGHTER")) {
			return new Fighter();
		}
		else if (planeType.equalsIgnoreCase("SPORTS")) {
			return new Sports();
		}
		return null;
	}
	@Override
	public Plant getPlant(String plant) {
		return null;
	}
}
