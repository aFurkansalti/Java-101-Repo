public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Pisagor", "MAT", "0563434632323");
        Teacher t2 = new Teacher("Einstein", "FZK", "0563421334235");
        Teacher t3 = new Teacher("Faraday", "KİM", "0564342443576");

        Course math = new Course("Matematik", "101", "MAT");
        Course phys = new Course("Fizik", "101", "FZK");
        Course chem = new Course("Kimya", "101", "KİM");

        math.addTeacher(t1);
        phys.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("Ahmet", "206",  4, math, phys, chem);
        s1.addBulkExamNote(76, 72, 84, 89, 34, 56);
        s1.isPass();

        Student s2 = new Student("Ayşe", "216", 4, math, phys, chem);
        s2.addBulkExamNote(60,100,72,100,100,100);
        s2.isPass();

    }
}
