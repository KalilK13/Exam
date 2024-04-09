package exam;

public class Student extends Customer {
    public static long studentID = 0;
    private final double DISCOUNT = .05;
    public long id;

    public Student(String name, Size size) {
        super(name, size);
        id = studentID++;

    }

    @Override
    public void printPriceAfterDiscount(Cloth cloth) {
        System.out.println(cloth.getPrice() - (cloth.getPrice() * DISCOUNT));
    }

    public void printUniqueStudentID(){
        System.out.println(id);
    }




    public static long getStudentID() {
        return studentID;
    }

    public static void setStudentID(long studentID) {
        Student.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "DISCOUNT=" + DISCOUNT +
                '}';
    }

    public void printInfo() {
        System.out.println();
    }
}
