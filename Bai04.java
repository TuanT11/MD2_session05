import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai04{
    public static String generateString(int n){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n;i++){
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{" + n + ",}$";
            Pattern p = Pattern.compile(regex);
            String result;
            while(true){
                String temp = generateString(n);
                Matcher m = p.matcher(temp);
                if(m.matches()){
                    result = temp;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
