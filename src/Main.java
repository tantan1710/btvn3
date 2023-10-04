import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName = "techmaster";
        String passWord = "hoclacoviec";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập username: ");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();

        if(username.equals(userName) && password.equals(passWord)){
            System.out.println("Đăng nhập thành công");
        }else {
            System.out.println("Tài khoản không tồn tại, vui lòng thử lại");
        }

    }
}
