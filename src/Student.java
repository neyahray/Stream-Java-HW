public class Student {
    String major, name;
    double gpa;

    Student (String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return getName() + ", " + getMajor() + ", gpa: " + getGpa() + ";";
    }
}
