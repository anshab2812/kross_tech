package labwork4;

public class kettle {
	private boolean state;
	private boolean open;
	private boolean timer;
	String timer_time;
	public kettle() {
		open=false;
	}
	public void OpenCap() {
		open=true;
		System.out.println("������ �������!");
	}
	public void CloseCap() {
		open=false;
		System.out.println("������ �������!");
	}
	public void State_On () {
		if ((!open)) {
			state = true;
			System.out.println("������ �������!");
		}
		else System.out.println("������ �������� ���������� �� ������ ������!");
	}
	public void State_Off () {
		state = false;
		System.out.println("������ ��������!");
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
		System.out.println("������������� "+ number);
		System.out.println("���������: " + ((state)?"ON":"OFF"));
		System.out.println("��������� ������:" + ((open)?"Open":"Closed"));
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
