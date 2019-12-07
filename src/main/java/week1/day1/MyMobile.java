package week1.day1;

public class MyMobile {

	
	
	public static void main(String []args) {
		/*Mobile mob = new Mobile();
		boolean n = mob.myname;
		String hello = mob.stringMethod();
		System.out.println(hello);
		
		int number = mob.intMethod();
		System.out.println(number);
		if (n == true) {
		mob.noReturn();
		}
		else
		{
			System.out.println("NoName");
		}*/
		int a = 0,b = 1,c =0;
/*	System.out.println(a);
		while(c <= 100) {
			
			a=b;
			b=c;
			System.out.println(c);
			c = a+b;
			
		}*/
		
		  for (int n = 2; n <= 100; n++)
	        {
	            boolean flag = true;
	            for (int i=2; i <= n/2; i++)
	            {
	                if ( n % i == 0)
	                {
	                    flag = false;
	                    break;
	                }
	            }
	 
	            if ( flag == true )
	                System.out.println(n);
	            
	        }
		/*for(int i=80; i>=60; i--) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}*/
	
	}
}
