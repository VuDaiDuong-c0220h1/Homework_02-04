import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String fullname = sc.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = sc.nextLine();

        boolean isMale = false;
        if (gender.equals("Nam")){
            isMale = true;
        }
        System.out.println("Nhập ngày sinh");
        int dayOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        Person person = new Person(fullname, isMale, dayOfBirth, address);
        person.display();
    }

}
