package iteratorpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class EmployeeMain1 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1("neha","phaltan",73000);
		Employee1 e2=new Employee1("arya","satara",43000);
		Employee1 e3=new Employee1("supriya","mumbai",60000);
		ArrayList<Employee1>list=new ArrayList<Employee1>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		salaryCalculation(list);
      System.out.println("=================");
      for(Employee1 e:list)
      {
    	  System.out.println(e);
      }
      System.out.println("=================sorting");
      Collections.sort(list);
      for(Employee1 e:list)
      {
    	  System.out.println(e);
      }
      System.out.println("================iterator");
      Iterator<Employee1>it=list.iterator();
  	while(it.hasNext())
  	{
  		System.out.println(it.next());
  	}
	}
	
	
	
	public static void salaryCalculation(List<Employee1>list)
	{
		for(Employee1 e:list)
		{
			if(e.getSalary()>=50000)
			{
				System.out.println(e.geteName());
			}
		}
	}

	}

