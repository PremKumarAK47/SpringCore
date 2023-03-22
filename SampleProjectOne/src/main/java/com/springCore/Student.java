package com.springCore;

public class Student 
{
	
	private int studentId;
	private String studentName;
	private String studentAddr;
	
	public Student(int studentId, String studentName, String studentAddr) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddr = studentAddr;
	}
	public int getStudentId() 
	{
		return studentId;
	}
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String studentName) 
	{
		this.studentName = studentName;
	}
	public String getStudentAddr() 
	{
		return studentAddr;
	}
	
	public Student() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public void setStudentAddr(String studentAddr) 
	{
		this.studentAddr = studentAddr;
	}
	
	@Override
	public String toString() 
	{
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddr=" + studentAddr
				+ "]";
	}
    
	
}
