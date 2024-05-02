public class Course {

    String classId;
    int capacity;
    int studentCount;
    String title;

    public static void main(String[] args) {
        Course math = new Course();

        math.setTitle("Mathematics");
        math.setStudentCount(40);
        math.setCapacity(50);
        math.setClassId("Math classes");

        math.printDetails();
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassId() {
        return classId;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void printDetails() {
        System.out.println("Class ID: " + getClassId() + ", Capacity: " + getCapacity() + ", Student Count: " + getStudentCount() + ", Title: " + getTitle());
    }
}
