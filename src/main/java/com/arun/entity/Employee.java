package com.arun.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee 
{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empid;
	
	@Column
	private String ename;
	
	@Column
	private String eaddress;
	
	@Column
	private float esal;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Account account;
	
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Employee()
	{
		System.out.println("Employee Object is Created");
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", eaddress=" + eaddress + ", esal=" + esal
				+ ", account=" + account + "]";
	}
	
	
	
	

}
