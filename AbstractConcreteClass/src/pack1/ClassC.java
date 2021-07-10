package pack1;


public class ClassC extends ClassB{
	void xyz()
	{
		System.out.println("INTEL");
	}
	
	public static void main(String args[]){
		
			
			
			ClassC y= new ClassC();
			y.xyz();
			
			ClassA z = new 	ClassA(); //constructor calling
			System.out.println(z.f);
			
			ClassC u= new ClassC();
			u.test();
			u.demo();
			u.xyz();
				
		
	}
}
