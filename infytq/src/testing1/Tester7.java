package testing1;
//uih


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



class Student {

	private int studentId;
	private String studentName;
	private int courseId;

	public Student(int studentId, String studentName, int courseId) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	@Override
	public boolean equals(Object student) {
		Student otherStudent = (Student) student;
		if (this.studentId == otherStudent.studentId)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}

	@Override
	public String toString() {
		return "Student Id: "+studentId + ", Student Name: " + studentName;
	}

}


class Tester7 {

	/**
	 * @param students
	 * @return
	 * first make a set from the list, which give a set with no duplicate values
	 * then take each element in the set and check if there are duplicate values in the array
	 * i.e initialize a count and if there are more than 1 value then count goes above 1.
	 */
	public static Set<Student> findDuplicateEntries(List<Student> students) {
		//Implement your logic here and change the return statement accordingly 
		Set<Student> studentSet1 = new HashSet<Student>();
		Set<Student> duplicateSet = new HashSet<Student>();
		for (Student stu:students) {
			studentSet1.add(stu);
		}
		for (Student stu1:studentSet1) {
			int count=0;
			for(Student stu2: students) {
			boolean j = stu1.equals(stu2);
			System.out.print(j);
			if(j==true) {
				count++;
				if(count>1)
				duplicateSet.add(stu1);
			}
				
			}
		}
		return duplicateSet;
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student(1001, "Dean", 111));
		students.add(new Student(1002, "Harley", 112));
		students.add(new Student(1003, "Franklin", 113));
		students.add(new Student(1005, "Arden", 113));
		students.add(new Student(1100, "Juliet", 112));
		students.add(new Student(1003, "Franklin", 111));
		students.add(new Student(1001, "Dean", 114));

		Set<Student> duplicateStudents = findDuplicateEntries(students);
		System.out.println("Students who have applied for re-evaluation in more than one subject");
		for(Student student: duplicateStudents)
		    System.out.println(student);
	}
}
