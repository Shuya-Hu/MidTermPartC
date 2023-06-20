package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String userId = input.nextLine();
        System.out.println("Please enter number to select your genre \n" +
                "(Select from Comedy, Drama, Action, Mystery)");
        String genre = input.nextLine();
        UserProfile user = new UserProfile(userId, genre);
        System.out.println("Your user file has been created.");
    }
}
