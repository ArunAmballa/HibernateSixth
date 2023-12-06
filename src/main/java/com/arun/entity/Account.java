package com.arun.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account 
{
	
	@Id
	private String accNo;
	
	
	private String accName;
	
	private String accType;

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accType=" + accType + "]";
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	
	

}
