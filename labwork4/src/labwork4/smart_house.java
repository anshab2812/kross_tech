package labwork4;

//import java.lang.*;
import java.util.*;

public class smart_house {
	private oven[] _oven = new oven[2];
	private microwave[] micro = new microwave[2];
	private multicooker[] multi = new multicooker[2];
	private fridge[] fri = new fridge[2];
	private kettle[] ket = new kettle[2];
	private Scanner in = new Scanner(System.in);
	public void Addnew() 
	{
		System.out.println("�������� ���������� ��� ����������:");
		String name = device();
		int p;
		try {
			switch (name) {
			case "�������": {
				p=Onull(_oven);
				if(p!=3) {
					inputO(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");		
				break;
				}
			case "�������������": {
				p=Minull(micro);
				if(p!=3) {
					inputMi(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "�����������": {
				p=Munull(multi);
				if(p!=3) {
					inputMu(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "�����������":{
				p=Fnull(fri);
				if(p!=3) {
					inputFri(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			case "�������������":{
				p=Knull(ket);
				if(p!=3) {
					inputK(p);
				}	else System.out.println("��� �� �������� ����� ���������� ������� ������!");
				break;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void Delete()  {
		int p,d;
		try{
			System.out.println("�������� ���������� ��� ��������");
			String name  = device();
			switch(name) {
				case "�������": {
				p=Onull(_oven);
				if((_oven[0]==null)&&(_oven[1]==null)) System.out.println("��� ��������� ��� ��������! ");
				else {
					if(p==3) {
						for(int i=0;i<_oven.length;i++)
							_oven[i].GetPrint(i+1);
					} else _oven[p-1].GetPrint(p);	
					System.out.println("������� ����� ���������� ��� ��������: ");
					d=in.nextInt();
					_oven[d-1] = null;
				}
				break;
				}
				case "�������������": {
					p=Minull(micro);
					if((micro[0]==null)&&(micro[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<micro.length;i++)
								micro[i].GetPrint(i+1);
						} else micro[p-1].GetPrint(p);	
						System.out.println("������� ����� ���������� ��� ��������: ");
						d=in.nextInt();
						micro[d-1] = null;
					}
				break;
				}
				case "�����������": {
					p=Munull(multi);
					if((multi[0]==null)&&(multi[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<multi.length;i++)
								multi[i].GetPrint(i+1);
						} else multi[p-1].GetPrint(p);	
						System.out.println("������� ����� ���������� ��� ��������: ");
						d=in.nextInt();
						multi[d-1] = null;
					}
				break;
				}
				case "�����������":{
					p=Fnull(fri);
					if((fri[0]==null)&&(fri[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<fri.length;i++)
								fri[i].GetPrint(i+1);
						} else fri[p-1].GetPrint(p);	
						System.out.println("������� ����� ���������� ��� ��������: ");
						d=in.nextInt();
						fri[d-1] = null;
					}
				break;
				}
				case "�������������":{
					p=Knull(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("��� ��������� ��� ��������! ");
					else {
						if(p==3) {
							for(int i=0;i<fri.length;i++)
								ket[i].GetPrint(i+1);
						} else ket[p-1].GetPrint(p);	
						System.out.println("������� ����� ���������� ��� ��������: ");
						d=in.nextInt();
						ket[d-1] = null;
					}
				break;
				}
			}
		} catch (Exception e) { System.out.println(e.getMessage());}
	}
	public void Change() {
		int p,d;
		try{
			System.out.println("�������� ���������� ��� ���������");
			String name  = device();
			switch(name) {
				case "�������": {
				p=Onull(_oven);
				if((_oven[0]==null)&&(_oven[1]==null)) System.out.println("��� ��������� ��� ���������! ");
				else {
					if(p==3) {
						for(int i=0;i<_oven.length;i++)
							_oven[i].GetPrint(i+1);
					} else _oven[p-1].GetPrint(p);	
					System.out.println("������� ����� ���������� ��� ���������: ");
					d=in.nextInt();
					inputO(d-1);
				}
				break;
				}
				case "�������������": {
					p=Minull(micro);
					if((micro[0]==null)&&(micro[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<micro.length;i++)
								micro[i].GetPrint(i+1);
						} else micro[p-1].GetPrint(p);	
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputMi(d-1);
					}
				break;
				}
				case "�����������": {
					p=Munull(multi);
					if((multi[0]==null)&&(multi[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<multi.length;i++)
								multi[i].GetPrint(i+1);
						} else multi[p-1].GetPrint(p);	
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputMu(d-1);
					}
				break;
				}
				case "�����������":{
					p=Fnull(fri);
					if((fri[0]==null)&&(fri[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<fri.length;i++)
								fri[i].GetPrint(i+1);
						} else fri[p-1].GetPrint(p);	
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputFri(d-1);
					}
				break;
				}
				case "�������������":{
					p=Knull(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("��� ��������� ��� ���������! ");
					else {
						if(p==3) {
							for(int i=0;i<fri.length;i++)
								ket[i].GetPrint(i+1);
						} else ket[p-1].GetPrint(p);	
						System.out.println("������� ����� ���������� ��� ���������: ");
						d=in.nextInt();
						inputK(d-1);
					}
				break;
				}
			}
		} catch (Exception e) { System.out.println(e.getMessage());}
	}
	public void ShowAll() {
		int k = Onull(_oven);
		if((_oven[0]!=null)||(_oven[1]!=null)) {
			if (k==3) {
				for(int i=0;i<_oven.length;i++)
					_oven[i].GetPrint(i+1);
			} else if(k==-2)_oven[1].GetPrint(2);
			else _oven[k-1].GetPrint(k);
		}else System.out.println("��� ��������� �������!");
		k=Minull(micro);
		if((micro[0]!=null)||(micro[1]!=null)) {
			if (k==3) {
				for(int i=0;i<micro.length;i++)
					micro[i].GetPrint(i+1);
			} else if(k==-2)micro[1].GetPrint(2);
			else micro[k-1].GetPrint(k);
		}else System.out.println("��� ��������� �������������!");
		k=Munull(multi);
		if((multi[0]!=null)||(multi[1]!=null)) {
			if (k==3) {
				for(int i=0;i<multi.length;i++)
					multi[i].GetPrint(i+1);
			} else if(k==-2)multi[1].GetPrint(2);
			else multi[k-1].GetPrint(k);
		}else System.out.println("��� ��������� �����������!");
		k=Fnull(fri);
		if((fri[0]!=null)||(fri[1]!=null)) {
			if (k==3) {
				for(int i=0;i<fri.length;i++)
					fri[i].GetPrint(i+1);
			} else if(k==-2)fri[1].GetPrint(2);
			else fri[k-1].GetPrint(k);
		}else System.out.println("��� ��������� �������������!");
		k=Knull(ket);
		if((ket[0]!=null)||(ket[1]!=null)) {
			if (k==3) {
				for(int i=0;i<ket.length;i++)
					ket[i].GetPrint(i+1);
			} else if(k==-2)ket[1].GetPrint(2);
			else ket[k-1].GetPrint(k);
		}else System.out.println("��� ��������� ��������!");
	}
	private String device () {
		while(true) {
			System.out.print("1. �������"
					+ "\n2. �������������"
					+ "\n3. �����������"
					+ "\n4. �����������"
					+ "\n5. �������������\n");
			int d = in.nextInt();
			switch (d) {
			case 1: return "�������";
			case 2: return "�������������";
			case 3:return "�����������";
			case 4: return "�����������";
			case 5: return "�������������";
			default: 
			}
		}
		
	}
	private void inputO(int p) throws Exception {
		int d;
		try{
			System.out.println(" ������� ");
			_oven[p] = new oven();
			System.out.print("������� ����������� �������: ");
			d = in.nextInt();
			_oven[p].SetTemperature(d);
			System.out.print("������� ����� ������� � �������: ");
			d = in.nextInt();
			_oven[p].SetTime(d);
			System.out.print("�������� ����� �������:"
					+ "\n1. ����"
					+ "\n2. ���"
					+ "\n3. ���� + ���"
					+ "\n4. ���������"
					+ "\n5. ���� + ��� + ���������\n");
			d = in.nextInt();
			switch (d) {
			case 1: _oven[p].SetMode("����"); break;
			case 2: _oven[p].SetMode("���"); break;
			case 3: _oven[p].SetMode("���� + ���"); break;
			case 4: _oven[p].SetMode("���������"); break;
			case 5: _oven[p].SetMode("���� + ��� + ���������"); break;
			default: _oven[p].SetMode("���� + ���"); break;
			}
			System.out.print("���������� ������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("������� �����: ");
				_oven[p].Timer(in.next());
			}
			System.out.print("�������� ����������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if (d==1) _oven[p].State_On();
			else _oven[p].State_Off();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputFri(int p) throws Exception {
		int d;
		try{
			System.out.println(" ����������� ");
			fri[p] = new fridge();
			System.out.print("������� ����������� ������� ������: ");
			d = in.nextInt();
			fri[p].SetTempTop(d);
			System.out.print("������� ����������� ������ ������: ");
			d = in.nextInt();
			fri[p].SetTempBot(d);
			System.out.print("�������� �����:"
					+ "\n1. ������� ���������"
					+ "\n2. ����� (�������� ����������� ��������������)"
					+ "\n3. ��� ������\n");
			d = in.nextInt();
			switch (d) {
			case 1: fri[p].SetMode("������� ���������"); break;
			case 2: fri[p].SetMode("�����"); break;
			case 3: fri[p].SetMode("��� ������"); break;
			default: fri[p].SetMode("��� ������"); break;
			}
			System.out.print("���������� ������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("������� �����: ");
				fri[p].Timer(in.next());
			}
			System.out.print("�������� ����������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if (d==1) fri[p].State_On();
			else fri[p].State_Off();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputMu(int p) throws Exception {
		int d, k;
		try{
			System.out.println(" ����������� ");
			multi[p] = new multicooker();
			System.out.print("������� ����� ������� � ����� (�� 0 �� 4): ");
			d = in.nextInt();
			System.out.print("������� ����� ������� � ������� (�� 1 �� 59): ");
			k = in.nextInt();
			multi[p].SetTime(d,k);
			System.out.print("�������� ����� �������:"
					+ "\n1. ������"
					+ "\n2. ������"
					+ "\n3. �� ����"
					+ "\n4. ����"
					+ "\n5. ���������"
					+ "\n6. ���/�����"
					+ "\n7. ���"
					+ "\n8. ������\n");
			d = in.nextInt();
			switch (d) {
			case 1: multi[p].SetMode("������"); break;
			case 2: multi[p].SetMode("������"); break;
			case 3: multi[p].SetMode("�� ����"); break;
			case 4: multi[p].SetMode("����"); break;
			case 5: multi[p].SetMode("���������"); break;
			case 6: multi[p].SetMode("���/�����"); break;
			case 7: multi[p].SetMode("���"); break;
			case 8: multi[p].SetMode("������"); break;
			default: multi[p].SetMode("���������"); break;
			}
			System.out.print("���������� ������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("������� �����: ");
				multi[p].Timer(in.next());
			}
			System.out.print("�������� ����������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if (d==1) multi[p].State_On();
			else multi[p].State_Off();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputK(int p) throws Exception {
		int d;
		try{
			System.out.println(" ������������� ");
			ket[p] = new kettle();
			System.out.print("��������� ������: 1. �������, 2. �������");
			d = in.nextInt();
			if (d==2) ket[p].CloseCap(); 
			else {
				ket[p].OpenCap();
				System.out.print("������ ������� ������? 1. ��, 2. ���");
				d = in.nextInt();
				if(d==1) ket[p].CloseCap();
			}
			System.out.print("���������� ������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("������� �����: ");
				ket[p].Timer(in.next());
			}
			System.out.print("�������� ����������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if (d==1) ket[p].State_On();
			else ket[p].State_Off();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private void inputMi(int p) throws Exception {
		int d;
		try{
			System.out.println(" ������������� ");
			micro[p] = new microwave();
			System.out.print("������� ����� ������� � �������: ");
			d = in.nextInt();
			micro[p].SetTime(d);
			System.out.print("�������� ��������:"
					+ "\n1. �����������"
					+ "\n2. ������ (����������)"
					+ "\n3. �������"
					+ "\n4. �������"
					+ "\n5. ������������\n");
			d = in.nextInt();
			switch (d) {
			case 1: micro[p].SetMode("�����������"); break;
			case 2: micro[p].SetMode("������ (����������)"); break;
			case 3: micro[p].SetMode("�������"); break;
			case 4: micro[p].SetMode("�������"); break;
			case 5: micro[p].SetMode("������������"); break;
			default: micro[p].SetMode("�������"); break;
			}
			System.out.print("���������� ������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("������� �����: ");
				micro[p].Timer(in.next());
			}
			System.out.print("�������� ����������? 1. ��, 2. ��� ");
			d = in.nextInt();
			if (d==1) micro[p].State_On();
			else micro[p].State_Off();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private int Onull(oven[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		} 
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int Minull(microwave[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int Munull(multicooker[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int Fnull(fridge[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}
	private int Knull(kettle[] mas) {
		int k=-1;
		for(int i=0; i<mas.length;i++) {
			if(mas[i]==null) {k=i; break;}
		}
		if((mas[0]==null)&&(mas[1]!=null)) k=-2;
		if((mas[0]!=null)&&(mas[1]!=null)) k=3;
		return k;
	}

}

interface Devices {
	void Timer (String time);
	void Timer_Off ();
	void State_On ();
	void State_Off ();
}
