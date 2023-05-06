package Example;

public class Test1 {
    public static void main(String[] args) {
        double rand = Math.random();
        rand = rand * 10000;
        double scale = Math.pow(10, -3);
        double result = Math.ceil(rand * scale) / scale;
        int time = (int) result;
        System.out.println(time);

    }
}
