
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{
    // instance variables - replace the example below with your own
    private static double creditInterestRate;
    private static String closeTime;
    private static double investmentInterestRate;
    private static int lastCustID;
    private static int nextCustID;
    private static String phone;
    private static double premiumInterestRate;
    private static String startTime;
    public static String website;
    public static String bankAddress="1234 JavaStreet, AnyCity, ThisState, 34567";
    public static int maxNumOfCustomers=20;
    public static String bankName="JBANK";

  

    
    
    public static String getAddress()
    {
        // put your code here
        return bankAddress;
    }
    
    public static double getCreditRate()
    {
        // put your code here
        return creditInterestRate;
    }
    
    public static double getInvestmentRate()
    {
        // put your code here
        return investmentInterestRate;
    }
    
    public static String getHoursOfOperation()
    {
        // put your code here
        return startTime;
    }
    
    public static int getLastID()
    {
        // put your code here
        return lastCustID;
    }
    
    public static int getMaxCustomers()
    {
        // put your code here
        return maxNumOfCustomers;
    }
    
    public static String getName()
    {
        // put your code here
        return bankName;
    }
    
    public static int getNextID()
    {
        // put your code here
        return nextCustID;
    }
    
    public static String getWebsite()
    {
        // put your code here
        return website;
    }
    
    public static double getPremiumRate()
    {
        // put your code here
        return premiumInterestRate;
    }
    
    public static String getPhone()
    {
        // put your code here
        return phone;
    }
    
     
    public static void setCreditRate(double rate)
    {
        // put your code here
       
    }
    
    public static void setInvestmentRate(double rate)
    {
        // put your code here
       
    }
    
    public static void setPremium(double rate)
    {
        // put your code here
       
    }
}
