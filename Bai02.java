public class Bai02{
    private static final int iterators = 1000000;

    public static void measureString(){
        String temp = "Hello";
        double start = System.currentTimeMillis();
        int i = 0;
        while(i++ <= iterators){
            temp += "World";
        }
        double end = System.currentTimeMillis();
        System.out.printf("Thời gian thực hiện với String: %.1f\n", end - start);
    }

    public static void measureStringBuilder(){
        StringBuilder temp = new StringBuilder("Hello");
        double start = System.currentTimeMillis();
        int i = 0;
        while(i++ <= iterators){
            temp.append("World");
        }
        double end = System.currentTimeMillis();
        System.out.printf("Thời gian thực hiện với StringBuilder: %.1f\n", end - start);
    }

    public static void measureStringBuffer(){
        StringBuffer temp = new StringBuffer("Hello");
        double start = System.currentTimeMillis();
        int i = 0;
        while(i++ <= iterators){
            temp.append("World");
        }
        double end = System.currentTimeMillis();
        System.out.printf("Thời gian thực hiện với StringBuffer: %.1f\n", end - start);
    }
    public static void main(String[] args){
        measureString();
        measureStringBuilder();
        measureStringBuffer();
    }
}
