package Example;

import java.util.Random;

public class Lesson11 {

    public int all_cost = 14000;
    public int start = 1000;
    public int stip = 2500;

    public double percent_per_month(double percent_month){
        double percent = 5;
        percent_month = (percent * 0.01) /12;
        return percent_month;
    }

    public int math() {
        double prom;

        int i = 0;
        prom = start + stip;
        prom = prom + (prom * percent_per_month(0));

        while (prom < all_cost) {
            prom = prom + stip;
            prom = prom + (prom * percent_per_month(0));
            i = i + 1;
                    }

        return i;
    }

    public static void main(String[] args) {



        
    }

}
