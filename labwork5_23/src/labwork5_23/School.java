package labwork5_23;

public class School extends BuildProject {
	private String color, carcass, found, wire, plumb;
	private int floars;
	
	public School() {
		color = "Белый";
		carcass ="Железный";
		found = "Ленточный";
		wire = "Скрытая";
		plumb = "Последовательно-паралельная";
		floars = 4;
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
