package com.sikku.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.sikku.dto.Student;

public class StudentDaoImpl implements StudentDao {

	private NamedParameterJdbcTemplate template;

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	// for method reference
	private static Student getStd(ResultSet rs, int index) {
		Student std = new Student();
		try {
			std.setSid(rs.getInt("sid"));
			std.setSname(rs.getString("sname"));
			std.setSaddr(rs.getString("saddr"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return std;
	}

	@Override
	public String add(Student std) {
		String status = "";
		Student searchStudent = search(std.getSid());

		try {
			if (searchStudent == null) {
				String query = "insert into student1 values(:sid,:sname,:saddr)";
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("sid", std.getSid());
				map.put("sname", std.getSname());
				map.put("saddr", std.getSaddr());

				int rowInsetred = template.update(query, map);
				if (rowInsetred == 1) {
					status = "inserted";
				} else {
					status = "not inserted";
				}
			} else {
				status = "student already exist";
			}
		} catch (Exception e) {
			e.printStackTrace();
			status = "something went wrong";
		}
		return status;
	}

	@Override
	public Student search(int sid) {
		Student std = null;

		try {
			String query = "select * from student1 where sid = :sid";
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("sid", sid);
			List<Student> studentList = template.query(query, map, StudentDaoImpl::getStd);
			if (studentList.isEmpty()) {
				std = null;
			} else {
				std = studentList.get(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			std = null;
		}
		return std;
	}

	@Override
	public String update(Student std) {
		String status = "";
		Student searchStudent = search(std.getSid());

		try {
			if (searchStudent == null) {
				status = "Student does not exist";
			} else {
				String query = "update student1 set sname=:sname, saddr=:saddr where sid=:sid";
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("sname", std.getSname());
				map.put("saddr", std.getSaddr());
				map.put("sid", std.getSid());
				int rowUpdate = template.update(query, map);
				if (rowUpdate == 1) {
					status = "updated";
				} else {
					status = "updation failed";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			status = "something went wrong";
		}

		return status;
	}

	@Override
	public String delete(int sid) {
		String status = "";
		Student searchStudent = search(sid);

		try {
			if (searchStudent == null) {
				status = "Student does not exist";
			} else {
				String query = "delete from student1 where sid=:sid";
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("sid", sid);
				int rowDeleted = template.update(query, map);
				if (rowDeleted == 1) {
					status = "deleted";
				} else {
					status = "not deleted";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			status = "something went wrong";
		}

		return status;
	}

}
