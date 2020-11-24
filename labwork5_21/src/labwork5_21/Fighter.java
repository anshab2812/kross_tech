package labwork5_21;

public class Fighter implements Plane {

	private String planes;
	public Fighter() {
		planes = "ÌèÃ-29, F-22 Raptor, TF-15A \n";
	}
	@Override
	public String fly() {
		return planes;
	}
}
