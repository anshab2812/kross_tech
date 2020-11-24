package labwork5_21;

public class Sports implements Plane{

	private String planes;
	public Sports() {
		planes = "Extra EA-300, Cy-26M, як-52 \n";
	}
	@Override
	public String fly() {
		return planes;
	}
}
