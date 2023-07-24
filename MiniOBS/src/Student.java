public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avg;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avg = 0.0;
        this.isPass = false;
    }

    void addBulkExamNot(int note1, int sNote1, int note2, int sNote2, int note3, int sNote3) {
        if(note1>=0 && note1<=100) {
            this.c1.note = note1;
            this.c1.snote = sNote1;
        }

         if(note2>=0 && note2<=100) {
            this.c2.note = note2;
            this.c2.snote = sNote2;
        }

         if(note3>=0 && note3<=100) {
            this.c3.note = note3;
            this.c3.snote = sNote3;
        }       
        
    }

    void printNote() {
        System.out.println(c1.name + " Notu: \t" + c1.note + " Sözlü Notu: \t" + c1.snote);
        System.out.println(c2.name + " Notu: \t" + c2.note + " Sözlü Notu: \t" + c2.snote);
        System.out.println(c3.name + " Notu: \t" + c3.note + " Sözlü Notu: \t" + c3.snote);
    }
    
    
    void isPass() {
        this.avg = ((this.c1.note*(1.0-this.c1.syuzde))+(this.c1.snote * this.c1.syuzde))
                + ((this.c2.note*(1.0-this.c2.syuzde)) +(this.c2.snote * this.c2.syuzde))
                + ((this.c3.note*(1.0-this.c3.syuzde))+(this.c3.snote * this.c3.syuzde));
        this.avg/=3;
        if(this.avg >= 50) {
            System.out.println("Tebrikler başarıyla sınıfı geçtiniz.");
            this.isPass=true;
        }
        else {
            System.out.println("Sınıfı geçemediniz. ");
            this.isPass=false;
        }

        System.out.println("Ortalamanız: " + this.avg);
    }

}
