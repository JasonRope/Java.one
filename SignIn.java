import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you have na account?");
        String accountYN = scan.nextLine();

        switch (accountYN.toLowerCase()) {
            case "yes":
                System.out.println("Do you want ot sign in?");
                String signInYN = scan.nextLine();
                switch (signInYN.toLowerCase()) {
                    case "yes":
                        System.out.println("What is your username?");
                        String name = scan.nextLine();
                        System.out.println("What is you password " + name + " ?");
                        String passkey = scan.nextLine();

                        switch (passkey) {
                            case "Heslo1234":
                                System.out.println("...");
                                break;

                            default:
                                System.out.println("Incorect password");
                                return;
                        }

                        switch (name) {
                            case "Jaason":
                                System.out.println("Welcome Jaason!");
                                break;

                            default:
                                System.out.println("Incorect username");
                                break;
                        }
                        break;

                    case "no":
                        System.out.println("Okay");
                        break;
                    default:
                        System.out.println("Only yes or no please");
                        break;
                }
                break;

            case "no":
                System.out.println("Do you want to create one?");
                String createYN = scan.nextLine();
                switch (createYN.toLowerCase()) {
                    case "yes":
                        System.out.println("Okay!");
                        System.out.println("How should we call you?");
                        String username = scan.nextLine();
                        System.out.println("How old are you?");
                        int age = scan.nextInt();

                        if (age >= 18) {
                            System.out.println("You are old enough");
                            System.out.println("Choose a password");
                            scan.nextLine();
                            String password = scan.nextLine();
                            System.out.println("Is " + password + " really you password?");
                            String passwordYN = scan.nextLine();
                            switch (passwordYN.toLowerCase()) {
                                case "yes":
                                    System.out.println("Account has been created succesfuly");
                                    break;

                                case "no":
                                    System.out.println("Please try again");

                                default:
                                    System.out.println("Only yes or no please");
                                    break;
                            }
                        } else if (age < 18) {
                            System.out.println("You are not old enough");
                        } else {
                            System.out.println("Invalid age");
                        }

                        break;

                    case "no":
                        System.out.println("Okay");
                        break;

                    default:
                        System.out.println("Only yes or no please");
                        break;
                }
                break;
            default:
                System.out.println("Only yes or no please");
                break;
        }
    }
}
