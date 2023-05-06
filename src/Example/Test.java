package Example;

public class Test {
    public static void main(String[] args) {
        int a = 123;

        for(int i = 5; i >= 9; i++) {
            a = a % 5 + i;
        }
        System.out.println(a);
    }
}
