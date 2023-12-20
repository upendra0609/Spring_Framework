package com.sikku.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.ListIndexBase;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Employee_Info")
@Data
public class EmployeeInfo implements Serializable {

	private static final long serialVersionUID = -2497301416575266532L;
	@Id
	@GeneratedValue
	private Integer eno;
	@Column(length = 20)
	private String ename;
	@ElementCollection //enables the collection
	@CollectionTable(name = "EMPLOYEE_FRIENDS", joinColumns = @JoinColumn(name = "EMP_ID", referencedColumnName = "eno"))
	@Column(name = "FRIEND_NAME")
	@OrderColumn(name = "FRIEND_IND")
	@ListIndexBase(1)
	private List<String> friends;
	@ElementCollection
	@CollectionTable(name = "EMPLOYEE_PHONES", joinColumns = @JoinColumn(name = "EMP_ID", referencedColumnName = "eno"))
	@Column(name = "PHONE_NUMBER")
	private Set<Long> phones;
	@ElementCollection
	@CollectionTable(name = "EMPLOYEE_IDDETAILS", joinColumns = @JoinColumn(name = "EMP_ID", referencedColumnName = "eno"))
	@Column(name = "ID_NUMBER") // to store map element values
	@MapKeyColumn(name = "ID_TYPES", length = 20) // to store map element keys
	private Map<String, Long> idDetails;
}
