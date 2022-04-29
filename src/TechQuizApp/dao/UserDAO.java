/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Shubham
 */
public class UserDAO {
   public static boolean validateUser(User user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        String qry="Select * from Users where userid=? and password=? and usertype=?";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
 
}
   public static boolean changePwd(User user)throws SQLException{
         
         Connection conn=DBConnection.getConnection();
         String qry="update users set password=? where userid=? and usertype=? ";
         PreparedStatement ps=conn.prepareStatement(qry);
         ps.setString(1,user.getPassword());
         ps.setString(2,user.getUserId());
         ps.setString(3,user.getUserType());
         int i=ps.executeUpdate();
         return i==1;
    }
   public static boolean registerStudent(User user)throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        String qry="insert into users values(?,?,?)";
        PreparedStatement ps=conn.prepareStatement(qry); 
        ps.setString(1, user.getUserId());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getUserType());
        int i=ps.executeUpdate();
        return i==1;
   }

}
