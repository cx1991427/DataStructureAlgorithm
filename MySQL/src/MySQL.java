import java.sql.*;

public class MySQL {
	public static void main(String[] args){
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultSet=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root","cx1991427cx" );
					
			//1:select
			preparedStatement=connection.prepareStatement("select * from students");
			resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()){
				String name=resultSet.getString("Name");
				String department=resultSet.getString("department");
				int age=resultSet.getInt("age");
				
				System.out.println(name);
				System.out.println(department);
				System.out.println(age);
			}
			
			
			//2:insert  
			preparedStatement=connection.prepareStatement("insert  into students values (default,?,?,?,?)");
			
			preparedStatement.setString(1, "joseph");
			preparedStatement.setInt(2, 25);
			preparedStatement.setString(3, "Iran");
			preparedStatement.setString(4, "FE");
			
			preparedStatement.executeUpdate();
			
			
			//3:update
			preparedStatement=connection.prepareStatement("update students set nationality=? where name='xiang';");
			
			preparedStatement.setString(1,"NorthKorea");
			
			preparedStatement.executeUpdate();
			
			
			//4:delete
			preparedStatement=connection.prepareStatement("delete from students where name=?");
			
			preparedStatement.setString(1, "joseph");
			
			preparedStatement.executeUpdate();
			
			
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
