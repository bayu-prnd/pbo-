public class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new String[20];
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < this.numCourses; i++) {
            if (this.courses[i].equalsIgnoreCase(course)) {
                return false; 
            }
        }
        this.courses[numCourses] = course;
        this.numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        int targetIndex = -1;
        
        for (int i = 0; i < this.numCourses; i++) {
            if (this.courses[i].equals(course)) {
                targetIndex = i;
                break;
            }
        }

        if (targetIndex == -1) {
            return false;
        }

        for (int i = targetIndex; i < this.numCourses - 1; i++) {
            this.courses[i] = this.courses[i + 1];
        }
        
        this.courses[numCourses - 1] = null;
        this.numCourses--;
        return true;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}