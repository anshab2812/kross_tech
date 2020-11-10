package labwork4;

//import java.lang.*;

public class oven implements Devices {
	private boolean state;
	private boolean timer;
	private String timer_time;
	private int time;
	private int temperature;
	private String mode;
	public oven() {
		timer = false;
		state = false;
		time = -1;
		timer_time = "";
		temperature = -1;
		mode = "";
	}
	public oven (int temperature, String mode,  int time) throws Exception  {
		SetTemperature(temperature);
		SetTime(time);
		SetMode(mode);
	}
	public void SetTemperature(int temperature)throws Exception  {
		try {
			if ((temperature<900)&&(temperature>100)) {
				this.temperature = temperature;
				System.out.println("����������� �����������!");
			}
			else throw new Exception ("����������� ������ ���� �� 100 �� 300 ��������!");
		}
		catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetTime(int time) throws Exception {
		try {
		if ((time>0)&&(time<90)) {
			this.time = time;
			System.out.println("����� �����������!");
		}
		else throw new Exception ("����� ������ ���� �� 0 �� 90 �����!");
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
		if ((time != -1)&&(temperature != -1)&&(mode != "")) {
			state = true;
			System.out.println("������� ��������!");
		}
		else System.out.println("������ �������� ���������� �� ����� �����, ����������� � �����!");
	}
	public void State_Off () {
		state = false;
		System.out.println("������� ���������!");
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
		System.out.println("������� "+ number);
		System.out.println("���������: " + ((state)?"ON":"OFF"));
		if (temperature == -1)
			System.out.println("����������� ������� �� ������! ");
		else
			System.out.println("����������� �������: "+ temperature + " ��������");
		if (time == -1)
			System.out.println("����� ������� �� ������!");
		else
			System.out.println("����� �������: "+ time + " �����");
		if (mode == "") 
			System.out.println("����� ������ �� �����!");
		else
			System.out.println("����� ������: "+ mode);
		if(timer)
			System.out.println("������ �� "+ timer_time);
		else System.out.println("��������� �������: "+ ((timer)?"ON":"OFF"));
	}

}
