import java.util.List;

import com.practice.DAOs.Employee__DAO;
import com.practice.DAOs.Employee__DAO__Impl;
import com.practice.model.Employee;

public class Hibernate

{
public static void main(String args[])
{
	Employee__DAO dao = new Employee__DAO__Impl();
	/*Employee e = new Employee(29,"eee","ee",4566d);
	
	dao.save_Employee(e);*/
	List<Object[]> details = dao.get_Employees_Name_Address();
	for(Object e[]:details)
	{
		System.out.println(e[0]+"\t"+e[1]);
	}
	
}
}
