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
				System.out.println("Температура в верхней камере установлена!");
			}
			else throw new Exception("Температура в верхней камере должна быть от 0 до 20!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetTempBot(int temp) throws Exception {
		try {
			if((temp<=-1)&&(temp>=-20)) {
				Tbot = temp;
				System.out.println("Температура в нижней камере установлена!");
			}
			else throw new Exception("Температура в нижней камере должна быть от -1 до -20!");
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetMode (String mode) {
		this.mode = mode;
	}
	public void State_On () {
		state = true;
		System.out.println("Холодильник включен!");
	}
	public void State_Off () {
		state = false;
		System.out.println("Холодильник выключен!");
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
		System.out.println("Холодильник "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		if ((Ttop == -1))
			System.out.println("Температура в верхней камере не задана!");
		else
			System.out.println("Температура верхней камеры: "+ Ttop +" градусов");
		if (Tbot == 0) 
			System.out.println("Температура в нижней камере не задана!");
		else
			System.out.println("Температура верхней камеры: "+ Tbot +" градусов");
		System.out.println("Режим работы: "+ mode);
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}

}
