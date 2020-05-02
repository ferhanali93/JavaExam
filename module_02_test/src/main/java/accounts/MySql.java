package accounts;
import java.sql.*;

    public class MySql {
        public static void main(String[] args) throws ClassNotFoundException, SQLException {

            String username = "root";
            String password = "Bronx_10460";
            String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false";
            Class.forName("org.gjt.mm.mysql.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employees");
            resultSet.next();
            String emp_name = resultSet.getString("emp_name");
            String position = resultSet.getString("position");
            String emp_salary = resultSet.getString("emp_salary");
            String location = resultSet.getString("location");
            System.out.println(emp_name + " " + position + " " + emp_salary + " " + location);
            connection.close();
        }
    }