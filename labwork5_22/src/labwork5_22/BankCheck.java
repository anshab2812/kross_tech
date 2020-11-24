package labwork5_22;

public class BankCheck implements Money {
	private int money;
	public BankCheck(int money) {
		this.money = money;
		getCheck(money);
	}
	@Override
	public void buy(int cost) {
		if (cost<money) {
			System.out.println("Покупка совершена!");
			money = money - cost;
		}
		else 
			System.out.println("Недостаточко средств!");
	}
	public void getCheck(int money) {
		System.out.println("Выписан чек на сумму " + money + "$");
	}

}
