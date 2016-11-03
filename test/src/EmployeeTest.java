import java.util.*;
public class EmployeeTest {
	public static void main(String[] args)
	{
		Employee[] staff=new Employee[2];
			staff[0]=new Employee("Mark",7500,1996,1,1);
			staff[1]=new Employee("Tom",6000,2005,1,1);
	
	
		for(int i=0;i<staff.length;i++)
		{
		    staff[i].raiseSalary(5);
					}
		
		
	for(int i=0;i<staff.length;i++)
	{
		System.out.println("name="+ staff[i].getName()+"salary="+ staff[i].getSalary()
				+"hireDay="+staff[i].getHireDay());
	}		
}
}
