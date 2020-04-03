import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentManagement {
    LinkedList<Student> listStudent = new LinkedList<Student>();

    public void addStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Họ và tên");
        String name = input.nextLine();
        System.out.println("Giới tính nam? true-false");
        boolean isMan = input.nextBoolean();
        input.nextLine();
        System.out.println("Ngày sinh");
        int dayOfBirth = input.nextInt();
        input.nextLine();
        System.out.println("Địa chỉ");
        String adress = input.nextLine();
        System.out.println("Mã sinh viên");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Điểm trung bình");
        int scoreAverage = input.nextInt();
        input.nextLine();
        System.out.println("Email");
        String email = input.nextLine();
        Student student = new Student(name, isMan, dayOfBirth, adress, id, scoreAverage, email);
        listStudent.add(student);
    }

    public void disPlayList() {
        for (int i = 0; i < listStudent.size(); ++i) {
            listStudent.get(i).toString();
        }
    }

    public void delete(int id) {
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).getId() == id) {
                listStudent.remove(i);
            } else {
                System.out.println("Không tìm thấy sinh viên này");
            }
        }
    }

    public void change(int id) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).getId() == id) {
                System.out.println("sua ten");
                String name = scanner.nextLine();
                listStudent.get(i).setFullname(name);
                System.out.println("Giơi tinh nam? true-false");
                boolean isMan = scanner.nextBoolean();
                listStudent.get(i).setMale(isMan);
                scanner.nextLine();
                System.out.println("ngay sinh");
                int dayOfBirth = scanner.nextInt();
                listStudent.get(i).setDayOfBirth(dayOfBirth);
                scanner.nextLine();
                System.out.println("dia chi");
                String address = scanner.nextLine();
                listStudent.get(i).setAddress(address);
                System.out.println("id sinh vien");
                int idStudent = scanner.nextInt();
                listStudent.get(i).setId(idStudent);
                scanner.nextLine();
                System.out.println("diem trung binh");
                int scoreAverage = scanner.nextInt();
                listStudent.get(i).setScoreAverage(scoreAverage);
                scanner.nextLine();
                System.out.println("email");
                String email = scanner.nextLine();
                listStudent.get(i).setEmail(email);
            } else {
                System.out.println("trong danhs sach khong co id sinh vien do");
            }
        }
    }

    public void idFind(int id) {
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).getId() == id) {
                listStudent.get(i).toString();
            } else {
                System.out.println("trong danh sach khong co id do");
            }
        }
    }

    public void nameFind(String name) {
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).getFullname() == name) {
                listStudent.get(i).toString();
            } else {
                System.out.println("trong danh sach khong co ten do");
            }

        }


    }

    public void findScholarship() {
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).isScholarship()) {
                listStudent.get(i).toString();
            } else {
                System.out.println("Khong co sinh vien nao duoc hoc bong");
            }
        }
    }

    public void findWoman() {
        for (int i = 0; i < listStudent.size(); ++i) {
            if (!listStudent.get(i).isMale()) {
                listStudent.get(i).toString();
            } else {
                System.out.println("khong co sinh vien nu");
            }
        }
    }

}
