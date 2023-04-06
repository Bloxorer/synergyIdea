package ForHomework;

public class Tickets_new {
    public int all_cost;
    public int number;
    public int discount;
    public int duration_hours;
    public int duration_minutes;
    public int departure_time_hours;
    public int departure_time_minutes;
    public int arriving_time_hours;
    public int arriving_time_minutes;
    public int cost;

    public Tickets_new(int number, int discount, int cost) {
        this.number = number;
        this.discount = discount;
        this.cost = cost;
    }

    public int calculate(){
        all_cost = number * (cost + cost * (discount / 100));
        return all_cost;
    }
}
