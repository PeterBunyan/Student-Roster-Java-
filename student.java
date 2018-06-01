import java.lang.reflect.Array;
import java.util.Arrays;

public class student
{
    private Integer studentID;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private Integer[] grades;


    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
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


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public Integer[] getGrades() {
        return grades;
    }

    public void setGrades(Integer[] grades) {
        this.grades = grades;
    }



    public student (Integer sID, String fName, String lName, String Email, Integer ageNum, Integer[] gradesNum)
    {
        //constructor
        studentID = sID;
        firstName = fName;
        lastName = lName;
        email = Email;
        age = ageNum;
        grades = gradesNum;

    }
    public String print()
    {
        //output example: Student ID: 2 [tab] First Name: Suzan [tab] Erickson [tab] Age: 19 [tab] Grades: [91, 72, 85]
        return "Student ID: " + getStudentID() + "\tFirst Name: " + getFirstName() + "\tLast Name: " + getLastName() + "\tAge: " + getAge() + "\tGrades: " + Arrays.toString(getGrades());
    }
}
