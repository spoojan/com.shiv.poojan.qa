package practice;

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);
		HashMap<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "Jack");
		map.put(emp2, "Jack");

		System.out.println(map.size());

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(i1, "Jack");
		map2.put(i2, "Jack");
		System.out.println(map2.size());
	}

}

/**
 * Comment/uncomment the below code & see the difference in outputs after
 * running the code. https://www.youtube.com/watch?v=Nr56SlbMed4 Since , Integer
 * class has used the hash code & equals method in implementation hence it
 * doesn't allow the duplicate values while Employee class doesn't have the hash
 * code & equals method implementation in it. We can explicitly can call has
 * code & equals method . just right click in the class>> Source>> hashcode &
 * equals methods as below
 * 
 * @author spoojan
 *
 */

class Employee {
	int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
