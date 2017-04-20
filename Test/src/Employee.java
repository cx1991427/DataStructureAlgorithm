
public class Employee{
	public int salary;
	public String name;
	
	public Employee(int salary, String name){
		this.salary=salary;
		this.name=name;
	}
	
	public boolean equals(){
		return false;
	}
	
	public int hashCode(){
		return 0;
	}
	
	public String toString(){
		return "name is:"+name+"	 	salary is:"+salary;
	}
}
