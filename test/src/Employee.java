import java.util.*;


public class Employee {
	
	
	private String name;
	private double salary;
	private Date hireDay;
	
public Employee(String n,double s,int year,int month,int day)
{
	name=n;
	salary=s;
	GregorianCalendar calendar= new GregorianCalendar(year,month-1,day);
	hireDay=calendar.getTime();
	
}
public void raiseSalary(double byPercent)
{
	double raise= salary* byPercent;
	salary+=raise;
}
public String getName()
{
	return name;
}
public double getSalary()
{
	return salary;
}
public Date getHireDay()
{
	return hireDay;
}
public boolean equals(Object otherObject)
{
	if(this == otherObject)
		return true;
	if(otherObject == null)
		return false;
	if(getClass() != otherObject.getClass())
		return false;
	Employee other = (Employee)otherObject;
	
	return Objects.equals(name,other.name) && salary == other.salary && Objects.equals(hireDay,other.hireDay);
}
}


