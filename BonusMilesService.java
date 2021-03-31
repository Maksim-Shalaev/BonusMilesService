public class BonusMilesService {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
    // Метод `calculate
    private int calculate(int price) {
        int miles = price / 20;
        System.out.println("Miles:");
        return miles;
    }
}
