import java.util.*;
class Atm
{
    int t_pin,t_id;
    ArrayList<String> tr=new ArrayList<>();
    double amount,money=0;
    Scanner sc=new Scanner(System.in);
    Atm(int id,int pin)
    {
        t_id=id;
        t_pin=pin;
        amount=70000;
    }
    public void TransactionHistory()
    {
        if(tr.size()==0)
        {
            System.out.println("No Transactions are done yet!!!");
        }
        else
        {
            System.out.println(" Your Transactions Details!!!");
            System.out.println();
            for(int i=0;i<tr.size();i++)
            {
                System.out.println(tr.get(i));
            }
        }
        System.out.println();
    }
    public void Withdraw()
    {
        System.out.println("Enter amount");
        money=sc.nextInt();
        if(money<=amount)
        {
            amount-=money;
            tr.add(money+" is withdrawn from your account "+t_id);
            System.out.println("Withdrawn Money Successfully");
            System.out.println();
            System.out.println("Current Balance is "+amount);
        }
        else
        {
            System.out.println("There is no suffcient money in your account");
        }
        System.out.println();
    }
    public void Deposit()
    {
        System.out.println("Enter amount");
        money=sc.nextInt();
        amount+=money;
        tr.add(money+" is deposited to your account "+t_id);
        System.out.println();
        System.out.println("Your Current Balance is "+amount);
        System.out.println();
    }
    public void Transfer()
    {
        System.out.println("Enter account id to which you want to transfer");
        int account_id=sc.nextInt();
        System.out.println("Enter cash you want to transfer");
        money=sc.nextInt();
        if(money<=amount)
        {
            amount-=money;
            tr.add(money+" transfered to the account "+account_id);
            System.out.println(money+" transfered to the account "+account_id+" successfully");
            System.out.println("Your Current Balance is "+amount);
        }
        else
        {
            System.out.println("No suffcient money in your account");
        }
        System.out.println();
    }
    public void Quit()
    {
        System.out.println("Now you can remove your card");
        System.out.println();
    }
}
class AtmInterface
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  id");
