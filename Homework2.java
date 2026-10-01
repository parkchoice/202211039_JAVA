import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phone;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return phone;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            students[i] = new Student();

            System.out.print("학번 이름 전공 전화번호를 입력하세요: ");

            int studentId = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            students[i].setStudentId(studentId);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhone(phone);
        }

        System.out.println();
        System.out.println("입력된 학생 정보");

        for (int i = 0; i < 3; i++) {
            String phone = Long.toString(students[i].getPhone());
            phone = "010-" + phone.substring(1, 5) + "-" + phone.substring(5);

            System.out.println("학번: " + students[i].getStudentId());
            System.out.println("이름: " + students[i].getName());
            System.out.println("전공: " + students[i].getMajor());
            System.out.println("전화번호: " + phone);
            System.out.println();
        }

        sc.close();
    }
}
