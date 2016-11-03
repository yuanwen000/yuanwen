
public class Param {
	public static void main(String[] args)
	{
		Employee2 harry = new Employee2("Harry",20);
		System.out.println("Befor salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After salary"+ harry.getSalary());
	}
		public static void tripleSalary(Employee2 x)
		{
			x.raiseSalary(200);
		}
	
}

class Employee2
{
	private String name;
	private double salary;
	public Employee2(String n,double s)
	{
		name=n;
		salary=s;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise=salary * byPercent;
		salary += raise;
	}
	
	
}