package com.jsp.student;

import com.jsp.student.Repositry.StudentRepositry;
import com.jsp.student.dto.StudentDto;
import com.jsp.student.entity.StudentInfo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setName("Svetabh");
		studentInfo.setAge(26);

		studentInfo.setEmail("sveatbh2777@gmail.com");
		studentInfo.setYearOfPassout(2020);

		studentInfo.setHighestQualification("b.tech");
		studentInfo.setJoiningDate("18-MAY-2016");

	StudentRepositry studentRepositry = new StudentRepositry();
//		studentRepositry.saveStudentDetails(studentInfo);
//
//		StudentInfo studentInfo2 = studentRepositry.getElementById(1);
		// System.out.println(studentInfo2);

		StudentDto studentDto = new StudentDto();
		studentDto.setEmail("shbhm2777");
		studentDto.setId(1);
		studentDto.setHighestDegree("P>H>D");
		studentRepositry.updateStudentDetails(studentDto);
		
		
		
	}
}
