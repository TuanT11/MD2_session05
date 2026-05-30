import java.util.Arrays;
import java.util.Scanner;

public class Bai06{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String[] list = new String[10000];
        int i = 0;
        while(true){
            System.out.println("*******MENU********");
            System.out.println("1. Thêm tên sinh viên. ");
            System.out.println("2. Hiển thị danh sách sinh viên. ");
            System.out.println("3. Tìm tên sinh viên theo từ khóa. ");
            System.out.println("4. Đếm số sinh viên bắt đầu bằng từ khóa nhập vào. ");
            System.out.println("5. Sắp xếp danh sách tên theo thứ tự từ A - Z. ");
            System.out.println("6. Thoát");
            System.out.println("============================");
            String option = sc.nextLine();
            switch(option){
                case "1":
                    System.out.print("Nhập tên sinh viên: ");
                    list[i++] = sc.nextLine();
                    System.out.println("Đã thêm: " + list[i-1]);
                    break;
                case "2":
                    System.out.println("Danh sách sinh viên: ");
                    for(int j = 0; j<i; j++){
                        System.out.print((j + 1) + ".");
                        System.out.println(list[j]);
                    }
                    break;
                case "3":
                    System.out.print("Nhập từ khóa: ");
                    String regex = sc.nextLine();
                    System.out.println("Nhập từ khóa tìm kiếm: ");
                    for(int j = 0; j<i; j++){
                        if(list[j].matches("^.*" + regex + ".*$")){
                            System.out.println("- " + list[j]);
                        }
                    }
                    break;
                case "4":
                    System.out.print("Nhập chữ cái: ");
                    char kiTu = sc.nextLine().charAt(0);
                    int cnt = 0;
                    for(int j = 0; j<i ; j++){
                        if(list[j].matches("^" + kiTu + ".*$")) cnt++;
                    }
                    System.out.println("Số sinh viên có tên bắt đầu bằng " + kiTu + " là: " + cnt);
                    break;
                case "5":
                    Arrays.sort(list, 0, i);
                    System.out.println("Danh sách đã được sắp xếp từ A - Z");
                    break;
                case "6":
                    System.out.println("Tạm biệt. ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai định dạng. ");
            }
        }
    }
}