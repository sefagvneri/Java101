public class App {
    public static void main(String[] args) throws Exception {

        Teacher t1 = new Teacher("Sefa", "539", "TRH");
        Teacher t2 = new Teacher("Yusuf", "538", "MTH");
        Teacher t3 = new Teacher("Tayyip", "537", "PHY");

        Course tarih = new Course("Tarih", "TRH101", "TRH", 0.2);
        tarih.addTeacher(t1);
        Course math = new Course("Math", "MAT101", "MTH", 0.3);
        math.addTeacher(t2);
        Course phy = new Course("Physic", "PHY101", "PHY", 0.4);
        phy.addTeacher(t3);

        Student s1 = new Student("Mert", "81", "4", tarih, math, phy);
        s1.addBulkExamNot(20, 30, 35, 40, 45, 50);
        s1.printNote();
        s1.isPass();
        
        


        
        
    }
}
