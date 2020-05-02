package accounts;

import db.DbConnection;

import java.io.IOException;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        SalaryCalulator SalaryCalc = new SalaryCalulator();
        DbConnection.connectMySql();
    }
}