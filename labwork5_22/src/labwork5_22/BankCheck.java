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
			System.out.println("������� ���������!");
			money = money - cost;
		}
		else 
			System.out.println("������������ �������!");
	}
	public void getCheck(int money) {
		System.out.println("������� ��� �� ����� " + money + "$");
	}

}
