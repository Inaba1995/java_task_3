public class BonusMilesService {
    public int calculate(int price){
        // количество рублей, за которое начисляют 1 бонус/милю
        final int countRub = 20;
        // рассчитываем количество бонусов при помощи целочисленного деления
        return price / countRub;
    }

}
