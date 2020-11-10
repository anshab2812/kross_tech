package labwork4;

public class multicooker implements Devices {
	private boolean state;
	private boolean timer;
	private String timer_time;
	private int hour, min;
	private String mode;
	public multicooker() {
		timer = false;
		state = false;
		hour=-1;
		min=-1;
		timer_time = "";
		mode = "";
	}
	public multicooker(String mode, int hour, int min) throws Exception {
		SetMode(mode);
		SetTime(hour, min);
	}
	public void SetTime(int hour, int min) throws Exception {
		try {
			if ((hour>=0)&&(hour<4)&&(min>0)&&(min<=59)) {
				this.hour = hour;
				this.min = min;
				System.out.println("����� �����������!");
			}
			else throw new Exception ("���� �� 0 �� 4, ������ �� 1 �� 59!");
		}
		catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetMode (String mode) {
		this.mode = mode;
		System.out.println("����� ����������!");
	}
	public void State_On () {
		if ((hour != -1)&&(min != -1)&&(mode != "")) {
			state = true;
			System.out.println("����������� ��������!");
		}
		else System.out.println("������ �������� ���������� �� ����� ����� � �����!");
	}
	public void State_Off () {
		state = false;
		System.out.println("����������� ���������!");
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
		if ((hour == -1)&&(min==-1))
			System.out.println("����� ������� �� ������!");
		else
			System.out.println("����� �������: "+ hour + ":" + min);
		if (mode == "") 
			System.out.println("����� ������� �� �����!");
		else
			System.out.println("����� �������: "+ mode);
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
