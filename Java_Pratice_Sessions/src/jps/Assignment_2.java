/* ((((10/2)-2)+2)-2)*2) */

package jps;

public class Assignment_2 {
	
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		int d;
		d=a-b;
		return d;
	}
	
	public int add(int a,int b)
	{
		int c;
		c=a+b;
		return c;
	}
	
	public void mul(int a,int b)
	{
		int r;
		r=a*b;
		System.out.println("The result of the equation is "+r);
	}
	
	public static void main(String[] args) {
		
		Assignment_2 a2=new Assignment_2();
		int div_result=a2.div(10, 2);
		int sub_result=a2.sub(div_result, 2);
		int sum_result=a2.add(sub_result, 2);
		int sub_1_result=a2.sub(sum_result, 2);
		a2.mul(sub_1_result, 2);
		
		
		
		
		
	}

}
