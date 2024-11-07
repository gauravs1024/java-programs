import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_example {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3307/gaurav";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        // Establishing the connection
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            if (connection != null) {
                System.out.println("Connected to the database!");

                // Creating a statement
                Statement statement = connection.createStatement();

                // Query
                String query = "SELECT * FROM your_table_name";

                // Executing the query
                ResultSet resultSet = statement.executeQuery(query);

                // Processing the result set
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    // Retrieve other columns as needed

                    // Process retrieved data
                    System.out.println("ID: " + id + ", Name: " + name);
                }

                // Close the result set, statement, and connection
                resultSet.close();
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
