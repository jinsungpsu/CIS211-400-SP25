import java.io.*;
import java.util.*;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            ArrayList<Student> data = getStudentData(new File("confidentialInformation.csv"));
            System.out.println(data);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    reads a file
    returns a list of students

    source data is CSV
    social security number, name, grade
    0, 1, 2
     */
    static ArrayList getStudentData(File studentFile) throws FileNotFoundException {
        ArrayList<Student> list = new ArrayList<>();
        Scanner input = new Scanner(new File("confidentialInformation.csv"));

        while (input.hasNextLine()) {
            String studentData = input.nextLine();
            String[] studentDataParts = studentData.split(",");
            String name = studentDataParts[1].trim();
            int ssn = Integer.parseInt(studentDataParts[0].trim());
            char grade = studentDataParts[2].trim().charAt(0);

            Student student = new Student(name, ssn, grade);
            list.add(student);
        }
        return list;
    }

    static ArrayList<Student> getStudentDataBetter(File studentFile) throws IOException {
        ArrayList<Student> list = new ArrayList<>();

        // Use BufferedReader instead of Scanner
        BufferedReader reader = new BufferedReader(new FileReader(studentFile));
        String studentData;

        // get rid of header row
        reader.readLine();

        // Read each line of the file
        while ((studentData = reader.readLine()) != null) {
            String[] studentDataParts = studentData.split(",");

            if (studentDataParts.length != 3){
                continue;
            }
            // Process the parts
            String name = studentDataParts[1].trim();
            if (studentDataParts[1] == "") {
                name = "Default name";
            }

            int ssn = Integer.parseInt(studentDataParts[0].trim());
            char grade = studentDataParts[2].trim().charAt(0);

            // Create a Student object and add it to the list
            Student student = new Student(name, ssn, grade);
            list.add(student);
        }

        // Close the BufferedReader
        reader.close();

        return list;
    }
}

class Student {
    private String name;
    private int id;
    private char grade;

    public Student(String name, int id, char grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}