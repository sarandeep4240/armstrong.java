import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args)
	{
	    int num,r,sum=0,i;
	    Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		num = s.nextInt();
         i=num;
         while(num!=0)
         {
             r = num%10;
             num = num/10;
             sum = sum+(r*r*r);
         }
         if(i==sum)
         System.out.println("given number is amstrong");
         else
         System.out.println("given number is not a amstrong ");
	}
}
