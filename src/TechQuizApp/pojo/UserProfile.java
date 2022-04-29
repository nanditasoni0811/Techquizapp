/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.pojo;

/**
 *
 * @author Shubham
 */
public class UserProfile {
    
    private static String username;
    private static String usertype;
    
    public static String getUsertype() {
        return usertype;
    }
    public static void setUsername(String username) {
        UserProfile.username = username;
    }
    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }    
    public static String getUSername(){
        return username;
    }
}

