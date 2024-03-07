import java.io.*;
class Adam
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a,b,c=0,d=0,n,f=0,g=0,h=0;
			System.out.println("Enter n");
			n=Integer.parseInt(t.readLine());
			a=n;
			c=(int)Math.pow(n,2);
			System.out.println("c="+c);
			while(a>0)
			{
				b=a%10;
				d=d*10+b;
				a=a/10;
			}
				h=(int)Math.pow(d,2);
				System.out.println("h="+h);
			while(h>0)
			{
				f=h%10;
				g=g*10+f;		
				h=h/10;
			}
				System.out.println("g="+g);
			if(c==g)
			{
				System.out.println("Adam");
			}
			else
			{
				System.out.println("Not Adam");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
			
			
				
				
				
				