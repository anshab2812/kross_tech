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
		System.out.println("Крышка открыта!");
	}
	public void CloseCap() {
		open=false;
		System.out.println("Крышка закрыта!");
	}
	public void State_On () {
		if ((!open)) {
			state = true;
			System.out.println("Чайник включен!");
		}
		else System.out.println("Нельзя включить устройство не закрыв крышку!");
	}
	public void State_Off () {
		state = false;
		System.out.println("Чайник выключен!");
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
		System.out.println("Электрочайник "+ number);
		System.out.println("Состояние: " + ((state)?"ON":"OFF"));
		System.out.println("Состояние крышки:" + ((open)?"Open":"Closed"));
		if(timer)
			System.out.println("Таймер на "+ timer_time);
		else System.out.println("Состояние таймера: "+ ((timer)?"ON":"OFF"));
	}

}
