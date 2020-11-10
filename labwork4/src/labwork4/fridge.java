package labwork4;

public class fridge implements Devices {
	private boolean state;
	private boolean timer;
	private String timer_time;
	private int Ttop, Tbot;
	private String mode;
	public fridge() {
		timer = false;
		state = false;
		Ttop=-1;
		Tbot=0;
		timer_time = "";
		mode = "";
	}
	public fridge(int Ttop, int Tbot) throws Exception {
		SetTempTop(Ttop);
		SetTempBot(Tbot);
	}
	public void SetTempTop(int temp) throws Exception {
		try {
			if((temp>=0)&&(temp<=20)) {
				Ttop = temp;
				System.out.println("����������� � ������� ������ �����������!");
			}
			else throw new Exception("����������� � ������� ������ ������ ���� �� 0 �� 20!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetTempBot(int temp) throws Exception {
		try {
			if((temp<=-1)&&(temp>=-20)) {
				Tbot = temp;
				System.out.println("����������� � ������ ������ �����������!");
			}
			else throw new Exception("����������� � ������ ������ ������ ���� �� -1 �� -20!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetMode (String mode) {
		this.mode = mode;
	}
	public void State_On () {
		state = true;
		System.out.println("����������� �������!");
	}
	public void State_Off () {
		state = false;
		System.out.println("����������� ��������!");
	}
	public void Timer_Off() {
		timer = false;
		timer_time = "";
		System.out.println("������ ��������!");
	}
	public void Timer (String timme) {
		timer = true;
		timer_time = timme;
		System.out.println("������ ����������!");
	}
	public void GetPrint(int number) {
		System.out.println("����������� "+ number);
		System.out.println("���������: " + ((state)?"ON":"OFF"));
		if ((Ttop == -1))
			System.out.println("����������� � ������� ������ �� ������!");
		else
			System.out.println("����������� ������� ������: "+ Ttop +" ��������");
		if (Tbot == 0) 
			System.out.println("����������� � ������ ������ �� ������!");
		else
			System.out.println("����������� ������� ������: "+ Tbot +" ��������");
		System.out.println("����� ������: "+ mode);
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
