package Database;

import java.sql.*;

public class Db {

private static Connection connection;
        public static void createConnection()  {
           final String url = "jdbc:mysql://localhost:3306/library";
           final String username = "root";
           final String password = "root";
           try {
                connection = DriverManager.getConnection(url, username, password);
                //Statement st = conn.createStatement();
                //ResultSet rs = st.executeQuery(query);
//                while (rs.next()) {
//                    String BID;
//                    BID = rs.getString("BID");
//
//                    System.out.println(BID);
//                }
//                st.close();
//                conn.close();
            }
           catch(Exception e){
               System.out.println(e);
           }
        }

        public static Connection getConnection(){
            return connection;
        }

        public static void closeConnection(){
            if (connection != null){
                try{
                    connection.close();
                }catch (Exception e){
                    System.out.println("Error in closing the connection");
                }
            }
        }


}
