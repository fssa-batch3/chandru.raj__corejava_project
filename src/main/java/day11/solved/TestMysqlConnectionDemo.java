package day11.solved;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class TestMysqlConnectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		System.out.println(conn);

	}

	}

