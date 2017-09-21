package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<com.example.tutorial3.model.StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		for (StudentModel a : studentList) {
			if (a.getNpm().equals(npm)) {
				return a;
			}
		}
		return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudents(){
		return studentList;
	}
	
	@Override
	public void addStudent (StudentModel student) {
		studentList.add(student);
	}
	
	@Override
	public String deleteStudent(String npm) {
		for (StudentModel a : studentList) {
			if (a.getNpm().equals(npm)) {
				studentList.remove(a);
				return a.getNpm();
			}
		}
		return null;
	}
}
