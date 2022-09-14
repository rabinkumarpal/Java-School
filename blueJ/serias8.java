
/**
 * Write a description of class serias8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class serias8
{
    public static void main(String[] args)
    {
        int i, s=0;
        for(i=2;i<=10;i=i+4)
        {
            s=s+i-(i+2);
            System.out.println("i="+i + " s="+s);
            
        }
        System.out.println("\t S="+s);
    
    }
}
