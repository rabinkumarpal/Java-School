import java.util.*;
class pallindrome_not_pallindrome
{
    public static void main (String args[])
    {
        int a,b,sum=0,c;
        System.out.println("Enter value");
        Scanner in = new Scanner (System.in);
        a=in.nextInt();
        
        for(c=a;c>0;c=c/10)
        {
            b=c%10;
            sum=(sum*10)+b;
        }
        if(sum==a)
        System.out.println(" Pallindrome");
        else
        System.out.println("Not Pallindrome");
        }
    }




