public class BonusMilesService {
    public int calculate(int price) {
        int costOneMile = 20;
        int miles = price / costOneMile;
        return miles;
    }
}
