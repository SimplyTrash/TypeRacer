/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package typeracer;

/**
 *
 * @author Hassan
 */
public class Profile {
    public String username;
    public String password;
    public String imagePath;
    public double recordWpm;
    public double totalCorrect;
    public double totalIncorrect;
    
    public Profile(String user, String pass) {
        username = user;
        password = pass;
        imagePath = getClass().getResource("/images/no-profile-picture-icon-15.jpg").getPath();
        recordWpm = 0;
        totalCorrect = 0;
        totalIncorrect = 0;
    }
    
}
