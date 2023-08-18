import java.util.Scanner;

public class ATM_Interface {

    public static void main(String [] args) {
        int pinNo = 6704;
        int TotalBalance = 225000;
        int Withdrawl = 0;
        int Deposit = 0;
        int TransferAmount = 0;
        int AccountNumber = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dear Customer : Welcome to Indian Bank \n");
        System.out.println("Please enter your ATM pin No :");

        pinNo = sc.nextInt();
        if(pinNo == 6704) {
            while(true) {
                System.out.println("Indian Bank ATM ");
                System.out.println("Enter choose your Option :");
                System.out.println("Press option 1 for Withdrawl Amount : ");
                System.out.println("Press option 2 for Deposit Amount : ");
                System.out.println("Press option 3 for Check Balance : ");
                System.out.println("Press option 4 for Transfer Amount : ");
                System.out.println("Press option 5 for Receipt ");
                System.out.println("Press option 6 for Exit : ");
                int x = sc.nextInt() ;
                switch(x) {
                    case 1 :
                        System.out.println("Enter money to Withdrawl ");
                        Withdrawl = sc.nextInt();
                        if(TotalBalance >= Withdrawl) {
                            System.out.println("Please Collect your Money");
                            TotalBalance = TotalBalance - Withdrawl ;
                            System.out.println("Remaining Balance " +TotalBalance);
                            break;
                        }else {
                            System.out.println("Insufficient Money");
                        }

                    case 2 :
                        System.out.println("Enter Money to Deposit :");
                        Deposit = sc.nextInt();
                        TotalBalance = TotalBalance + Deposit ;
                        System.out.println("Your Money successfully Deposited");
                        System.out.println(" ");
                        break; 

                    case 3 :
                        System.out.println("Available Balance :" +TotalBalance);
                        System.out.println(" ");
                        break;

                    case 4 :
                        System.out.println("Welcome to Indian Bank !!");
                        System.out.println("Enter the IFSC code :");
                        String ifsc = sc.next();
                        System.out.println("Entered IFSC code is :" +ifsc);
                        System.out.println("Enter the Bank Account number :");
                        AccountNumber = sc.nextInt();
                        System.out.println("Enter the Amount to be Tranfer :");
                        TransferAmount = sc.nextInt();
                        System.out.println("Your Amount " +TransferAmount+ " is Successfully transferred to the Account number :"+AccountNumber);
                        TotalBalance = TotalBalance - TransferAmount;
                        System.out.println("Available Balance :" +TotalBalance);
                        break;

                    case 5 :
                        System.out.println("Welcome to Indian Bank A.T.M !!");
                        System.out.println("Deposited Amount " +Deposit);
                        System.out.println("Withdrawl Amount " +Withdrawl);
                        System.out.println("Available Balance " +TransferAmount);
                        System.out.println("Transfered Amount " +TransferAmount);
                        System.out.println("Thanks For using Indian Bank A.T.M ");
                        System.out.println("Visit Again......");
                        break;

                    case 6 :
                        System.out.println("Indian Bank A.T.M ");
                        System.out.println("Thanks for Coming....");
                        System.out.println("Please Visit Again");
                        System.exit(0);
                }
            }
        }
        else {
            System.out.println("Wrong Pin !!! ");
            System.out.println("Enter the Correct Pin And Retry");
        }
    }
}