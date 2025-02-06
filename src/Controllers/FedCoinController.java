package Controllers;

import java.time.LocalDateTime;

import Models.MoneyCoin;
import Views.FedCoinView;

public class FedCoinController {
    private MoneyCoin model;
    private FedCoinView view;

    public FedCoinController(MoneyCoin moneyCoin,FedCoinView fedCoinView){
        this.model = moneyCoin;
        this.view = fedCoinView;
    }
    
    public int getMoneyCoinValue(){
        return model.getValue();
    }

    public void setMoneyCoinValue(int value){
        model.setValue(value);
    }

    public int getMoneyCoinOwnerID(){
        return model.getOwnerID();
    }

    public void setMoneyCoinOwnerID(int id){
        model.setOwnerID(id);
    }

    public LocalDateTime getMoneyCoinIssuedDateTime(){
        return model.getIssuedDate();
    }

    public void setMoneyCoinIssuedDateTime(LocalDateTime dateTime){
        model.setIssuedDate(dateTime);
    }

    public void updateView(){
        view.printMoneyCoinDetails
        (
            model.getValue(), 
            model.getOwnerID(), 
            model.getIssuedDate()
        );
    }
}
