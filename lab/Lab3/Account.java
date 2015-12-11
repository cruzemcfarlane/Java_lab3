/**
 * Author:  Cruze McFarlane
 * ID:      620040546 
 */
package Lab3;


/**
 * A simple class for demonstration of how to use classes and objects
 * @author COMP1161  
 * @version 1.00
 */
public class Account
{
    // instance variables - replace the example below with your own
   
  private double balance;
  private double lastDeposit;
  private double lastWithdraw;
  private String custNum;
  private double newBalance;  
  
    /**
     * Constructor #1 - account balance set to default (0.00)
     */
    public Account()
    {
        // initialise instance variables
        balance = 0.0;
        lastDeposit = 0.00;
        lastWithdraw = 0.0;
   }
   
   /**
    * Constructor #2 - set account balance to a specified amount
    * @param bal starting balance for account
    */
   public Account(double bal)
   {
       this.balance = bal;
       this.newBalance = bal;
    }
   
    /**
    * Constructor #3 - set  customer number and account balance to a specified amount
    * @param cus customer number for account
    * @param bal starting balance and highest balance for account 
    */
   public Account(String cust, double bal)
    {
        custNum = cust;
        balance = bal;
        newBalance = bal;
    }
   
    /**
     * deposit an amount to account
     * @param amt amount to be deposited
     * update the highest balance if the current balce is greater than the highest balance
     * @return  void
     */
    public void deposit(double amt)
    {
        balance += amt;
        if (newBalance < balance)
        {
            newBalance = balance;
        }
    }
   
   
    /**
     * withdraw an amount from account if funds is available
     * return amount withdrawn
     * @param amount to be withdrawn
     */
    public double withdraw(double amt)
    {
        if (amt > balance)
        {
            return 0;
        }
        
        else
        {
            balance -= amt;
            return amt;
        }
    }
    
    
    /**
     * check account balance
     * @param none
     * @return account balance
     */
    public double balance()
    {
       return balance;         
    }    

    public String toString()
    {
        return "Account balance: $" + balance + ", Highest Balance $" +newBalance+ ", Customer #: " +custNum;
    }
    
    /**
     * calculate the interest rate
     * @param interest used to determine the interest rate given to the account holder
     * @return void
     */
    public void accumulateInterest(double interest)
    {
        balance += (newBalance*(interest/100));
        newBalance = 0.0;        
    }          
}