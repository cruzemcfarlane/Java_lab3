/**
 * Author:  Cruze McFarlane
 * ID:      620040546 
 */
package Lab3;
import java.util.*;


public class MyATM
{
    public static void main(String[] arg)
    {
        Account mySavingAcctUsainBolt = new Account("CUST0001", 1000.00); //Savings Account initialized at $1000
        Account myChequeAcctUsainBolt = new Account("CUST0002", 1000.00); //Chequing Account initalized at $1000
        double amount =0.0;
        Scanner scan1;
        String option = "";
               
        
        System.out.println("WECLOME TO MY ATM\n");
        
        System.out.println("DS - Deposit to Savings Account");
        System.out.println("DC - Deposit to chequing Account\n");
        
        System.out.println("WS - Withrawal from Savings Account");
        System.out.println("WC - Withdrawal from Chequing Account\n");
         
        System.out.println("TS - Transfer to Savings Account");
        System.out.println("TC - Transfer to Chequing Account\n");
        
        System.out.println("SI - Interest on Savings Account");
        System.out.println("CI - Interest on Chequing Account\n");
        
        System.out.println("BL - Display Account Balance");
        
        System.out.println("\nQ - Quit the program");
        
        while (option !="q")
        {
            scan1 = new Scanner(System.in);
            System.out.print("\nSelect an option -> ");        
            option = scan1.nextLine();
        
            System.out.print("");
         
        
        
            if (option.toUpperCase().equals("BL"))
            {
                System.out.println("\n(Savings): " +mySavingAcctUsainBolt.toString());
                System.out.println("(Chequing): " +myChequeAcctUsainBolt.toString());
            }
        
            else if (option.toUpperCase().equals("Q"))
            {
                System.exit(0);
            }
        
         
            else
            {
                System.out.print("\nEnter amount: ");            
                amount = scan1.nextDouble(); //Money that will be withdrawn or deposited 
        
                if (option.toUpperCase().equals("DS"))
                {
                    mySavingAcctUsainBolt.deposit(amount);
                    System.out.println(mySavingAcctUsainBolt.toString());
                }
           
                else if (option.toUpperCase().equals("DC"))
                {
                    myChequeAcctUsainBolt.deposit(amount);
                    System.out.println(myChequeAcctUsainBolt.toString());
                }
                    
                else if (option.toUpperCase().equals("WS"))
                {
                    mySavingAcctUsainBolt.withdraw(amount);
                    System.out.println(mySavingAcctUsainBolt.toString());
                }
            
                else if (option.toUpperCase().equals("WC"))
                {
                    myChequeAcctUsainBolt.withdraw(amount);
                    System.out.println(myChequeAcctUsainBolt.toString());
                }
            
                else if (option.toUpperCase().equals("TS"))
                {
                    myChequeAcctUsainBolt.withdraw(amount);
                    mySavingAcctUsainBolt.deposit(amount);
                    System.out.println("\n(Savings) " +mySavingAcctUsainBolt.toString());
                    System.out.println("(Chequing) " +myChequeAcctUsainBolt.toString());
                }
            
                else if (option.toUpperCase().equals("TC"))
                {
                    mySavingAcctUsainBolt.withdraw(amount);
                    myChequeAcctUsainBolt.deposit(amount);
                    System.out.println("\n(Chequing) " +myChequeAcctUsainBolt.toString());
                    System.out.println("(Savings) " +mySavingAcctUsainBolt.toString());
                }
            
                else if (option.toUpperCase().equals("SI"))
                {
                    mySavingAcctUsainBolt.accumulateInterest(amount);
                    System.out.println(mySavingAcctUsainBolt.toString());
                }
            
                else if (option.toUpperCase().equals("CI"))
                {
                    myChequeAcctUsainBolt.accumulateInterest(amount);
                    System.out.println(myChequeAcctUsainBolt.toString());
                }
            
                else
                {
                    System.exit(0);
                }
            }        
        }
    }
}


        