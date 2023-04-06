package Example;

public class Main {
    public static void main(String[] args) {
        // задание полей
        float matPlat = 100; // материнская плата с процессором
        // byte matPlatDiscount = 45; // скидка (в процентах)
        float ram = 41; // оперативная память
        // byte ramDiscount = 55;
        float rom = 39; // SSD (постоянная память)
        // byte romDiscount = 30;
        float cooler = 12; // башенный кулер
        // byte coolerDiscount = 25;
        float caseAndPower = 21; // корпус и блок питания
        // byte caseAndPowerDiscount = 32;


        float account = 160; // счёт пользователя


        System.out.println("Сейчас узнаем хватит денег или нет");
        if ((matPlat + ram + rom + cooler + caseAndPower) <= account) {
            System.out.println("Ура денег хватило");
        }
        else {
            System.out.println("Тоска (( денег не хватило");
        }
    }
}
