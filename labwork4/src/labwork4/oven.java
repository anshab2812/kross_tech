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
				System.out.println("Температура установлена!");
			}
			else throw new Exception ("Температура должна быть от 100 до 300 градусов!");
		}
		catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public void SetTime(int time) throws Exception {
		try {
		if ((time>0)&&(time<90)) {
			this.time = time;
			System.out.println("Время установлено!");
		}
		else throw new Exception ("Время должно быть от 0 до 90 минут!");
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
		if ((time != -1)&&(temperature != -1)&&(mode != "")) {
			state = true;
			System.out.println("Духовка включена!");
		}
		else System.out.println("Нельзя включить устройство не задав режим, температуру и время!");
	}
	public void State_Off () {
		state = false;
		System.out.println("Духовка выключена!");
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
		System.out.println("Духовка "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		if (temperature == -1)
			System.out.println("Температура готовки не задана! ");
		else
			System.out.println("Температура готовки: "+ temperature + " градусов");
		if (time == -1)
			System.out.println("Время готовки не задано!");
		else
			System.out.println("Время готовки: "+ time + " минут");
		if (mode == "") 
			System.out.println("Режим работы не задан!");
		else
			System.out.println("Режим работы: "+ mode);
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}

}
