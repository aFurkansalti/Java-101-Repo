public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    double exam;
    double oExam;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("İşlem başarıyla gerçekleşti.");
        } else {
            System.out.println("Seçtiğiniz hocanın branşı bu değil.");
        }
    }

    void average(double exam, double oExam) {
        if (exam >= 0 && exam <= 100 && oExam >= 0 && oExam <= 100) {
            this.note = exam*0.8 + oExam*0.2;
        }
    }

    void printTeacherInfo() {
        if (this.teacher != null) {
            this.teacher.print();
        } else {
            System.out.println("İşleminiz gerçekleşemedi.");
        }

    }

}
