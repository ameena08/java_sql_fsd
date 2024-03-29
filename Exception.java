/**
 * 
 */
package ustbatchno3.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.*;

/**
 * @author Administrator
 *
 */
public class Exception {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		 private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
		    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/ustemp";
		    private static final String DB_USER = "root";
		    private static final String DB_PASSWORD = "pass@word1";

		    // regular expression for email validation
		    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		    
		    // regular expression for phone number validation
		    private static final String PHONE_REGEX = "^\\d{10}$";

		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter empid: ");
		        int empid = scanner.nextInt();

		        System.out.print("Enter name: ");
		        String name = scanner.next();

		        System.out.print("Enter location: ");
		        String location = scanner.next();

		        System.out.print("Enter address: ");
		        String address = scanner.next();

		        System.out.print("Enter salary: ");
		        double salary = scanner.nextDouble();

		        System.out.print("Enter email: ");
		        String email = scanner.next();

		        while (!email.matches(EMAIL_REGEX)) {
		            System.out.print("Invalid email format. Enter a valid email: ");
		            email = scanner.next();
		        }

		        System.out.print("Enter phone number: ");
		        String phone = scanner.next();

		        while (!phone.matches(PHONE_REGEX)) {
		            System.out.print("Invalid phone number format. Enter a 10-digit phone number: ");
		            phone = scanner.next();
		        }

		        Connection dbConnection = null;
		        PreparedStatement preparedStatement = null;

		        try {
		            Class.forName(DB_DRIVER);
		            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

		            String insertTableSQL = "INSERT INTO employee"
		                    + "(empid, name, location, address, salary, email, phone) VALUES"
		                    + "(?,?,?,?,?,?,?)";

		            preparedStatement = dbConnection.prepareStatement(insertTableSQL);

		            preparedStatement.setInt(1, empid);
		            preparedStatement.setString(2, name);
		            preparedStatement.setString(3, location);
		            preparedStatement.setString(4, address);
		            preparedStatement.setDouble(5, salary);
		            preparedStatement.setString(6, email);
		            preparedStatement.setString(7, phone);

		            // execute insert SQL statement
		            preparedStatement.executeUpdate();

		            System.out.println("Record is inserted into employee table!");

		        } catch (ClassNotFoundException | SQLException e) {
		            System.out.println(e.getMessage());
		        } finally {
		            try {
		                if (preparedStatement != null) {
		                    preparedStatement.close();
		                }
		                if (dbConnection != null) {
		                    dbConnection.close();
		                }
		            } catch (SQLException e) {
		                System.out.println(e.getMessage());
		            }
		        }
		    }
		


	}


