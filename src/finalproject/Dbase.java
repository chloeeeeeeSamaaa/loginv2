/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author ziamdriel03
 */
public class Dbase {

    private static String username;
    private static String firstname;
    private static String lastname;
    private static String password;
    private static String gender;


//setters
    public static void setUsername(String u) {
        username = u;
    }

    public static void setFirstname(String f) {
         firstname = f;
    }

    public static void setLastname(String l) {
        lastname = l;
    }

    public static void setPassword(String p) {
         password = p;
    }

    public static void setGender(String g) {
        gender = g;
    }
//getters

    public static String getUsername() {
        return username;
    }

    public static String getFirstname() {
        return firstname;
    }

    public static String getLastname() {
        return lastname;
    }

    public static String getPassword() {
        return password;
    }

    public static String getGender() {
        return gender;
    }

}
