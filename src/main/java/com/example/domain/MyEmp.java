package com.example.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_emp")
@Data
public class MyEmp {
	
	public enum Gender {
		M, F;
	}
	
	@Id
	private Integer empno;
	private String ename;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String job;
	private Integer mgr;
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	private BigDecimal sal;
	private BigDecimal comm;
	private Integer deptno;
}
