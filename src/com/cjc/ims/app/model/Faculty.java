package com.cjc.ims.app.model;

public class Faculty {
 
	  private int fid;
	  private String facultyName;
	  private Course course;
	  public int getFid() {
		  return fid;
	  }
	  public void setFid(int fid) {
		  this.fid = fid;
	  }
	  public String getFacultyName() {
		  return facultyName;
	  }
	  public void setFacultyName(String facultyName) {
		  this.facultyName = facultyName;
	  }
	  public Course getCourse() {
		  return course;
	  }
	  public void setCourse(Course course) {
		  this.course = course;
	  }
	  
}
