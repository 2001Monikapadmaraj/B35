package Day4.org.tnsindia.Constructor;

public class employee {
	
		public String name;
		public int salary;
		//defult Constructor
		employee()
		{
			System.out.println("Default Contructor");
		}
		public employee(int salary,String name)
		{ 
			this.salary=salary;
			this.name= name;
		}
		 
		public void print()
		{
			System.out.println("salary of"+name+" is "+salary);
			
		}
}

	