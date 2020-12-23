package week02;


import java.util.List;
import java.util.ArrayList;

public class VacationCalculator {

    public static void main(String[] args) {
        VacationCalculator vc = new VacationCalculator();

        float japanCost = vc.calculateVacationCost(Destination.Japan, 5);
        float europeCost = vc.calculateVacationCost(Destination.Europe, 7);
        float mexicoCost = vc.calculateVacationCost(Destination.Mexico, 3);

        System.out.format(String.format("Total cost for trip to Japan: $%.2f%n",japanCost));
        System.out.format(String.format("Total cost for trip to Europe: $%.2f%n",europeCost));
        System.out.format(String.format("Total cost for trip to Mexico: $%.2f%n",mexicoCost));
    }



public float calculateVacationCost(Destination dest, int totalNights){
        List<Expense> itenerary = new ArrayList<Expense>();
        itenerary.add(new Cruise(dest));
        itenerary.add(new Dining(dest, totalNights));
        itenerary.add(new Lodging(dest,totalNights));
        float totalCost = tallyExpenses(itenerary);
        return totalCost;
}

float tallyExpenses(List<Expense> expenses){
        float totalCost = 0;
        for(Expense e : expenses) {
            totalCost += e.getCost();
        }
        return totalCost;
     }

}
