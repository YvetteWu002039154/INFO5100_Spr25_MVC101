import java.time.LocalDateTime;

import Controllers.FedCoinController;
import Models.MoneyCoin;
import Views.FedCoinView;

public class App {
    public static void main(String[] args) throws Exception {
        MoneyCoin moneyCoin = new MoneyCoin(10, 1, LocalDateTime.now());

        FedCoinView fedCoinView = new FedCoinView();

        FedCoinController fedCoinController = new FedCoinController(moneyCoin, fedCoinView);

        fedCoinController.updateView();

        fedCoinController.setMoneyCoinValue(50);
        System.out.println("\nUpdated Info:");
        fedCoinController.updateView();
    }
}
