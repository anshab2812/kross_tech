package labwork5_23;

public class School extends BuildProject {
	private String color, carcass, found, wire, plumb;
	private int floars;
	
	public School() {
		color = "�����";
		carcass ="��������";
		found = "���������";
		wire = "�������";
		plumb = "���������������-�����������";
		floars = 4;
	}
	@Override
	public void getFloars() {
		System.out.println("���������� ������: " + floars);
	}
	@Override
	public void getColor() {
		System.out.println("���� ������: " + color);
	}
	@Override
	public void getFoundation() {
		System.out.println("��������� ������: " + found);
	}
	@Override
	public void getCarcassF() {
		System.out.println("������ �����: " + carcass);
	}
	@Override
	public void getWiring() {
		System.out.println("���������������: " + wire);
	}
	@Override
	public void getPlumbing() {
		System.out.println("����������: " + plumb);
	}

}
