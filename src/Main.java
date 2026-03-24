import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] user = {"user", "user1"};
        String[] userPassword = {"Password", "Password1"};

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

            if (userName.isEmpty()) {
                IO.println("username is empty!");
                attempts++;
                continue;
            }

            if (password.isEmpty()) {
                IO.println("password is empty!");
                attempts++;
                continue;
            }

            if (userName.length() < 2 ) {
                IO.println("username must be at least 2 characters!");
                attempts++;
                continue;
            }

            if (password.length() < 2) {
                IO.println("password must be at least 2 characters!");
                attempts++;
                continue;
            }

            boolean hasCapitalLetter = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    hasCapitalLetter = true;
                    break;
                }
            }

            if (!hasCapitalLetter) {
                IO.println("password must contain one uppercase letter!");
                attempts++;
                continue;
            }

            boolean loggedIn = false;

            for (int i = 0; i < user.length; i++) {
                if(userName.equals(user[i]) && password.equals(userPassword[i])) {
                    loggedIn = true;
                    break;
                }
            }

            if(loggedIn) {
                IO.println("login successful!");
                return;
            } else {
                IO.println("login-failed, Please enter your username and password again :(");
                attempts++;
            }


//            if (userName.equals(user) && password.equals(userPassword)) {
//                IO.println("login successful");
//                return; // loop continues without this!!!!
//
//            } else {
//                IO.println("login-failed, Please enter your username and password again :(");
//                attempts++;
//            }

//             else if (userName.equals("") || password.equals("")) { // I didn't use .equals() before I was using == .equals() for strings
//                IO.println("username or password is empty! :o Please try again");
//                attempts++;
        }


        IO.println("ACCESS DENIED");

    }
}

// THE USERNAME MUST BE ENTERED
// IF USERNAME AND PASSWORD IS CORRECT (ALL GOOD)
// IF THEY TYPE THE INFO 3 TIMES SAYS ACCESS DENIED

// SEE IF METHODS CAN BE USED
// SET UP AN ARRAY OF USERNAME AND PASSWORD
// WANT IT TO CHECK USERNAME AND PASSWORD IS THE SAME AT INDEX 0
