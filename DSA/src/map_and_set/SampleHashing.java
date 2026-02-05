package map_and_set;

import java.time.LocalDate;
import java.util.HashSet;


// if i add an element in set hashcode method will get invoked also equals method needs to be overriden vice versa;

public class SampleHashing {
	public static void main(String[] args) {
		HashSet<Employee> employees = new HashSet<>();
		employees.add(new Employee(1,"Sahil","Male",LocalDate.of(2003, 12, 5),5,"sahilghosh0512@gmail.com",9593771926l));
		employees.add(new Employee(2,"Animesh","Male",LocalDate.of(2003, 12, 5),5,"sahilghosh0512@gmail.com",9593771926l));
		employees.add(new Employee(3,"Sayan","Male",LocalDate.of(2003, 12, 5),5,"sahilghosh0512@gmail.com",9593771926l));
		employees.add(new Employee(4,"Rishi","Male",LocalDate.of(2003, 12, 5),5,"sahilghosh0512@gmail.com",9593771926l));
		employees.add(new Employee(5,"Sombit","Male",LocalDate.of(2003, 12, 5),5,"sahilghosh0512@gmail.com",9593771926l));
		employees.add(new Employee(6,"Arnab","Male",LocalDate.of(2003, 12, 5),5,"sahilghosh0512@gmail.com",9593771926l));
		employees.add(new Employee(7,"Diptyanil","Male",LocalDate.of(2003, 12, 5),5,"sahilghosh0512@gmail.com",9593771926l));
		employees.add(new Employee(7,"Diptyanil","Male",LocalDate.of(2003, 12, 5),5,"sahilghosh0512@gmail.com",9593771926l));
		
//		System.out.println(employees);
//		
//		Iterator<Employee> a = employees.iterator();
//		while(a.hasNext()) {
//			System.out.println(a.next());
//		}
		for(Employee employee:employees) {
			System.out.println(employee);
		}
	}

}
