package com.example.employee.domain;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Member {

	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;

	private Integer age;

	private Integer memberNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(Integer memberNumber) {
		this.memberNumber = memberNumber;
	}

}
