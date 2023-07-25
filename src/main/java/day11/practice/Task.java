package day11.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Task {
	private int id;
    private String title;
    private String description;
    private String status;
    
    
    
    
    public class TaskDAO {
        private Connection conn;

        // Constructor to establish the database connection
        public TaskDAO() {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database_name", "your_username", "your_password");
            } catch (SQLException e) {
                // Handle connection error
                throw new DAOException("Error connecting to the database", e);
            }
        }

        // Method to insert a Task object into the database
        public void createTask(Task task) throws DAOException {
            try {
                String sql = "INSERT INTO tasks (title, description, status) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, task.getTitle());
                stmt.setString(2, task.getDescription());
                stmt.setString(3, task.getStatus());

                // Execute the query
                int rowsAffected = stmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Task inserted successfully!");
                } else {
                    System.out.println("Task insertion failed!");
                }
            } catch (SQLException e) {
                // Catch the SQLException and rethrow it as a custom DAOException
                throw new DAOException("Error inserting task into the database", e);
            }
        }

        // Other DAO methods if required

        // Close the database connection
        public void closeConnection() {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


