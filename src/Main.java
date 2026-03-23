import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String user = "user";
        String userPassword = "Password";

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
                }
            }

            if (!hasCapitalLetter) {
                IO.println("password must contain one uppercase letter!");
                attempts++;
                continue;
            }


            if (userName.equals(user) && password.equals(userPassword)) {
                IO.println("login successful");
                return; // loop continues without this!!!!

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