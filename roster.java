import java.util.ArrayList;



public class roster {

    private static ArrayList<student> roster;

    static {
        //adds students to roster
        roster = new ArrayList<>();
        student John = new student(1, "John", "Smith", "John1989@gmail.com", 20, new Integer[]{88, 79, 59});
        student Suzan = new student(2, "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, new Integer[]{91, 72, 85});
        student Jack = new student(3, "Jack", "Napoli", "The_lawyer99yahoo.com", 19, new Integer[]{85, 84, 87});
        student Erin = new student(4, "Erin", "Black", "Erin.black@comcast.net", 22, new Integer[]{91, 98, 82});
        student Henry = new student(5, "Henry", "Scott", "HScott@hotmail.com", 24, new Integer[]{85, 98, 93});

        roster.add(John);
        roster.add(Suzan);
        roster.add(Jack);
        roster.add(Erin);
        roster.add(Henry);
    }


    public static void remove(String studentID) {
        //iterates over roster and removes selected student, if found
        Integer StuID = Integer.parseInt(studentID);
        for (int i = 0; i < roster.size(); i++)
            if (roster.get(i).getStudentID().equals(StuID))
                {
                roster.remove((roster.get(i).getStudentID() - 1));
                System.out.println("Student " + studentID + " was successfully removed from the list.");
                return;
                }
            System.out.println("Error: A student with ID number " + studentID + " was not found.");
    }

    public static void print_all() {
        //prints list of all students in roster
        for (int i = 0; i < roster.size(); i++)
            System.out.println(roster.get(i).print());

        System.out.println();
    }

    public static void print_average_grade(String studentID) {
        //calculates average grade of selected student in roster
        Integer StuID = Integer.parseInt(studentID);
        double sum = 0;

        for (Integer grade : roster.get(StuID - 1).getGrades())
            sum = sum + grade;

        double avg =  sum / roster.get(StuID - 1).getGrades().length;
        System.out.printf(roster.get(StuID - 1).getFirstName() + " " + roster.get(StuID - 1).getLastName() + ": " + "%.1f\n", avg);
        //System.out.printf("%.1f\n", avg);
    }

    private static ArrayList<String> invalidEmails;

    public static void print_invalid_emails () {
        //prints list of invalid email addresses in roster, if found
        invalidEmails = new ArrayList<>();
        for (int i = 0; i < roster.size(); i++) {
            if (!roster.get(i).getEmail().contains("@") || !roster.get(i).getEmail().contains(".") || roster.get(i).getEmail().contains(" ")) {
                invalidEmails.add(roster.get(i).getEmail());
            }
        }

        if (invalidEmails.isEmpty()) {
            System.out.println("No invalid email addresses found.");
        } else {
            System.out.println("The following email addresses are invalid: ");
            for (int j = 0; j < invalidEmails.size(); j++) {
                System.out.println(invalidEmails.get(j));
            }
            System.out.println("Note: A valid e-mail should include an at sign (\"@\") and period (\".\") and doesn't include a space.");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        print_all();
        print_invalid_emails();
        System.out.println("Average grade for students in class:");
        for (int i = 0; i < roster.size(); i++)
            print_average_grade(roster.get(i).getStudentID().toString());
        remove("3");
        remove("3");
    }


}