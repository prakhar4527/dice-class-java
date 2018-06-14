package dice;
import java.util.*;
public class Dice {
	int size;
    public Dice(int x)
    {
        this.size=x;
    }
     int r;
    int result()
    {
        r=(int)(Math.random()*10)%size;
        return r+1;
    }
    public static void main(String args[])
    {
    	System.out.println("Enter the size of dice");
        Scanner in=new Scanner(System.in);
       // System.out.println("hello");
       // String s=in.nextLine();
        int x;
        x=in.nextInt();
        if(x<1)
        {
        	System.out.println("Enter size is Invalid");
        }
        else
        {
        	 // x=Integer.parseInt(s);
            Dice d=new Dice(x);
            int y=d.result();
           // String a=String.valueOf(y);
            if(x==2)
            {
            	if(y==1)
            	{
            		System.out.println("HEAD");
            	}
            	else
            		System.out.println("TAIL");
            }
            else
            System.out.println(y);
        }
      
    }
}
