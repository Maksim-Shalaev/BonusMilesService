public class MainV1 {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 220_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}