import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String user = "user";
        String userPassword = "moon";

        byte attempts = 0;

        Scanner reader = new Scanner(System.in);

//        if (userName.equals(user) && password.equals(userPassword)) {
//            IO.println("login successful");
//        } else {
//            IO.println("login-failed");
//        }

        while (attempts < 3) {

//          IO.println("Please enter your username and password:");
            IO.println("Please enter your username: ");
            String userName = reader.nextLine();
            IO.println("Please enter your password: ");
            String password = reader.nextLine();

            if (userName.equals(user) && password.equals(userPassword)) {
                IO.println("login successful");
                return; // loop continues without this!!!!

            } else if (userName.equals("") || password.equals("")) { // I didn't use .equals() before I was using == .equals() for strings
                IO.println("username or password is empty! :o Please try again");
                attempts++;

            } else {
                IO.println("login-failed, Please enter your username and password again :(");
                attempts++;
            }
        }


        IO.println("ACCESS DENIED");

    }
}

// THE USERNAME MUST BE ENTERED
// IF USERNAME AND PASSWORD IS CORRECT (ALL GOOD)
// IF THEY TYPE THE INFO 3 TIMES SAYS ACCESS DENIED