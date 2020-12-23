package week02;

public class Lodging implements Expense {
    Destination _dest;
    int numberNights;
    public Lodging(Destination dest, int nights){

        _dest = dest;
        numberNights = nights;

    }

    public float getCost() {
        switch (_dest) {
            case Mexico:
                return 100.00f * numberNights;
            case Europe:
                return (200.00f * numberNights) * 1.10f;
            case Japan:
                return (300.00f * numberNights) * 1.30f;
            default:
                return 0.0f;
        }
    }
}
