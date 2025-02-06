package Models;
import java.time.LocalDateTime;

public class MoneyCoin {
    private int value;
    private int ownerID;
    private LocalDateTime issuedDate;

    public MoneyCoin(int value, int ownerID, LocalDateTime issDateTime){
        this.value = value;
        this.ownerID = ownerID;
        this.issuedDate = issDateTime;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setOwnerID(int ownerID){
        this.ownerID = ownerID;
    }

    public int getOwnerID(){
        return ownerID;
    }

    public void setIssuedDate(LocalDateTime time){
        this.issuedDate = time;
    }
    
    public LocalDateTime getIssuedDate(){
        return issuedDate;
    }
}
