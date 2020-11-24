package labwork5_22;

public class ProxyCheck implements Money {
	private BankCheck bank;
	private int money;
	public ProxyCheck(int money) {
		this.money = money;
	}
	@Override
	public void buy(int cost) {
		if (bank==null) {
			bank = new BankCheck(money);
		}
		bank.buy(cost);
	}
}
