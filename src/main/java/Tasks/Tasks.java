package Tasks;

import Sqlite.Conn;

import java.sql.SQLException;
import java.util.Scanner;

public class Tasks {
    public static void main(String arg[])throws SQLException {
        Conn conn = new Conn();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int num = in.nextInt();
        if (num == 1) {conn.Task1();}
        else if(num == 2){conn.Task2();}
        else if(num == 3){conn.Task3();}
    }
}
