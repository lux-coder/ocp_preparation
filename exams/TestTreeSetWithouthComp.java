import java.util.*;
 
class Student {
    private String name;
    private int age;
 
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	public int getAge(){
		return age;
	}
	
 
    public int hashCode() {
        return name.hashCode() + age;
    }
 
    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
 
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }
	
/* 	public int compareTo(Student s1, Student s2){
		return s1.age - s2.age;
	} */
}
 
public class TestTreeSetWithouthComp {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("James", 20));
        students.add(new Student("James", 20));
        students.add(new Student("James", 22));
		
		Collections.sort(students, new Comparator<Student>(){
			public int compare(Student s1, Student s2){
				return s1.getAge() - s2.getAge();
			}
		});
 
        System.out.println(students.size());
    }
}