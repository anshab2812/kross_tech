package labwork5_1;

import java.sql.SQLException;

public class Lab5_1 {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Data data = new Data();
        System.out.println(data.showDol());
        System.out.println(data.showSot());
        System.out.println(data.DeleteFromSot(1));
        System.out.println(data.DeleteFromDol(1));
        Doljnost dl = new Doljnost(8, "”борщица", 5000);
        Sotrudnic so = new Sotrudnic(8, "—кeба яна ѕетровна","1998-12-28",5,"+380966376234", 8);
        System.out.println(data.AddToDol(dl));
        System.out.println(data.AddToSot(so));
        System.out.println(data.showDol());
        System.out.println(data.showSot());
    }

}
