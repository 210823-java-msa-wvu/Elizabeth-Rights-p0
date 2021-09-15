package BankingApp;

import java.util.Scanner;

public class BankingAppCustomer {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount("ERightsCustomer", "0707");
        obj.showMenu();
    }
}

public class BankingAppAdministrator{
    public static void main(String[] args) {

        BankAccount obj = new BankAccount ("ERightsAdmin", "0707");
        obj.showMenu();
    }
}

class BankAccount {
    int balance;
    String customerName;
    String customerID;

    BankAccount(String customername,String customerid){
        customerName = customername;
        customerID = customerid;
    }

    void deposit (int amount)
    {
        if(amount !=0)
        {
            balance = balance + amount;

        }
    }

    void withdraw(int amount) {
        if (amount !=0)
        {
            balance = balance - amount;

        }
    }


    void showMenu(){

        char option='\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is "+customerID);
        System.out.println("/n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do{
            System.out.println("Enter an option");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option){

                case 'A':
                    System.out.println("Balance = "+balance);
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("Enter an amount to deposit:");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("Enter an amount to withdraw:");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':

                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("^^^^^");
                    break;

                default:
                    System.out.println("Invalid. Please Select from Menu.");
                    break;
            }
        } while(option != 'E');

        System.out.println("Thanks!");
    }
}
