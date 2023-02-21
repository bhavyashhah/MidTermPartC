/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 My name is Bhavya Shah
 I am from India
 */
public class TestUserprofile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        UserProfile obj = new UserProfile();
        System.out.print("Enter your name: ");
        
        String n = input.nextLine();
        obj.setUserID(n);
        
        System.out.print("Select your Favorite Genre:");
        for(int i=0;i<(obj.genres).length;i++){
            System.out.print(genres[i]);
        }
        String g = input.nextLine();
        obj.setUserID(g);
        
        System.out.print("Your profile is created");
     
        
    }
}
