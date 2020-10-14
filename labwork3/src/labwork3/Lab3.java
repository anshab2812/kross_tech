package labwork3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import labwork3lib.Lab3lib;

public class Lab3 {

	public static void main (String args[ ]) throws IOException
	{
		int i;
		FileInputStream fin;
		List<Integer> list;
		if (args.length == 0) {
			System.out.println("������� ���� � �����");
			return;
		}
		try {
			fin = new FileInputStream(args[0]);
			list = new ArrayList<Integer>();
			do {
				i = fin.read();
				if (i!=-1) {
					list.add(i);
				}
			} while (i != -1);
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println ("���� ��� ����� �� ������");
			return;
		} catch (IOException e) {
		System.out.println ("������ �����");
		return;
		}
		Lab3lib lab = new Lab3lib();
		System.out.println("������������ ��������: " + lab.DynRange(list));
		System.out.println("�������: " + lab.Energy(list));
		System.out.println("������� ��������: " + lab.AvgPower(list));
		System.out.println("������� ��������: " + lab.AvgSamples(list));
		System.out.println("���������: " + lab.Dispersion(list));
		System.out.println("�������� ����������: " + lab.CorrelInterval(list));
		for(int t = -3; t <= 3; t++)
        {
            System.out.println("��������������(" + t + "): " + lab.AutoCorrel(list, t));
        }
	}
}
