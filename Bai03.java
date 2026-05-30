import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine().trim();
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$!%]).{8,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if(m.matches()){
            System.out.println("Mật khẩu hợp lệ. ");
        }
        else{
            System.out.println("Mật khẩu không hợp lệ. ");
        }
    }
}
