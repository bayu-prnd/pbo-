public class Student extends Person {
    private int numCourses = 0;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        this.courses = new String[50];
        this.grades = new int[50];
    }

    public void addCourseGrade(String course, int grade) {
        this.courses[numCourses] = course;
        this.grades[numCourses] = grade;
        this.numCourses++;
    }

    public void printGrades() {
        for (int idx = 0; idx < this.numCourses; idx++) {
            System.out.println(this.courses[idx] + ": " + this.grades[idx]);
        }
    }

    public double getAverageGrade() {
        if (this.numCourses == 0) return 0.0;
        
        int totalNilai = 0;
        for (int idx = 0; idx < this.numCourses; idx++) {
            totalNilai += this.grades[idx];
        }
        return (double) totalNilai / this.numCourses;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}