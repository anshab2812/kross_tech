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
			System.out.println("”кажите путь к файлу");
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
			System.out.println ("‘айл дл€ ввода не найден");
			return;
		} catch (IOException e) {
		System.out.println ("ќшибка файла");
		return;
		}
		Lab3lib lab = new Lab3lib();
		System.out.println("ƒинамический диапазон: " + lab.DynRange(list));
		System.out.println("Ёнерги€: " + lab.Energy(list));
		System.out.println("—редн€€ мощность: " + lab.AvgPower(list));
		System.out.println("—реднее значение: " + lab.AvgSamples(list));
		System.out.println("ƒисперси€: " + lab.Dispersion(list));
		System.out.println("»нтервал коррел€ции: " + lab.CorrelInterval(list));
		for(int t = -3; t <= 3; t++)
        {
            System.out.println("јвтокоррел€ци€(" + t + "): " + lab.AutoCorrel(list, t));
        }
	}
}
