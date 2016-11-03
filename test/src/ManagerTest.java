
public class ManagerTest {
		public static void main(String[] args)
		{
			Manager boss = new Manager("Juny",5000,1990,1,1);
			boss.setBonus(5000);
			
			Employee[] staff = new Employee[3];
			staff[0]=boss;
			staff[1] = new Employee("mark",3000,1999,1,1);
			staff[2] = new Employee("TOM",3500,1998,1,1);
			
			for(int i = 0;i < staff.length;i++)
			System.out.println("name = "+ staff[i].getName() + "salary = " + staff[i].getSalary()
					+ "hireDate = " + staff[i].getHireDay());
					
		}
	}


