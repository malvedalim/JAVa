import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
//        Car p = new Car();
//        person ppl = new person();
//        sumCalculator s = new sumCalculator();
        bankAccount ba = new bankAccount();
//        System.out.println("Enter your first name: ");
//        String fname = g.nextLine();
//        System.out.println("Enter your last name: ");
//        String lname = g.nextLine();
//        ppl.setName(fname, lname);
//        System.out.println("Hi, " + ppl.getName());
//        System.out.println("Enter a natural Number 1: ");
//        int x = g.nextInt();
//        System.out.println("Enter a natural number 2: ");
//        int y = g.nextInt();
//        s.setSum(x, y);
//        s.getSum();
//        g.nextLine();
//        System.out.println("Enter the model of the car:");
//        String model = g.nextLine();
//        p.setModel(model);
//        System.out.println("The model of your car is " + p.getModel());
        System.out.println("Enter your account number: ");
        int accNum = g.nextInt();
        if(accNum == 1234){

        ba.setAccNum(accNum);
        System.out.println("Enter balance");
        double bal = g.nextDouble();
        ba.setBalance(bal);
        g.nextLine();
        System.out.println("Enter your name: ");
        String name = g.nextLine();
        ba.setName(name);
        System.out.println("Enter email: ");
        String email = g.nextLine();
        ba.setEmail(email);
        System.out.println("Enter Phone Number: ");
        int phoneNum = g.nextInt();
        ba.setPhoneNum(phoneNum);

            System.out.println("Hello there " + ba.getName());
            System.out.println("Your current balance is $" + ba.getBalance());
            System.out.println("Press 'w' to withdraw/ Press 'd' to deposit");
            char choice = g.next().charAt(0);
            if(choice == 'd'){
                System.out.println("Enter the value you want to deposit: ");
                double deposit = g.nextDouble();
                ba.setDepositFunds(deposit);
                System.out.println("****************************************");
                System.out.println("Your new balance is $" + ba.depositFunds());
            }else if(choice == 'w'){
                System.out.println("Enter the value you want to withdraw: ");
                double withdraw = g.nextDouble();
                ba.setwithrawFunds(withdraw);
                System.out.println("****************************************");
                System.out.println("Your new balance is $" + ba.withrawFunds());
            }else{
                System.out.println("Invalid Input....");
            }
        }else
            System.out.println("Invalid account number..");





    }
}
