import java.util.*;
class loop_sereis
{
    public static void main(String args[])
    {
        int i,j=2,k=0,s=0;
        {
            for(i=1;i<=3;i=i+1)
            {
                //s=s+1*(i+1);
               
                s=i*j;
                k=s+ k;
                System.out.println("i = " +i +"value s" + s + "value j " + j + "\t \n" );
                j=2;
                j=j+i;
                
                                   
            }
            System.out.println(k);
        }
        
    }
}