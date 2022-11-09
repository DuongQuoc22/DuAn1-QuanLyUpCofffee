/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

/**
 *
 * @author Admin
 */
import java.sql.*;
public class JDBCHeper {
   static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   static String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QUANLYUPCOFFEE";
   static String user ="admin";
   static String password ="12345";
    
    static{
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static PreparedStatement getStmt(String sql, Object... args) throws Exception{
        Connection conn = DriverManager.getConnection(url,user,password);
        PreparedStatement stmt;
        if(sql.trim().startsWith("{")){
            stmt = conn.prepareCall(sql); // cau sql la thu tuc
        }else{
            stmt = conn.prepareStatement(sql);// cau lenh select
        }
        
        for(int i = 0; i< args.length;i++){// i=0 -> cau truy van khong co ?
            stmt.setObject(i+1, args[i]);// day du lieu vao dau ?
        }
        return stmt;
    }
    
    public static ResultSet query(String sql,Object... args) throws Exception{
        PreparedStatement stmt = JDBCHeper.getStmt(sql, args);
        return stmt.executeQuery();
    }
    public static Object value(String sql,Object...args){
        try {
            ResultSet rs = JDBCHeper.query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }// neu co du lieu se ko dong rs
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static int update(String sql,Object...args){
        try {
            PreparedStatement stmt = JDBCHeper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
