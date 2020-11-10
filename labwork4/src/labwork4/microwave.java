package labwork4;

public class microwave implements Devices {
	private boolean state;
	private boolean timer;
	private String timer_time;
	private int time;
	private String mode;
	public microwave() {
		timer = false;
		state = false;
		time = -1;
		timer_time = "";
		mode = "";
	}
	public microwave(String mode, int time)throws Exception {
		SetTime(time);
		SetMode(mode);
	}
	public void SetTime(int time) throws Exception {
		try {
		if ((time>0)&&(time<35)) {
			this.time = time;
			System.out.println("����� �����������!");
		}
		else throw new Exception ("����� ������ ���� �� 0 �� 35 �����!");
		}
		catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetMode (String mode) {
		this.mode = mode;
		System.out.println("�������� �����������!");
	}
	public void State_On () {
		if ((time != -1)&&(mode != "")) {
			state = true;
			System.out.println("������������� ��������!");
		}
		else System.out.println("������ �������� ���������� �� ����� �������� � �����!");
	}
	public void State_Off () {
		state = false;
		System.out.println("������������� ���������!");
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
		if (time == -1)
			System.out.println("����� ������� �� ������!");
		else
			System.out.println("����� �������: "+ time + " �����");
		if (mode == "") 
			System.out.println("�������� �� ������!");
		else
			System.out.println("��������: "+ mode);
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
