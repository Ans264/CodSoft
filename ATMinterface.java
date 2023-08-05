import java.util.*;
class UserBankAccount
{
    static double balance;
    public UserBankAccount(double balance)
    {
        this.balance=balance;
    }
    public void setBalance(double b)
    {
       this.balance=b;
    }
     public double getBalance()
    {
        return balance;
    }
}

class ATM extends UserBankAccount
{
    public ATM(double balance)
    {
    super(balance);
    }
    public void withdraw(double amount) throws TransactionUnsuccessful
    {
        if(amount<super.balance)
        {
            System.out.println("Transaction Successful. Amount Withdrawn:"+(amount));
            super.balance=super.balance-amount;
        }
        else
        {
         throw new TransactionUnsuccessful("Not enough balance for transaction");
        }
    }
    public void deposit(double amount1)
    {
           System.out.println("Transaction Successful. Amount Deposited:"+amount1);
           super.balance=super.balance+amount1;
    }
    public void checkBalance()
    {
        System.out.println("Balance:"+super.balance);
    }
    }
    
public class Main
{
public static void main(String[] args) 
{
  Scanner so=new Scanner(System.in);
  UserBankAccount obj=new UserBankAccount(0.0);
  ATM obj1=new ATM(0.0);
      System.out.println("Enter current balance:");
      double amt=so.nextDouble();
      obj.setBalance(amt);
      obj.getBalance();
      System.out.println("1. Deposit amount");
      System.out.println("2. Withdraw amount");
      System.out.println("3. Check Balance");
      System.out.println("4. Exit");
      System.out.println("Enter choice to proceed:");
      int chh=so.nextInt();
      if(chh<1 || chh>4)
      {
          System.out.println("Invalid Choice. Please enter a choice again:");
          chh=so.nextInt();
      }
      while(chh>=1 && chh<=3)
      {
       try
        {
      if(chh==1)
      { 
        System.out.println("Enter amount to be deposited:");
        double dm=so.nextDouble();
        obj1.deposit(dm);
      }
     else if(chh==2)
      {
        System.out.println("Enter amount to be withdrawn:");
        double wm=so.nextDouble();
        obj1.withdraw(wm);
      }
      else if(chh==3)
      {
     obj1.checkBalance();
      }
}

catch(TransactionUnsuccessful ife)
{
    System.out.println(ife);
}
       System.out.println("Enter choice to proceed further:");
       System.out.println("1. Deposit amount");
       System.out.println("2. Withdraw amount");
       System.out.println("3. Check Balance");
       System.out.println("4. Exit");
       chh=so.nextInt();
       if(chh<1 || chh>4)
      {
          System.out.println("Invalid Choice. Please enter a choice again:");
          chh=so.nextInt();
      }
}
}
}

class TransactionUnsuccessful extends Exception
{
    TransactionUnsuccessful(String s)
    {
    super(s);
    }
    }