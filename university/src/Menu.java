import java.io.InputStream;
import java.lang.annotation.Inherited;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

    class University
    {
        ArrayList<Student> studentsList = new ArrayList<>();
        ArrayList<Faculty> facultyList = new ArrayList<>();
      //  Course courseList = new Course();

        public void menu(ArrayList<String> students,ArrayList<String> faculty)
        {

          //  courseList.courses.add("Math");
           // courseList.courses.add("English");
           // courseList.courses.add("Science");
            for(int i = 0;i<1;)
            {
                System.out.println("""
                        ******** University Menu ********
                        Enter number for Selection-------
                        1. List Students / Faculty\s
                        2. Add Student / Remove Student\s
                        3. Add Faculty / Remove Faculty
                        4. Add Course / Remove Course
                        5. Exit
                        """);
                Scanner input = new Scanner(System.in);
                int selection = input.nextInt();

                switch (selection) {
                    case 1 -> subMenu1(students,faculty);
                    case 2, 3 -> subMenu2(students,faculty);
                    case 4 -> subMenu3(students,faculty);
                    case 5 -> i++;
                }
            }

        }
        public void subMenu1(ArrayList<String> students,ArrayList<String> faculty){
            Scanner input = new Scanner(System.in);
            System.out.println("1. List Students");
            System.out.println("2. List Faculty");
            int selection = input.nextInt();
            if(selection == 1)
                System.out.println(students);
            else
                System.out.println(faculty);
        }
        public void subMenu2(ArrayList<String> students,ArrayList<String> faculty) {
            System.out.println("1. Add Students/Remove");
            System.out.println("2. Add Faculty/Remove");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            System.out.println("1. Add");
            System.out.println("2. Remove");
            int selection2 = input.nextInt();
            System.out.println("Enter Name");
            String name = input.next();
            int index = students.indexOf(name);
            int index2 = faculty.indexOf(name);
            if(selection == 1){
                if(selection2 == 1){
                    students.add(name);
                    Student student = new Student();
                    student.name = name;
                    studentsList.add(student);
                }
                else{
                    students.remove(name);
                    if(!studentsList.isEmpty())
                        studentsList.remove(index);
                }
            }
            else{
                if(selection2 == 1){
                    faculty.add(name);
                    Faculty faculty1 = new Faculty();
                    faculty1.name = name;
                    facultyList.add(faculty1);
                }
                else{
                    faculty.remove(name);
                    if(!facultyList.isEmpty())
                        facultyList.remove(index2);
                }
            }
        }
        public void subMenu3(ArrayList<String> students,ArrayList<String> faculty){
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            Scanner input = new Scanner(System.in);
            int selection = input.nextInt();
            System.out.println("1. Student" );
            System.out.println("2. Faculty");
            int selection2 = input.nextInt();
            System.out.println("Enter Name");
            String name;
            name = input.next();
            System.out.println("""
                    List of Courses:\s
                    1. Math
                    2. English
                    3. Science
                    """);
           // System.out.println(courseList.courses);
            System.out.print("Enter Number : ");
            int course = input.nextInt();
            int index = students.indexOf(name);
            int index2 = faculty.indexOf(name);
            String courseName = "Study Hall";
            if(course == 1)
                courseName = "Math";
            if(course == 2)
                courseName = "English";
            if(course == 3)
                courseName = "Science";
            if(selection == 1){
                if(selection2 == 1){
                    studentsList.get(index).courses.add(courseName);
                    System.out.println(name + " has Course: ");
                    System.out.println(studentsList.get(index).courses);
                }
                else {
                    facultyList.get(index2).courses.add(courseName);
                    System.out.println(name + " has Course: ");
                    System.out.println(facultyList.get(index2).courses);
                }

            }
            else
            {
                if(selection2 == 1) {
                    studentsList.get(index).courses.remove(courseName);
                    System.out.println(name + " has Course: ");
                    System.out.println(studentsList.get(index).courses);
                }
                else {
                    facultyList.get(index2).courses.remove(courseName);
                    System.out.println(name + " has Course: ");
                    System.out.println(facultyList.get(index2).courses);
                }
            }

        }
    }
    class Address extends University{
      int pin,houseNum;
      String streetName,city,state,country;
        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public void setState(String state) {
            this.state = state;
        }
        public void setCountry(String country) {
            this.country = country;
        }
        public void setPin(int pin) {
            this.pin = pin;
        }
        public void setHouseNum(int houseNum) {
            this.houseNum = houseNum;
        }
        public String getStreetName() {
            return streetName;
        }
        public String getCity() {
            return city;
        }
        public String getState() {
            return state;
        }
        public String getCountry() {
            return country;
        }
        public int getPin() {
            return pin;
        }
        public int getHouseNum() {
            return houseNum;
        }
    }
    class Course extends Address{
        int courseCode,credits;
        ArrayList<String> courses = new ArrayList<>();
        public void setCourseCode(int courseCode) {
            this.courseCode = courseCode;
        }

        public void setCredits(int credits) {
            this.credits = credits;
        }

        public int getCourseCode() {
            return courseCode;
        }

        public int getCredits() {
            return credits;
        }
        public void addCourse(String course)
        {
            courses.add(course);
        }
        public void removeCourse(String course){
            courses.remove(course);
        }
        public void printCourses(){
            System.out.println(courses);
        }
    }
    class Person extends Course{
        String name;
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
    class Student extends Person
    {
        ArrayList<String> courses = new ArrayList<>();
        int CIN;
        public void setCIN(int CIN){
            this.CIN = CIN;
        }
        public int getCIN(){
            return CIN;
        }
        public void addCourse(String course){
            courses.add(course);
        }
        public void removeCourse(String course){
            courses.remove(course);
        }
        public void printCourses(){
            System.out.println(courses);
        }

    }
    class Faculty extends Person{
        int idNum;
        ArrayList<String> courses = new ArrayList<>();
        public void addCourse(String course){
            courses.add(course);
        }
        public void removeCourse(String course){
            courses.remove(course);
        }
        public void printCourses(){
            System.out.println(courses);
        }
    }






// Address Class An address has a pincode, house number, street name, city, state or
// province, and country.
// Course Class A course has a course code (eg, 2261 3) and a number of credits (int).
// Person Class A Person has a name and an Address.
//  Note that the subclasses of Person inherit the fields and methods of Person.
//  You may need to override some of the methods in the subclasses.
//  Student Class Student is a subclass of Person.
// In addition to the data inherited from Person, a student has CIN and a course schedule
//   represented by an ArrayList of Courses
//   You must provide ways for a student to add and drop an existing Course.
//  Faculty Member Class Faculty Member is also subclass of Person.
//   A Faculty Member has an employee id number and a teaching schedule, which is an
//  ArrayList of Courses.
//  Provide a way to assign a Faculty Member to teach an existing Course and for a faculty
//  member to find a class in the list and drop it.
//  University Class Write a University class that maintains lists of Students, Courses, and
// Faculty Members and has an instance method containing a menu that provides ways to list
//  them and to create them and add them to the list.
//  Provide ways to delete Students and Faculty Members and for Students and Faculty
//  Members to add and delete Courses from their course schedules.