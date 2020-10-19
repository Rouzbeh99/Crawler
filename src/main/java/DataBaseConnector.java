import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnector {

    private static Connection con=null;


    public static void main(String[] args){
        addEntery("test2","Test2","test.com2","10x10",1998,10,"here",1,"me");
    }

    public static void addEntery(String title ,String detail ,String link ,String area ,int buildYear ,int price ,String address ,int roomCount ,String putBy){
            try(Connection connection=getConnection()){
                try(CallableStatement st=con.prepareCall("INSERT INTO chabaharAdds(title,detail,link,area,buildYear,price,address,roomCount,putBy) VALUES (?,?,?,?,?,?,?,?,?)")){
                    st.setString(1,title);
                    st.setString(2,detail);
                    st.setString(3,link);
                    st.setString(4,area);
                    st.setInt(5,buildYear);
                    st.setInt(6,price);
                    st.setString(7,address);
                    st.setInt(8,roomCount);
                    st.setString(9,putBy);
                    st.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    private static Connection getConnection() throws SQLException {
       if(con==null){
           con= DriverManager.getConnection(
                   "jdbc:mysql://localhost/searchengine?" +
                           "user=root&password=pass&useSSL=false&allowPublicKeyRetrieval=true");
       }
       return con;
    }


}
