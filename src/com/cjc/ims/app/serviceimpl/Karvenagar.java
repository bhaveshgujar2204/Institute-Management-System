package com.cjc.ims.app.serviceimpl;
import com.cjc.ims.app.servicei.CJC;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import com.cjc.ims.app.model.Batch;
import com.cjc.ims.app.model.Course;
import com.cjc.ims.app.model.Faculty;
import com.cjc.ims.app.model.Student;

public class Karvenagar implements CJC {
	Scanner sc=new Scanner(System.in);
	List<Course> courses=new ArrayList<Course>();
	List<Faculty> faculties= new ArrayList<Faculty>();
	List<Batch> batch= new ArrayList<Batch>();
	List<Student> stu= new ArrayList<Student>();


 
	@Override
	public void addCourse() {
		System.out.println("====== Add Course =======");
		Course c=new Course();
		System.out.println("Enter Course Id ");
		c.setCid(sc.nextInt());
		System.out.println("Enter Course Name");
		c.setCourseName(sc.next());
		courses.add(c);
		System.out.println("Course Added Sucessfully..!");

	}

	@Override
	public void viewCourse() {
		System.out.println("====== View Course =======");
		for(Course g: courses) {
		System.out.println("Course Id  : "+g.getCid() +"  Course Name : "+g.getCourseName() );
		
		}


    		
	}

	@Override
	public void addFaculty() {
		System.out.println("====== Add Faculty =======");
		Faculty f= new Faculty();
		System.out.println("Enter Faculty Id ");
        f.setFid(sc.nextInt());
        System.out.println("Enter Faculty Name ");
        f.setFacultyName(sc.next());
        viewCourse();
		System.out.println();
        System.out.println("Assign Course to Faculty ");
        System.out.println("Select any course Id");
        int cid=sc.nextInt();
        for(Course c: courses) {
        	if(c.getCid()==cid) {
        		f.setCourse(c);
        		faculties.add(f);
        		break;
        		
        	}
        }
		System.out.println("Faculty Added Sucessfully..!");

        		
		
	}

	@Override
	public void viewFaculty() {
		System.out.println("====== View Faculty =======");
		for(Faculty f: faculties) {
			System.out.println("Faculty Id: "+ f.getFid()+" Faculty Name: "+ f.getFacultyName()+" Faculty Course: "+ f.getCourse().getCourseName());
		}

	}

	@Override
	public void addBatch() {
		System.out.println("====== Add Batch =======");
		Batch b= new Batch();
		System.out.println("Enter Batch Id ");
        b.setBid(sc.nextInt());
        System.out.println("Enter Batch Name ");
        b.setBatchName(sc.next());
        viewFaculty();
		System.out.println();
        System.out.println("Assign Faculty to Batch ");
        System.out.println("Select any faculty Id");
        int fid=sc.nextInt();
        for(Faculty f: faculties) {
        	if(f.getFid()==fid) {
        		b.setFaculty(f);
        		batch.add(b);
        		break;
        	}
        	
        }
		System.out.println("Batch Added Sucessfully..!");


	}

	@Override
	public void viewBatch() {
		System.out.println("====== View Batch =======");
		for(Batch b: batch) {
			System.out.println("Batch Id: "+ b.getBid()+" Batch Name: "+ b.getBatchName()+" Batch Faculty: "+ b.getFaculty().getFacultyName());
		}
		
	}

	@Override
	public void addStudent() {
		System.out.println("====== Add Student =======");
		Student s= new Student();
		System.out.println("Enter Student Id ");
        s.setSid(sc.nextInt());
        System.out.println("Enter Student Name ");
        s.setStudentName(sc.next());
        viewBatch();
		System.out.println();
        System.out.println("Assign Batch to Student ");
        System.out.println("Select any Batch Id");
        int bid=sc.nextInt();
        for(Batch b: batch) {
        	if(b.getBid()==bid) {
        		s.setBatch(b);
        		stu.add(s);
        		break;
        	}
        	
        }
		System.out.println("Student Added Sucessfully..!");

	}

	@Override
	public void viewStudent() {
		System.out.println("====== View Student =======");
		for(Student s: stu) {
			System.out.println("Student Id: "+ s.getSid()+" Student Name: "+ s.getStudentName()+" Student Batch: "+ s.getBatch().getBatchName());
		}
		
	}
	

}
