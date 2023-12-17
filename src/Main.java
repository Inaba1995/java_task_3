public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);

        price = 20_013;
        miles = service.calculate(price); // должно получиться 1000
        System.out.println(miles);

        price = 58_645;
        miles = service.calculate(price); // должно получиться 2932
        System.out.println(miles);

    }
}