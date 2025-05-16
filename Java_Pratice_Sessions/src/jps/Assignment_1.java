/* ((((10+2)+2)-2)*2)/2)     */


package jps;

public class Assignment_1 {
	
	
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		int d=a-b;
		return d;
	}
	
	public int mul(int a,int b)
	{
		int e=a*b;
		return e;
	}
	
	public void div(int a,int b)
	{
		int f=a/b;
		System.out.println("The result of the equation is "+f);
		System.out.println("Methods Assignments");
	}
	
	
	
	public static void main(String[] args) {
		
		Assignment_1 a1=new Assignment_1();
		int sum_result=a1.add(10, 2);
		int sum_result_1=a1.add(sum_result, 2);
		int sub_result=a1.sub(sum_result_1, 2);
		int mul_result=a1.mul(sub_result, 2);
		a1.div(mul_result, 2);
		
		
		
	}

}
