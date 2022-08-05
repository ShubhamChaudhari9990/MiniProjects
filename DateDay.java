import java.util.*;
class DateDay
{
    static int yearnum;
    static void dayFun(int date,int month,int year,int yearnum,int monthnum)
    {
        int year2digit=year%100;
        int divisibleby4=year2digit/4;
        int total=divisibleby4+year2digit+date+yearnum+monthnum;
        int day=total%7;
        System.out.println("\nDate "+date+"-"+month+"-"+year+" the Day is");                                          
        switch (day) 
        {
            case 0: System.out.println("Sunday\n");
                    break;
            case 1: System.out.println("Monday\n");
                    break;
            case 2: System.out.println("Tuesday\n");
                    break;
            case 3: System.out.println("Wednesday\n");
                    break;
            case 4: System.out.println("Thursday\n");
                    break;
            case 5: System.out.println("Friday\n");
                    break;
            case 6: System.out.println("Saturday\n");
                    break;
        }
    }
    static int yearNum(int year)
    {   
        if(year>=1600 && year<=1699)
        {
            return yearnum=6;         
        }
        else if(year>=1700 && year<=1799)
        {
            return yearnum=4;
        }
        else if(year>=1800 && year<=1899)
        {
            return yearnum=2;
        }
        else if(year>=1900 && year<=1999)
        {
            return yearnum=0;
        }
        else if(year>=2000 && year<=2099)
        {
            return yearnum=6;
        } 
        return 0;  
    }
    public static void main(String args[])
    {   
        System.out.println("\n**********");
        System.out.println("\nEnter Date in DD MM YYYY in numeric formate");
        Scanner sc=new Scanner(System.in);
        int date=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        sc.close();

        int b=year%4;
        if(b==0 && month==1 || b==0 && month==2)
        {
            if( (date<=31 && month==1) ||
                (date<=29 && month==2))       
            {            
                if(month==1)
                {
                    int monthnum=0;
                    yearNum(year);
                    dayFun(date, month, year, yearnum, monthnum-1);                
                }
                if(month==2)
                {
                    int monthnum=3; 
                    yearNum(year);
                    dayFun(date, month, year, yearnum, monthnum-1);   
                }
            }
            else 
            {
                System.out.println("you enter wrong Date or Month");
            }
        }
        else if((date<=31 && month==1) || (date<=28 && month==2) ||
                (date<=31 && month==3) || (date<=30 && month==4) ||
                (date<=31 && month==5) || (date<=30 && month==6) ||
                (date<=31 && month==7) || (date<=31 && month==8) ||
                (date<=30 && month==9) || (date<=31 && month==10) ||
                (date<=30 && month==11) || (date<=31 && month==12))       
        {            
            if(month==1 || month==10)
            {
                int monthnum=0;
                yearNum(year);
                dayFun(date, month, year, yearnum, monthnum);                
            }
            if(month==2 || month==3 || month==11)
            {
                int monthnum=3; 
                yearNum(year);
                dayFun(date, month, year, yearnum, monthnum);   
            }
            if(month==4 || month==7)
            {
                int monthnum=6;
                yearNum(year);
                dayFun(date, month, year, yearnum, monthnum);
            }
            if(month==5)
            {
                int monthnum=1;
                yearNum(year);
                dayFun(date, month, year, yearnum, monthnum);
            }
            if(month==6)
            {
                int monthnum=4;
                yearNum(year);
                dayFun(date, month, year, yearnum, monthnum);
            }
            if(month==8)
            {
                int monthnum=2;
                yearNum(year);
                dayFun(date, month, year, yearnum, monthnum);
            }
            if(month==9 || month==12)
            {
                int monthnum=5;
                yearNum(year);
                dayFun(date, month, year, yearnum, monthnum);
            }
        }
        else
        {
            System.out.println("You entered wrong date OR month");
        }
    }
}
