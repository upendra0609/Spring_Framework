package com.sikku.dao;



import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.sikku.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	@Override
	@Transactional
	public String insert(Employee emp) {
		String status = "";
		try {
			int eno =(int) hibernateTemplate.save(emp);
			if(eno==emp.getEno()) {
				status = "success";
			}else {
				status = "fail";
			}
		} catch (Exception e) {
			status = "fail";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	@Transactional
	public Employee search(int eno) {
		
		Employee emp = null;
		try {
			emp = (Employee)hibernateTemplate.get("com.sikku.beans.Employee", eno);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	@Transactional
	public String update(Employee emp) {
		String status = "";
		try {
			hibernateTemplate.update(emp);
			status = "success";
		} catch (Exception e) {
			status = "fail";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	@Transactional
	public String delete(Employee emp) {
		
		hibernateTemplate.delete(emp);
		return null;
	}

}
