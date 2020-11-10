package labwork4;

import java.util.Scanner;

public class labwork4 {

	public static void main (String args[ ]) {
 		smart_house smart = new smart_house();
 		Scanner in = new Scanner(System.in);
 		int d;
 		smart.Addnew();
		smart.Addnew();
		smart.Addnew();
		smart.Addnew();
		smart.Addnew();
 		while(true) {
 			System.out.println("Меню:"
 					+ "\n1. Добавить уст-во"
 					+ "\n2. Удалить уст-во"
 					+ "\n3. Изменить уст-во\n");
 			d = in.nextInt();
 			switch (d) {
 			case 1: {
 				smart.Addnew();
 				smart.ShowAll();
 				break;
 			}
 			case 2: {
 				smart.Delete();
 				smart.ShowAll();
 				break;
 			}
 			case 3: {
 				smart.Change(); 
 				smart.ShowAll();
 				break;
 			}
 				
 			}
 		}
	}

}
