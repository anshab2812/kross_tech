package labwork5_21;

public class Passenger implements Plane{

	private String planes;
	public Passenger() {
		planes = "A320, Boeng 737, MC-21 \n";
	}
	@Override
	public String fly() {
		return planes;
	}
}

