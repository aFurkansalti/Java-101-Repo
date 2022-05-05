public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false ;
    }

    void addBulkExamNote(double matE, double matO ,double fizikE, double fizikO, double kimyaE, double kimyaO) {
        this.mat.average(matE, matO);
        this.fizik.average(fizikE, fizikO);
        this.kimya.average(kimyaE, kimyaO);
    }

    void isPass() {
        this.isPass = isCheckPass();
        printNote();
        if (this.isPass) {
            System.out.println("Sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız!");
        }
    }

    void calcAvarage() {
        this.average = (this.mat.note + this.fizik.note + this.kimya.note) / 3;
    }

    boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    void printNote() {
        System.out.println("------------");
        System.out.println("Adı: " + this.name);
        System.out.println("No: " + this.stuNo);
        System.out.println("Matematik notu: " + this.mat.note);
        System.out.println("Fizik notu: " + this.fizik.note);
        System.out.println("Kimya notu: " + this.kimya.note);
        System.out.println("Ortalaması: " + this.average);
    }

}
