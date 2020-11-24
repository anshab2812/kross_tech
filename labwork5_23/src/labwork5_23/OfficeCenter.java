package labwork5_23;

public class OfficeCenter extends BuildProject {
	private String color, carcass, found, wire, plumb;
	private int floars;
	
	public OfficeCenter() {
		color = "Черный";
		carcass ="Бетонный";
		found = "Плитный";
		wire = "Скрытая";
		plumb = "Паралельная";
		floars = 7;
	}
	@Override
	public void getFloars() {
		System.out.println("Количество этажей: " + floars);
	}
	@Override
	public void getColor() {
		System.out.println("Цвет здания: " + color);
	}
	@Override
	public void getFoundation() {
		System.out.println("Фундамент здания: " + found);
	}
	@Override
	public void getCarcassF() {
		System.out.println("Каркас этажа: " + carcass);
	}
	@Override
	public void getWiring() {
		System.out.println("Электропроводка: " + wire);
	}
	@Override
	public void getPlumbing() {
		System.out.println("Сантехника: " + plumb);
	}

}
