package CollectionFramework;

import java.util.ArrayList;

public class Driver2 {
	
	public static ArrayList<Employee> findEmpBySal(ArrayList<Employee>e,double salary) {
		ArrayList<Employee>ans = new ArrayList<Employee>();
		for(Employee e1:e) {
			if(e1.salary>salary) {
				ans.add(e1);
			}
		}
		return ans;
	}
	public static ArrayList<Employee> findEmpByDep(ArrayList<Employee>e,String dep) {
		ArrayList<Employee>ans = new ArrayList<Employee>();
		for(Employee e1:e) {
			if(e1.department==dep) {
				ans.add(e1);
			}
		}
		return ans;
	}
	
	public static void print(ArrayList<Employee>e) {
		for(Employee a:e) {
			System.out.print(a.id+" ");
			System.out.print(a.name+" ");
			System.out.print(a.salary+" ");
			System.out.print(a.department+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(10,"abc",123456,"development"));
		e.add(new Employee(11,"abcd",234567,"It"));
		e.add(new Employee(12,"abcde",345678,"development"));
		e.add(new Employee(13,"abcdef",456789,"It"));
		e.add(new Employee(14,"abcdefg",123456,"development"));
		
		print(findEmpByDep(e, "development"));
		print(findEmpBySal(e, 300000));
	}

}
