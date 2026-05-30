import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        String temp = email.replaceAll("\\s+", "");
        Pattern p = Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\w{2,6}$");
        Matcher m = p.matcher(temp);
        if(m.matches()){
            System.out.println("Email hợp lệ. ");
        }
        else{
            System.err.println("Email không hợp lệ. ");
        }
    }
}
