package Homework;

public class Homework_1 {
    // цены за вещи
    double palto = 70;
    double hat = 25;
    double costume = 53;
    double sorchka = 19;
    double tufli = 41;

    // скидки

    double discpalto = 77;
    double dischat = 37;
    double disccostume = 44;
    double disctufli = 32;

    static double person = 312;

    public static double math() {
        // цены за вещи
        double palto = 70;
        double hat = 25;
        double costume = 53;
        double sorchka = 19;
        double tufli = 41;

        // скидки

        double discpalto = 77;
        double dischat = 37;
        double disccostume = 44;
        double disctufli = 32;
        double itog;

        discpalto = discpalto * 0.01;
        disccostume = disccostume * 0.01;
        dischat = dischat * 0.01;
        disctufli = disctufli * 0.01;

        palto = palto * discpalto;
        costume = costume * disccostume;
        hat = hat * dischat;
        tufli = tufli * disctufli;

        itog = palto + hat + tufli + sorchka + costume;

        return(itog);
    }

    public static void main(String[] args) {
        if (math() <= person){
            System.out.println("У вас хватило денег");
        }
        else {
            System.out.println("У вас не хватило денег");
        }
    }
}

