public class List {
    private Student student1;

    public void add(Student studentToAdd) {
        student1 = studentToAdd;
    }

    @Override
    public String toString() {
        return student1.toString();
    }


}
