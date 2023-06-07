import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("******************************MENU******************************");
            System.out.println("1. trang chủ");
            System.out.println("2. Yêu thích");
            System.out.println("3. Trang cá nhân");
            System.out.println("4. Danh mục");
            System.out.println("5. Giỏ hàng");
            System.out.println("6. thoát");
            System.out.println("su lua chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("chao mung ban den voi trang chu");
                    break;
                case 2:
                    System.out.println("danh sach yeu thich cua ban");
                    break;
                case 3:
                    System.out.println("trang ca nhan cua ban");
                    break;
                case 4:
                    System.out.println("day la danh muc");
                    break;
                case 5:
                    System.out.println("ban da vao gio hang");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("vui long nhap tu 1-6");

            }
        } while (true);

    }
}