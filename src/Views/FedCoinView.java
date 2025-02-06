package Views;

import java.time.LocalDateTime;

public class FedCoinView {
    public void printMoneyCoinDetails(int value, int id, LocalDateTime time) {
        System.out.println("Student Details:");
        System.out.println("Value: " + value);
        System.out.println("OwnerID: " + id);
        System.out.println("Issued Time: " + time);
    }
}
