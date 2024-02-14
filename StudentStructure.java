import java.util.*;

class InvalidBalance extends Exception
{
    public InvalidBalance(String sms)
    {
        super(sms);
    }
}

class StudentInformation extends Thread
{
    Scanner sc=new Scanner(System.in);
    String name,clg_name,city;
    int age;

    StudentInformation(String name,String clg_name,String city,int age)
    {

        this.name=name;
        this.clg_name=clg_name;
        this.city=city;
        this.age=age;

    }

    public String getName1()
    {
        return name;
    }

    public String getCollege()
    {
        return clg_name;
    }

    public String getCity()
    {
        return city;
    }

    public int getAge()
    {
        return age;
    }

    public void SetTime()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    public void CheckDetails()
    {
        System.out.println("");
        System.out.print("      Loading Details of Student Please Check In 5 Seconds");
        String pattern="";
        String pattern1=".";
        for(int i=0;i<5;i++)
        {
            String finalPattern=pattern+pattern1;
            System.out.print(""+finalPattern);
            try
            {
            Thread.sleep(500);
            }
            catch (InterruptedException e)
            {

            }
        }
        System.out.println("");

        System.out.println("");
        System.out.print("==================");
        System.out.print("Student Information class And Methods Start Here");
        System.out.println("==================");
        System.out.println("");
        SetTime();
        System.out.println("      Name of student                  ::   "+getName1());
        SetTime(); 
        System.out.println("      College name                     ::   "+getCollege());
        SetTime();  
        System.out.println("      City of college                  ::   "+getCity());
        SetTime();
        System.out.println("      Age of Student                   ::   "+getAge());
        
        System.out.println("");
        System.out.println("=====================Strudent Infromation Class Methods End Here=====================");
        System.out.println("");
    }
    
    public void run() 
    {
        
        System.out.print("      You Want To Check The Details(Y/N) ::");
        String detailsCheck=sc.nextLine();
        int finalDetailsCheck=0;
        for(int j=0;j<1;j++)
        {
            char c=detailsCheck.charAt(j);
            finalDetailsCheck=(int)c;
        }
        
        if(finalDetailsCheck==121 || finalDetailsCheck==110)
        {
            detailsCheck = detailsCheck.toUpperCase();
        }
        boolean execute=true;
        while (execute)
        {
            switch (detailsCheck) 
            {
                case "Y":
                    CheckDetails();
                    execute=false;
                    break;
                
                case "N":
                    execute=false;
                    break;
                default:
                    System.out.println("      Wrong Input");
                    execute=false;
                    break;
            }
        }
        System.out.println();
        System.out.print("      Loading Fee Structure");
        try
        {
            String pattern="";
            for(int i=0;i<5;i++)
            {
                String pattern1=".";
                String finalPattern=pattern+pattern1;
                System.out.print(""+finalPattern);
                Thread.sleep(500);
            }
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
      System.out.println("\n");
    }
}
class FeeStructure extends Thread
{
    Scanner sc=new Scanner(System.in);
    int fee=50000;
    public  boolean executeAcknoladgement;
    public void Upi() throws InvalidBalance
        {

            System.out.println("");
            boolean result=true;
            int showStatement=0;
            int main=0;
            boolean executeClass=true;

            while(result)
            {
                if(main==1)
                {
                    System.out.print("      1 for Re-Enter and 0 for Exit::");
                    int ch=sc.nextInt();
                    switch (ch) 
                    {
                        case 1:
                            showStatement=0;
                            break;
                    
                        case 0:
                            main=0;
                            executeClass=false;
                            result=false;
                            executeAcknoladgement=false;
                            break;
                    }
                }
                    if(showStatement==0)
                    {
                        System.out.print("      Enter the UPI ID                 ::   ");
                        sc.nextLine();
                        String str=sc.nextLine();
                        StringBuffer br=new StringBuffer(str);
                        String str1="@ybl";
                        String str2=br.substring(br.length()-4);
                        int numberChcek=0;

                        for(int k=0;k<br.length()-5;k++)
                        {
                            char s=br.charAt(k);
                            int finalInt=s-'0';
                            if(finalInt<10)
                            {
                                numberChcek=1;
                            }
                            else
                            {
                                numberChcek=0;
                                break;
                            }
                        }
                        if((str2.equals(str1))&& (br.length()-4)==10 && numberChcek==1)
                        {
                            result=false;
                        }
                        else
                        {
                            System.out.println("      Envalid UPI Id please Enter Correct Id");
                            main=1;
                            showStatement=1;
                        }
                    }
                }            
            
            if(executeClass)
            {
                executeAcknoladgement=true;
                System.out.print("      Enter amount (min-amount=10000)  ::   ");
                int amount=sc.nextInt();
                if(amount<10000)
                {

                    throw new InvalidBalance("      Minimum fee is 10000");
                }
                if(fee>0 && (fee-amount!=0))
                {
                    System.out.println("      Remaining Fee is                 ::   "+(fee-amount));
                    System.out.println("");
                }
                else
                {
                    System.out.println("      your Fee is paid");
                }
                System.out.println("=======================Fee Structure Class And Methods Ends=======================");
            }
            else
            {
                System.out.println("      Exit From Process");
            }
        }
        public void Cash()
        {
            System.out.print("      Enter the Amount                 ::   ");
            int amount=sc.nextInt();
            if(fee>0)
            {
                System.out.println("");
                System.out.println("      Remaining Fee is                 ::   "+(fee-amount));
                System.out.println("");
            }
            else
            {
                System.out.println("      your Fee is paid");
            }
            System.out.println("=======================Fee Structure Class And Methods Ends=======================");
        }
        public void netBanking() throws InvalidBalance
        {
            System.out.print("      Enter the Id                 ::");
            int id=sc.nextInt();
            System.out.print("      Enter the Amount                 ::");
            int amount=sc.nextInt();
            if(amount<10000)
            {
                throw new InvalidBalance("      Paid Fee Greater than 10000");
            }
            if(fee>0)
            {
                System.out.println("      Remaining Fee is                 ::"+(fee-amount));
            }
            else
            {
                System.out.println("      your Fee is paid");
            }
            System.out.println("=====================Fee Structure Class And Methods Ends=========================");
        }

    public boolean IsStatus()
    {
        return this.executeAcknoladgement;
    }

    public void run()
    {
        System.out.println("=====================Fee Structure Of The Student For Admission=====================");
        System.out.println("");
        System.out.println("      1.UIP\n      2.Cash\n      3.Net-Banking");
        System.out.println("");
        System.out.print("      Enter the choice                 ::   ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
            try
            {
                Upi();
            }
            catch(Exception e)
            {
                System.out.println(e);
            } 
            break;
            
            case 2:
            try
            {
                Cash();
            }
            catch(Exception e)
            {
                System.out.println(e);
            } 
            break;

            case 3:
            try
            {
                netBanking();
            }
            catch(Exception e)
            {
                System.out.println(e);
            } 
            break;

            default:
            System.out.println("Envalid Choice");
            break;
        }
        System.out.println("\n=====================Fee Structure Of The Student For Admission=====================");
        System.out.println("");
        System.out.print("      Loading Preview");
        try
        {
            String pattern="";
            for(int i=0;i<5;i++)
            {
                String pattern1=".";
                String finalPattern=pattern+pattern1;
                System.out.print(""+finalPattern);
                Thread.sleep(500);
            }
        }
        catch (Exception e)
        {
            System.out.print(e);
        }
        System.out.println("");
    } 
}
class Acknoladgement implements Runnable
{
    FeeStructure obj;
    public Acknoladgement(FeeStructure obj)
    {
        this.obj=obj;
    }
    
    public void run()
    {
        boolean showAcknoladgement=obj.IsStatus();
        if(showAcknoladgement)
        {
            System.out.println("");
            String mainAcknoladgement="Congratulations Process Done Successfully....";
            System.out.println("=======================Acknoladgement Class Start Here============================");
            System.out.print("\n      ");
            int i;
            for(i=0;i<mainAcknoladgement.length();i++)
            {
                System.out.print(mainAcknoladgement.charAt(i));
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {

                }
            }
            System.out.print("\n");
            System.out.println("\n========================Acknoladgement Class Ends Here============================");
        }
        else
        {
            System.out.println("");
            System.out.println("=======================Acknoladgement Class Start Here============================");
            String mainAcknoladgement="Opps....Something Event Wrong Please Try Again";
            System.out.print("\n      ");
            for(int i=0;i<mainAcknoladgement.length();i++)
            {
                System.out.print(mainAcknoladgement.charAt(i));
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {

                }
            }
            System.out.print("\n");
            System.out.println("\n========================Acknoladgement Class Ends Here============================");
        }
    }
}
class StudentStructure
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        String name,college,city;
        int age;

        System.out.println("=========================Main Thread Is In Working Here=============================");
        System.out.println("");
        System.out.print("      Enter the Name of student        ::   ");
        name=sc.nextLine();
        System.out.print("      Enter the Name of College        ::   ");
        college=sc.nextLine();
        System.out.print("      Enter Name of College City       ::   ");
        city=sc.nextLine();
        System.out.print("      Enter the Age of student         ::   ");
        age=sc.nextInt();
        System.out.println("");
        System.out.println("===========================Main Thread Working Stops===============================");


        StudentInformation std=new StudentInformation(name,college,city,age);
        FeeStructure fs=new FeeStructure();
        Acknoladgement ack=new Acknoladgement(fs);
        Thread t=new Thread(ack);

        std.start();
        std.join();

        fs.start();
        fs.join();

        t.start();
    }
}