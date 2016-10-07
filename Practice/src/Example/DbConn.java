package Example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConn {
		public static void main(String[] args) {
			try {
				DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
				Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
				System.out.println("Got Connection"+c.getClass());
				Statement s=c.createStatement();
				ResultSet rs=s.executeQuery("select * from emp");
				while(rs.next()){
					System.out.println(rs.getInt("eid")+"\t"+rs.getString("ename")+"\t"+rs.getInt("sal"));	
				}
				c.close();
			} catch (SQLException e) {
				System.out.println("Not able to get connection");
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			}
		}

	}

