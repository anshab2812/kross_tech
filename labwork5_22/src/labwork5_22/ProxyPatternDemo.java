package labwork5_22;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Money money = new ProxyCheck(500);
		money.buy(150);
		System.out.println();
		money.buy(400);
	}
}
