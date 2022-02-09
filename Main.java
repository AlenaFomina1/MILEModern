public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int mile = 20;
        int miles = service.calculate(price/mile);
        System.out.println("Всего: " + miles + " миль");
    }
}
