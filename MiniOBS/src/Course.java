public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int snote;
    double syuzde;

    Course(String name, String code, String prefix, double syuzde) {
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.syuzde=syuzde;
        int snote = 0;
        int note = 0;
        
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher=teacher;
        }
        else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }     
    }

    void printTeacher(Teacher teacher) {
        this.teacher.printTeacher();
    }

}
