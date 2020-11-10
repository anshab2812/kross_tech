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
			System.out.println("Время установлено!");
		}
		else throw new Exception ("Время должно быть от 0 до 35 минут!");
		}
		catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetMode (String mode) {
		this.mode = mode;
		System.out.println("Мощность установлена!");
	}
	public void State_On () {
		if ((time != -1)&&(mode != "")) {
			state = true;
			System.out.println("Микроволновка включена!");
		}
		else System.out.println("Нельзя включить устройство не задав мощность и время!");
	}
	public void State_Off () {
		state = false;
		System.out.println("Микроволновка выключена!");
	}
	public void Timer_Off() {
		timer = false;
		timer_time = "";
		System.out.println("Таймер выключен!");
	}
	public void Timer (String timme) {
		timer = true;
		timer_time = timme;
		System.out.println("Таймер установлен!");
	}
	public void GetPrint(int number) {
		System.out.println("Микроволновка "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		if (time == -1)
			System.out.println("Время готовки не задано!");
		else
			System.out.println("Время готовки: "+ time + " минут");
		if (mode == "") 
			System.out.println("Мощность не задана!");
		else
			System.out.println("Мощность: "+ mode);
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}

}
