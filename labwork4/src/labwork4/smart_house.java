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
		System.out.println("Выберите устройство для добавления:");
		String name = device();
		int p;
		try {
			switch (name) {
			case "Духовка": {
				p=Onull(_oven);
				if(p!=3) {
					inputO(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");		
				break;
				}
			case "Микроволновка": {
				p=Minull(micro);
				if(p!=3) {
					inputMi(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");
				break;
				}
			case "Мультиварка": {
				p=Munull(multi);
				if(p!=3) {
					inputMu(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");
				break;
				}
			case "Холодильник":{
				p=Fnull(fri);
				if(p!=3) {
					inputFri(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");
				break;
				}
			case "Электрочайник":{
				p=Knull(ket);
				if(p!=3) {
					inputK(p);
				}	else System.out.println("Что бы добавить новое устройство удалите старое!");
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
			System.out.println("Выберите устройство для удаления");
			String name  = device();
			switch(name) {
				case "Духовка": {
				p=Onull(_oven);
				if((_oven[0]==null)&&(_oven[1]==null)) System.out.println("Нет устройств для удаления! ");
				else {
					if(p==3) {
						for(int i=0;i<_oven.length;i++)
							_oven[i].GetPrint(i+1);
					} else _oven[p-1].GetPrint(p);	
					System.out.println("Введите номер устройства для удаления: ");
					d=in.nextInt();
					_oven[d-1] = null;
				}
				break;
				}
				case "Микроволновка": {
					p=Minull(micro);
					if((micro[0]==null)&&(micro[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<micro.length;i++)
								micro[i].GetPrint(i+1);
						} else micro[p-1].GetPrint(p);	
						System.out.println("Введите номер устройства для удаления: ");
						d=in.nextInt();
						micro[d-1] = null;
					}
				break;
				}
				case "Мультиварка": {
					p=Munull(multi);
					if((multi[0]==null)&&(multi[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<multi.length;i++)
								multi[i].GetPrint(i+1);
						} else multi[p-1].GetPrint(p);	
						System.out.println("Введите номер устройства для удаления: ");
						d=in.nextInt();
						multi[d-1] = null;
					}
				break;
				}
				case "Холодильник":{
					p=Fnull(fri);
					if((fri[0]==null)&&(fri[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<fri.length;i++)
								fri[i].GetPrint(i+1);
						} else fri[p-1].GetPrint(p);	
						System.out.println("Введите номер устройства для удаления: ");
						d=in.nextInt();
						fri[d-1] = null;
					}
				break;
				}
				case "Электрочайник":{
					p=Knull(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("Нет устройств для удаления! ");
					else {
						if(p==3) {
							for(int i=0;i<fri.length;i++)
								ket[i].GetPrint(i+1);
						} else ket[p-1].GetPrint(p);	
						System.out.println("Введите номер устройства для удаления: ");
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
			System.out.println("Выберите устройство для изменения");
			String name  = device();
			switch(name) {
				case "Духовка": {
				p=Onull(_oven);
				if((_oven[0]==null)&&(_oven[1]==null)) System.out.println("Нет устройств для изменения! ");
				else {
					if(p==3) {
						for(int i=0;i<_oven.length;i++)
							_oven[i].GetPrint(i+1);
					} else _oven[p-1].GetPrint(p);	
					System.out.println("Введите номер устройства для изменения: ");
					d=in.nextInt();
					inputO(d-1);
				}
				break;
				}
				case "Микроволновка": {
					p=Minull(micro);
					if((micro[0]==null)&&(micro[1]==null)) System.out.println("Нет устройств для изменения! ");
					else {
						if(p==3) {
							for(int i=0;i<micro.length;i++)
								micro[i].GetPrint(i+1);
						} else micro[p-1].GetPrint(p);	
						System.out.println("Введите номер устройства для изменения: ");
						d=in.nextInt();
						inputMi(d-1);
					}
				break;
				}
				case "Мультиварка": {
					p=Munull(multi);
					if((multi[0]==null)&&(multi[1]==null)) System.out.println("Нет устройств для изменения! ");
					else {
						if(p==3) {
							for(int i=0;i<multi.length;i++)
								multi[i].GetPrint(i+1);
						} else multi[p-1].GetPrint(p);	
						System.out.println("Введите номер устройства для изменения: ");
						d=in.nextInt();
						inputMu(d-1);
					}
				break;
				}
				case "Холодильник":{
					p=Fnull(fri);
					if((fri[0]==null)&&(fri[1]==null)) System.out.println("Нет устройств для изменения! ");
					else {
						if(p==3) {
							for(int i=0;i<fri.length;i++)
								fri[i].GetPrint(i+1);
						} else fri[p-1].GetPrint(p);	
						System.out.println("Введите номер устройства для изменения: ");
						d=in.nextInt();
						inputFri(d-1);
					}
				break;
				}
				case "Электрочайник":{
					p=Knull(ket);
					if((ket[0]==null)&&(ket[1]==null)) System.out.println("Нет устройств для изменения! ");
					else {
						if(p==3) {
							for(int i=0;i<fri.length;i++)
								ket[i].GetPrint(i+1);
						} else ket[p-1].GetPrint(p);	
						System.out.println("Введите номер устройства для изменения: ");
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
		}else System.out.println("Нет доступных духовок!");
		k=Minull(micro);
		if((micro[0]!=null)||(micro[1]!=null)) {
			if (k==3) {
				for(int i=0;i<micro.length;i++)
					micro[i].GetPrint(i+1);
			} else if(k==-2)micro[1].GetPrint(2);
			else micro[k-1].GetPrint(k);
		}else System.out.println("Нет доступных микроволновок!");
		k=Munull(multi);
		if((multi[0]!=null)||(multi[1]!=null)) {
			if (k==3) {
				for(int i=0;i<multi.length;i++)
					multi[i].GetPrint(i+1);
			} else if(k==-2)multi[1].GetPrint(2);
			else multi[k-1].GetPrint(k);
		}else System.out.println("Нет доступных мультиварок!");
		k=Fnull(fri);
		if((fri[0]!=null)||(fri[1]!=null)) {
			if (k==3) {
				for(int i=0;i<fri.length;i++)
					fri[i].GetPrint(i+1);
			} else if(k==-2)fri[1].GetPrint(2);
			else fri[k-1].GetPrint(k);
		}else System.out.println("Нет доступных холодильников!");
		k=Knull(ket);
		if((ket[0]!=null)||(ket[1]!=null)) {
			if (k==3) {
				for(int i=0;i<ket.length;i++)
					ket[i].GetPrint(i+1);
			} else if(k==-2)ket[1].GetPrint(2);
			else ket[k-1].GetPrint(k);
		}else System.out.println("Нет доступных чайников!");
	}
	private String device () {
		while(true) {
			System.out.print("1. Духовка"
					+ "\n2. Микроволновка"
					+ "\n3. Мультиварка"
					+ "\n4. Холодильник"
					+ "\n5. Электрочайник\n");
			int d = in.nextInt();
			switch (d) {
			case 1: return "Духовка";
			case 2: return "Микроволновка";
			case 3:return "Мультиварка";
			case 4: return "Холодильник";
			case 5: return "Электрочайник";
			default: 
			}
		}
		
	}
	private void inputO(int p) throws Exception {
		int d;
		try{
			System.out.println(" Духовка ");
			_oven[p] = new oven();
			System.out.print("Введите температуру готовки: ");
			d = in.nextInt();
			_oven[p].SetTemperature(d);
			System.out.print("Введите время готовки в минутах: ");
			d = in.nextInt();
			_oven[p].SetTime(d);
			System.out.print("Выберите режим готовки:"
					+ "\n1. Верх"
					+ "\n2. Низ"
					+ "\n3. Верх + Низ"
					+ "\n4. Конвекция"
					+ "\n5. Верх + Низ + Конвекция\n");
			d = in.nextInt();
			switch (d) {
			case 1: _oven[p].SetMode("Верх"); break;
			case 2: _oven[p].SetMode("Низ"); break;
			case 3: _oven[p].SetMode("Верх + Низ"); break;
			case 4: _oven[p].SetMode("Конвекция"); break;
			case 5: _oven[p].SetMode("Верх + Низ + Конвекция"); break;
			default: _oven[p].SetMode("Верх + Низ"); break;
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				_oven[p].Timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
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
			System.out.println(" Холодильник ");
			fri[p] = new fridge();
			System.out.print("Введите температуру верхней камеры: ");
			d = in.nextInt();
			fri[p].SetTempTop(d);
			System.out.print("Введите температуру нижней камеры: ");
			d = in.nextInt();
			fri[p].SetTempBot(d);
			System.out.print("Выберите режим:"
					+ "\n1. Быстрая заморозка"
					+ "\n2. Покой (Снижение потребления электроэнергии)"
					+ "\n3. Без режима\n");
			d = in.nextInt();
			switch (d) {
			case 1: fri[p].SetMode("Быстрая заморозка"); break;
			case 2: fri[p].SetMode("Покой"); break;
			case 3: fri[p].SetMode("Без режима"); break;
			default: fri[p].SetMode("Без режима"); break;
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				fri[p].Timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
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
			System.out.println(" Мультиварка ");
			multi[p] = new multicooker();
			System.out.print("Введите время готовки в часах (от 0 до 4): ");
			d = in.nextInt();
			System.out.print("Введите время готовки в минутах (от 1 до 59): ");
			k = in.nextInt();
			multi[p].SetTime(d,k);
			System.out.print("Выберите режим готовки:"
					+ "\n1. Жарить"
					+ "\n2. Тушить"
					+ "\n3. На пару"
					+ "\n4. Печь"
					+ "\n5. Разогреть"
					+ "\n6. Рис/крупы"
					+ "\n7. Суп"
					+ "\n8. Йогурт\n");
			d = in.nextInt();
			switch (d) {
			case 1: multi[p].SetMode("Жарить"); break;
			case 2: multi[p].SetMode("Тушить"); break;
			case 3: multi[p].SetMode("На пару"); break;
			case 4: multi[p].SetMode("Печь"); break;
			case 5: multi[p].SetMode("Разогреть"); break;
			case 6: multi[p].SetMode("Рис/крупы"); break;
			case 7: multi[p].SetMode("Суп"); break;
			case 8: multi[p].SetMode("Йогурт"); break;
			default: multi[p].SetMode("Разогреть"); break;
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				multi[p].Timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
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
			System.out.println(" Электрочайник ");
			ket[p] = new kettle();
			System.out.print("Состояние крышки: 1. Открыть, 2. Закрыть");
			d = in.nextInt();
			if (d==2) ket[p].CloseCap(); 
			else {
				ket[p].OpenCap();
				System.out.print("Хотите закрыть крышку? 1. Да, 2. Нет");
				d = in.nextInt();
				if(d==1) ket[p].CloseCap();
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				ket[p].Timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
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
			System.out.println(" Микроволновка ");
			micro[p] = new microwave();
			System.out.print("Введите время готовки в минутах: ");
			d = in.nextInt();
			micro[p].SetTime(d);
			System.out.print("Выберите мощность:"
					+ "\n1. Минимальная"
					+ "\n2. Низкая (Разморозка)"
					+ "\n3. Средняя"
					+ "\n4. Высокая"
					+ "\n5. Максимальная\n");
			d = in.nextInt();
			switch (d) {
			case 1: micro[p].SetMode("Минимальная"); break;
			case 2: micro[p].SetMode("Низкая (Разморозка)"); break;
			case 3: micro[p].SetMode("Средняя"); break;
			case 4: micro[p].SetMode("Высокая"); break;
			case 5: micro[p].SetMode("Максимальная"); break;
			default: micro[p].SetMode("Средняя"); break;
			}
			System.out.print("Установить таймер? 1. Да, 2. Нет ");
			d = in.nextInt();
			if(d==1) {
				System.out.print("Введите время: ");
				micro[p].Timer(in.next());
			}
			System.out.print("Включить устройство? 1. Да, 2. Нет ");
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
