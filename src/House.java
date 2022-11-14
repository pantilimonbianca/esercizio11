import java.util.Arrays;

public class House {

    private int floorsNumber;
    private String address;
    private String [] residentsName;

    public House(int floorsNumber, String address, String [] residentsName){
        this.floorsNumber=floorsNumber;
        this.residentsName=residentsName;
        this.address=address;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsName() {
        return residentsName;
    }

    public void setResidentsNumber(String[] residentsNumber) {
        this.residentsName = residentsNumber;
    }


}
