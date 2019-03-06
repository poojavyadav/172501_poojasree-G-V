package com.employee.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.pojo.Employee;
import com.employee.services.EmployeeServicesImpl;

public class EmpTest {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=new Employee();
        //e.setEmpid(1000);
        //e.setEname("poo");
        //e.setJob("ANALYST");
        //e.setMgr(0);
       // e.setSal(35000);
        //e.setComm(0);
        //e.setDeptno(20);
        
        EmployeeDaoImpl d=(EmployeeDaoImpl)c.getBean("edao");
       
       
        //d.insert(e);
       // d.update(e);
        //d.delete(e);
       // EmployeeServicesImpl ser=new EmployeeServicesImpl();
       // ser.updateEmpSal(e);
        List<Employee> list=  d.orderBy();
       
        for(Employee e1:list)
         {        	 System.out.println(e1);
         }
//	}

}
}