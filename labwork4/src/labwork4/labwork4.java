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
 			System.out.println("����:"
 					+ "\n1. �������� ���-��"
 					+ "\n2. ������� ���-��"
 					+ "\n3. �������� ���-��\n");
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
