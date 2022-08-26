public class First
 {
		void show1()
		{
			System.out.println("First Class") ;
		}
  }
	
class Second extends First
{
		void show2()
		{
			System.out.println("Second Class");
		}
		
		public static void main(String args[])
		{
			Second s=new Second () ;
			s.show1();
			s.show2();
		}
}}