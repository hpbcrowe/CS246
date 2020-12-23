package week02;

public class Cruise implements Expense {
    //Store Enum value
    Destination _dest;

    /****************************************************
     * Non Default Constructor
     ****************************************************/
    public Cruise(Destination dest){
        _dest = dest;
    }

    /*****************************************
     * GET COST
     *****************************************/
    public float getCost(){
        switch (_dest) {
            case Mexico:
                return 1000.00f;
            case Europe:
                return 2000.00f;
            case Japan:
                return 3000.00f;
            default:
                return 0.0f;
        }

    }
}
