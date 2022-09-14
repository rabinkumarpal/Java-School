public class Prime_Main {

  public static void main(String[] args) {

    int num = 16,v;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) 
    {
      // condition for nonprime number
      // System.out.println(num + " i." +i);
       //v= num / 2;
      // System.out.println(num + " i." +v);
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number." +flag);
    else
      System.out.println(num + " is not a prime number.");
  }
}