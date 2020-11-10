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
				System.out.println("Время установлено!");
			}
			else throw new Exception ("Часы от 0 до 4, минуты от 1 до 59!");
		}
		catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetMode (String mode) {
		this.mode = mode;
		System.out.println("Режим установлен!");
	}
	public void State_On () {
		if ((hour != -1)&&(min != -1)&&(mode != "")) {
			state = true;
			System.out.println("Мультиварка включена!");
		}
		else System.out.println("Нельзя включить устройство не задав режим и время!");
	}
	public void State_Off () {
		state = false;
		System.out.println("Мультиварка выключена!");
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
		System.out.println("Мультиварка "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		if ((hour == -1)&&(min==-1))
			System.out.println("Время готовки не задано!");
		else
			System.out.println("Время готовки: "+ hour + ":" + min);
		if (mode == "") 
			System.out.println("Режим готовки не задан!");
		else
			System.out.println("Режим готовки: "+ mode);
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}

}
