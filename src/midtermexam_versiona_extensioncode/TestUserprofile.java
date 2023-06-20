/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Mei
 */
import java.util.Scanner;
public class TestUserprofile {
    public static void main (String[] args){
        Scanner input  = new Scanner(System.in);
        
        System.out.println("Available Genres:");
        System.out.println("Comedy");
        System.out.println("Drama");
        System.out.println("Action");
        System.out.println("Mystery");

        System.out.print("Enter your name: ");
        String id = input.nextLine();

        System.out.print("Choose your favorite genreb : ");
        String genreChoice = input.nextLine();

        input.close();

        UserProfile userProfile = new UserProfile(id, genreChoice);

        System.out.println("\nUser Profile Created:");
        System.out.println("User ID: " + userProfile.getUserID());
        System.out.println("Favorite Genre: " + userProfile.getGenre());
   
    }      
}
