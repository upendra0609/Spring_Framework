package com.sikku.factory;

import com.sikku.dao.StudentDao;
import com.sikku.dao.StudentDaoImpl;

public class StudentDaoFactory {
	private StudentDao dao;

	public StudentDaoFactory() {
		if (dao == null) {
			dao = new StudentDaoImpl();
		}
	}


	public void setDao(StudentDao dao) {
		this.dao = dao;
	}



	public StudentDao getStudentDao() {
		return dao;
	}
}
