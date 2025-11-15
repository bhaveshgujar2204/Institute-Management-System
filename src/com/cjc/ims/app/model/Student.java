package com.cjc.ims.app.model;

public class Student {
     private int sid;
     private String studentName;
     private Batch batch;

	 public int getSid() {
		 return sid;
	 }
	 public void setSid(int sid) {
		 this.sid = sid;
	 }
	 public String getStudentName() {
		 return studentName;
	 }
	 public void setStudentName(String studentName) {
		 this.studentName = studentName;
	 }
	 public Batch getBatch() {
		 return batch;
	 }
	 public void setBatch(Batch batch) {
		 this.batch = batch;
	 }
	
	 
 
}
