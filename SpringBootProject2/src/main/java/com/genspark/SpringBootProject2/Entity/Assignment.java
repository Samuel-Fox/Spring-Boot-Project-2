package com.genspark.SpringBootProject2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="table_assignments")
public class Assignment
{
	@Id
	@Column(name = "a_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private float grade;
	private boolean submitted;

	public Assignment(){}

	public Assignment(String name, float grade, boolean submitted)
	{
		this.name = name;
		this.grade = grade;
		this.submitted = submitted;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float getGrade()
	{
		return grade;
	}

	public void setGrade(float grade)
	{
		this.grade = grade;
	}

	public boolean isSubmitted()
	{
		return submitted;
	}

	public void setSubmitted(boolean submitted)
	{
		this.submitted = submitted;
	}
}
