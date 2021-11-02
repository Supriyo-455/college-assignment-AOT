package Day3Part2;

public class Day3P3 {
    public static void main(String[] args) {
        Employee emp = new Employee("Haroon", 1);
        Scientist st = new Scientist("Haroon", 1, 5, 30);
        DScientist dst = new DScientist("Haroon", 1, 5, 30, "Nobel");

        // To string methods
        System.out.println(emp.toString());
        System.out.println(st.toString());
        System.out.println(dst.toString());
    }
}

class Employee {
    String name = "";
    int id = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        String text = "Name : " + name + " id:" + id;
        return text;
    }
}

class Scientist extends Employee {
    int no_of_publications = 0;
    int experience = 0;

    Scientist(String name, int id, int nP, int exp) {
        super(name, id);
        this.experience = exp;
        this.no_of_publications = nP;
    }

    @Override
    public String toString() {
        String text = super.toString() + " no_of_publications: " + no_of_publications + " experience: " + experience;
        return text;
    }
}

class DScientist extends Scientist {
    String award = "";

    DScientist(String name, int id, int nP, int exp, String award) {
        super(name, id, nP, exp);
        this.award = award;
    }

    @Override
    public String toString() {
        String text = super.toString() + " award: " + award;
        return text;
    }
}
