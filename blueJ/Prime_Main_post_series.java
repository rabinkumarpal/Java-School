 import java.util.*;
public class Prime_Main_post_series {

  public static void main(String[] args) {

    int num,v,t,vlu;
    
    System.out.println("Enter Value ");
    Scanner in=new Scanner(System.in);
    v=in.nextInt();
    System.out.println("Enter 2nd Value ");
    t=in.nextInt();
    
   for (int k=v; k<=t; ++k) 
    {
        boolean flag = false;
         vlu=k;
            for (int i = 2; i <= vlu / 2; ++i) 
                {
       
                  if (vlu % i == 0) {
                    flag = true;
                    break;
                  }
                  
                  
                }
    
            if (!flag)
              System.out.println(vlu + " is a prime number." +flag);
            else
              System.out.println(vlu + " is not a prime number.");
            
    }


  }
}