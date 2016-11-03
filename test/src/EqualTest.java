
public class EqualTest {
	public static void main(String[] args)
	{
		Employee alice1 = new Employee("Alice",2000,1989,1,1);
		Employee alice2 = alice1;
		Employee alice3 = new Employee("Alice",2000,1989,1,1);
		Employee bob = new Employee("bob",3000,1998,1,1);
		
		System.out.println("alice1 == alice2:" + (alice1 == alice2));
		//"=="用于检测对象是否指向同一存储区域
		
		System.out.println("alice1 == alice3:" + (alice1 == alice3));
		
		System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));
		
		System.out.println("alice1.equals(bob):" + alice1.equals(bob));
		
		System.out.println("bob.toString():" + bob);
	}
}
