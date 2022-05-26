public class Employee {
    String name;
    double salary;
    double workHours;
    double hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void total(Employee employee) {
        System.out.println("Personel Adı: " + this.name);
        System.out.println("Önceki Maaşı: " + this.salary + "TL");
        double tax = employee.tax();
        double bonus = employee.bonus();
        double raiseSalary = employee.raiseSalary();

        System.out.println("Toplam Maaş: " + (this.salary - tax + bonus + raiseSalary) + "TL");

    }

    public double tax() {
        if (this.salary < 1000.0) {
            System.out.println("---------------------------------------");
            System.out.println("Maaşınız 1000 TL altında olduğundan vergi alınmamaktadır.");
            return this.salary;
        } else if (this.salary > 1000) {
            System.out.println("---------------------------------------");
            System.out.println("Kesilen vergi: " + (this.salary * (3.0 / 100.0)) + "TL");
            return this.salary * (3.0 / 100.0);
        } else {
            System.out.println("---------------------------------------");
            System.out.println("Girdiğiniz maaş bilgisi geçersiz!");
            return 0.0;
        }

    }

    public double bonus() {
        if (this.workHours > 40.0) {
            double bonus = this.workHours - 40.0;
            System.out.println("---------------------------------------");
            System.out.println("Fazladan " + bonus + " saat çalıştığınz için " + bonus * 30.0 + " TL bonus ücret verilmiştir.");
            return bonus * 30.0;
        }

        return salary;
    }

    public double raiseSalary() {
        double raise = 2021.0 - this.hireYear;
        if (raise < 10) {
            System.out.println("---------------------------------------");
            System.out.println(this.name + " isimli personelin maaşına " + (this.salary * (5.0 / 100.0)) + " TL zam yapılmıştır.");
            return this.salary * (5.0 / 100.0);
        } else if (raise > 9 && raise < 20) {
            System.out.println("---------------------------------------");
            System.out.println(this.name + " isimli personelin maaşına " + (this.salary * (10.0 / 100.0)) + " TL zam yapılmıştır.");
            return this.salary * (10.0 / 100.0);
        } else {
            System.out.println("---------------------------------------");
            System.out.println(this.name + " isimli personelin maaşına " + (this.salary * (15.0 / 100.0)) + " TL zam yapılmıştır.");
            return this.salary * (15.0 / 100.0);
        }
    }

}



