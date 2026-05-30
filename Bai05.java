import java.util.Scanner;

public class Bai05{
    private static Scanner sc = new Scanner(System.in);
    private static String str;

    public static boolean checkPalindrome(){
        int i = 0, j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        while(true){
            System.out.println("**********MENU**********");
            System.out.println("1. Nhập chuỗi. ");
            System.out.println("2. Đếm số kí tự thường, hoa, số, đặc biệt");
            System.out.println("3. Đảo ngược chuỗi. ");
            System.out.println("4. Kiem tra Palindrome");
            System.out.println("5. Chuan hao chuoi (loại bỏ khoảng trắng dư thừa, viết hoa chữ cái đầu). ");
            System.out.println("6. Thoát.");
            System.out.println("*****************************************");
            System.out.println("Lựa chọn của bạn: ");
            String option = sc.nextLine();
            boolean ok = true;
            switch(option){
                case "1":
                    System.out.print("Nhập chuỗi: ");
                    str = sc.nextLine();
                    break;
                case "2":
                    int kiTuThuong = 0, kiTuHoa = 0,  kiTuSo = 0, kiTuDacBiet = 0;
                    for(int i = 0; i < str.length(); i++){
                        if(str.charAt(i) != ' '){
                            if(Character.isLowerCase(str.charAt(i))) kiTuThuong++;
                            else if(Character.isUpperCase(str.charAt(i))) kiTuHoa++;
                            else if(Character.isDigit(str.charAt(i))) kiTuSo++;
                            else kiTuDacBiet++;
                        }
                    }
                    System.out.println("Số kí tự thường: " + kiTuThuong);
                    System.out.println("Số kí tự hoa: " + kiTuHoa);
                    System.out.println("Số kí tự số: " + kiTuSo);
                    System.out.println("Số kí tự đặc biệt: " + kiTuDacBiet);
                    break;
                case "3":
                    StringBuilder sb = new StringBuilder(str);
                    System.out.println("Chuỗi đảo ngược: " + sb.reverse().toString());
                    break;
                case "4":
                    if(checkPalindrome()){
                        System.out.println("Đây là chuỗi Palindrome. ");
                    }
                    else System.out.println("Đây không phải chuỗi Palindrome. ");
                    break;
                case "5":
                    String temp = str;
                    temp = temp.replaceAll("\\s+", " ");
                    String[] list = temp.split(" ");
                    String result = "";
                    for(var x : list){
                        result += Character.toUpperCase(x.charAt(0));
                        for(int i=1; i<x.length(); i++){
                            result += Character.toLowerCase(x.charAt(i));
                        }
                        result += " ";
                    }
                    str = result.trim();
                    System.out.println("Chuỗi đã được chuẩn hóa: " + str);
                    break;
                case "6":
                    ok = false;
                    break;
                default:
                    System.out.println("Bạn phải nhập đúng định dạng: ");
            }
            if(!ok) break;
        }
    }
}
