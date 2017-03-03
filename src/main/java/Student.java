public class Student {
    String fullName;
    private String bDate;
    private int[] marks;

    protected Student() {

    }

    public Student(String fullName, String bDate, int... marks) {
        this.fullName = fullName;
        this.bDate = bDate;
        this.marks = marks;
    }

    public Student(String fullName) {
        this(fullName, null);
    }
}
