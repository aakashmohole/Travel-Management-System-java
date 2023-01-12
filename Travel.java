import java.util.*;

class Travel {
    public void Register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Email Id: ");
        String email = sc.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneno = sc.nextLine();
        System.out.println("Set Password: ");
        String Password = sc.nextLine();
    }

    public void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email Id as a username: ");
        String username = sc.nextLine();
        System.out.println("Enter your Password: ");
        String password = sc.nextLine();
        Location_details();
        System.out.println("\n **** This Are Some Flights of Foreign Country ****");

    }

    public void Location_details() {
        System.out.println("\n===========Available Packages=========");
        System.out.println("\nPlace\t\t\t\tPrice");
        System.out.println(
                "\n1.Mumbai To Pune\t\t600Rs/Person \n2.Pune To Satara\t\t200Rs/Person \n3.Satara To Goa\t\t\t1000Rs/Person \n4.Mumbai To Aurangabad\t\t500Rs/Person \n5.Pune To Kolhapur\t\t500Rs/Person \n6.Mumbai To Goa\t\t\t500Rs/Person \n\nChaild Have Same Price - 200/Chaild");

        System.out.println("\n========== Available Packages Foreign Country ======");
        System.out.println("\nPlace\t\t\t\tPrice");
        System.out.println(
                "\n7.Germany (Munich)\t\t1000Rs/Person \n8.UK (London)\t\t2000Rs/Person \n9.Spain (Madrid)\t\t\t3000Rs/Person \n10.Canada (Ottawa)\t\t4000Rs/Person \n11.Dubai (Air Port)\t\t5000Rs/Person \n\nChaild Have Same Price - 200/Chaild");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSelect Your Package:");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                Booking();
                break;
            case 2:
                Booking();
                break;
            case 3:
                Booking();
                break;
            case 4:
                Booking();
                break;
            case 5:
                Booking();
                break;
            case 6:
                Booking();
                break;
            case 7:
                Booking();
                break;
            case 8:
                Booking();
                break;
            case 9:
                Booking();
                break;
            case 10:
                Booking();
                break;
            case 11:
                Booking();
                break;

            default:
                System.out.println("Invalid Choice");
                break;
        }
    }

    public void Booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*****Welcome to Booking*****");
        System.out.println("\nEnter the number of adults:");
        int a = sc.nextInt();
        System.out.println("\nEnter the number of child:");
        int c = sc.nextInt();
        System.out.println("\nEnter the Price only for adults:");
        float p = sc.nextFloat();

        System.out.println("\nEnter the wight you carry with you : ");
        int wh = sc.nextInt();

        int cha = c * 200;
        float total = 0;

        System.out.println("\nIf The wight is grater than 25Kg Press 1 Otherwise Press ENTER..!");
        int exwh = sc.nextInt();

        if (exwh < 2) {
            System.out.println(
                    "\nNote -: If the wight is more tha 25Kg extra charges are apply as 200 Rs..! \n\n Thank You ..! And Continue..!");
            total = (a * p) + cha + 200;
        } else {
            total = (a * p) + cha;
        }

        System.out.println("\nTotal Bill is: " + total);
        if (total < 1) {
            System.out.println("Booking Failed	");
        } else {
            System.out.println("\nPay Bill by\n1.Debit Card\n2.NetBanking\n3.UPI\n\nEnter your choice:");
            int bill = sc.nextInt();
            switch (bill) {
                case 1:
                    Scanner s = new Scanner(System.in);
                    System.out.println("\nEnter Your bank name:");
                    String bname = s.nextLine();
                    System.out.println("\nEnter Account Number:");
                    int acc = s.nextInt();
                    System.out.println("\nEnter Expiry date(MM/YY):");
                    long date = s.nextLong();
                    System.out.println("\nEnter CVV Number:");
                    int cvv = s.nextInt();
                    System.out.println("\nEnter the OTP for verification:");
                    int otp = s.nextInt();
                    System.out.println("\nBILL PAID");
                    System.out.println("\n**** Congratulations!!!Booking Done Scucessfully.....**** ");

                    System.out.println("\n\n======= Enjoy Your Journey ========");
                    System.out.println("\n\n******** Thank You For Visiting Us *********");
                    System.exit(0);
                case 2:
                    Scanner n = new Scanner(System.in);
                    System.out.println("\nEnter Account Number:");
                    String aco = n.nextLine();
                    System.out.println("\nEnter CVV Number:");
                    String cv = n.nextLine();
                    System.out.println("\nEnter the OTP for verification:");
                    String ot = n.nextLine();
                    System.out.println("\nBILL PAID");
                    System.out.println("\n**** Congratulations!!!Booking Done Scucessfully.....");

                    System.out.println("\n\n======= Enjoy Your Journey ========");
                    System.out.println("\n\n******** Thank You For Visiting Us *********");
                    System.exit(0);
                case 3:
                    Scanner o = new Scanner(System.in);
                    System.out.println("\nEnter UPI ID:");
                    String upi = o.nextLine();
                    System.out.println("\nEnter the OTP for verification:");
                    String op = o.nextLine();
                    System.out.println("\nBILL PAID");
                    System.out.println("\n|**** Congratulations!!!Booking Done Sucessfully.....");

                    System.out.println("\n\n======= Enjoy Your Journey ========");
                    System.out.println("\n\n******** Thank You For Visiting Us *********");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid Choice");
                    System.exit(0);

            }
        }
    }

    static class Aakash extends Travel {
        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("\n*************************** TRAVEL MANAGMENT SYSTEM ************************");
                System.out.println("1.Register\n2.Login\n3.Logout\n\nEnter Your Choice:");

                int ch = sc.nextInt();
                Aakash m = new Aakash();
                switch (ch) {
                    case 1:
                        m.Register();
                        break;
                    case 2:
                        m.Login();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            } while (true);
        }
    }
}
