package week06;

class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person() {}

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Person[firstName=" + firstName +
               ", lastName=" + lastName +
               ", gender=" + gender + "]";
    }
    public boolean equals(Person p) {
        if (p == null) return false;
        return firstName.equals(p.firstName) &&
               lastName.equals(p.lastName) &&
               gender.equals(p.gender);
    }
}


public class Teacher extends Person {
    private String department;
    private String[] courses;
    
    public Teacher() {}
    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        String courseList = "";
        if (courses != null) {
            for (String c : courses) {
                courseList += c + " ";
            }
        }
        return "Teacher[" + super.toString() +
               ", department=" + department +
               ", courses=" + courseList.trim() + "]";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        if (!super.equals(t)) return false;
        if (!department.equals(t.department)) return false;

        if (courses == null && t.courses == null) return true;
        if (courses == null || t.courses == null) return false;
        if (courses.length != t.courses.length) return false;

        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(t.courses[i])) return false;
        }
        return true;
    }
}