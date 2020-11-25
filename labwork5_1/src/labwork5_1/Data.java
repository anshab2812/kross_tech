package labwork5_1;

import java.sql.*;
import java.util.ArrayList;

public class Data {

	Connection con;
    ArrayList<Doljnost> dol;
    ArrayList<Sotrudnic> sot;

    public Data() {
        dol = new ArrayList<>();
        sot = new ArrayList<>();
    }

    private void createCon() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/labwork1"+
            "?verifyServerCertificate=false"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
        String login = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, login, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private void selectElements() throws ClassNotFoundException, SQLException {
        dol.clear();
        sot.clear();
        createCon();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM doljnost");
            while (rs.next()) {
                Doljnost p = new Doljnost(rs.getInt(1),rs.getString(2),rs.getInt(3));
                dol.add(p);
            }
            rs = stmt.executeQuery("SELECT * FROM sotrudnic");
            while (rs.next()) {
                Sotrudnic p = new Sotrudnic(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5), rs.getInt(6));
                sot.add(p);
            }
            rs.close();
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            con.close();
        }
    }

    public String showDol() throws SQLException, ClassNotFoundException {
        selectElements();
        String s = "";
        for(Doljnost p : dol)
        {
            s += "| id: " + p.id + "\t| ���������: " + p.name + "   \t| �����: " + p.oklad + " ���" + " \t|\n";
        }

        return s;
    }

    public String showSot() throws SQLException, ClassNotFoundException {
        selectElements();
        String s = "";
        for(Sotrudnic p : sot)
        {
            s += "| id: " + p.id + "| ���: " + p.fio + "    \t| ���� ��������: " + p.bday + " | ����: "
            		+ p.wtime + " | �������: " + p.tel + " | idDol: " + p.id_d + " |\n";
        }

        return s;
    }

    public String addToDol(Doljnost p) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "������ ����������!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO doljnost (id_dd, Dname, Doklad) VALUES ("+p.id+",'"+p.name+"', "+p.oklad+")");
            stmt.close();
            return "���������� ��������� "+p.name+" ��������� �������!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "������ ���������� � ������� ���������!";
        } finally {
           con.close();
        }
    }

    public String deleteFromDol(int _id) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "������ ����������!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("DELETE FROM doljnost WHERE id_dd = "+_id);
            stmt.close();
            return "�������� ��������� � id:"+_id+" ��������� �������!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "������ �������� �� ������� ���������!";
        } finally {
            con.close();
        }
    }

    public String deleteFromSot(int _id) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "������ ����������!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("DELETE FROM sotrudnic WHERE id_ssot = "+_id);
            stmt.close();
            return "�������� ���������� � id:"+_id+" ��������� �������!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "������ �������� �� ������� ���������!";
        } finally {
            con.close();
        }
    }

    public String addToSot(Sotrudnic p) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "������ ����������!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO sotrudnic (id_ssot, FIO, Bday, Wtime, Sstel, id_d) VALUES ("+p.id+",'"+p.fio+"', '"+p.bday+"', "+p.wtime+",'"+p.tel+"',"+p.id_d+")");
            stmt.close();
            return "���������� ���������� "+p.fio+" ��������� �������!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "������ ���������� � ������� ���������!!";
        } finally {
            con.close();
        }
    }

}
