public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch ) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void printTeacher() {
        System.out.println("Teacher name: " + this.name);
        System.out.println("Teacher mpno: " + this.mpno);
        System.out.println("Teacher branch: " + this.branch);
    }
}
