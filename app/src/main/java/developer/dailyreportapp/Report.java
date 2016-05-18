package developer.dailyreportapp;

/**
 * Created by Alberto on 5/18/2016.
 */
public class Report {
    private int driverID;
    private int helperID;
    private int truckNum;
    private double mileage;
    private double gallons;
    private double amountPaid;
    private String location;
    private String notes;

    public Report() {
        this.driverID = -1;
        this.helperID = -1;
        this.truckNum = -1;
        this.mileage = -1;
        this.gallons = -1;
        this.amountPaid = -1;
        this.location = "NONE";
        this.notes = "NONE";
    }

    public Report(int driverID, int helperID, int truckNum, double mileage, double gallons, double amountPaid, String location, String notes) {
        this.driverID = driverID;
        this.helperID = helperID;
        this.truckNum = truckNum;
        this.mileage = mileage;
        this.gallons = gallons;
        this.amountPaid = amountPaid;
        this.location = location;
        this.notes = notes;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    public int getHelperID() {
        return helperID;
    }

    public void setHelperID(int helperID) {
        this.helperID = helperID;
    }

    public int getTruckNum() {
        return truckNum;
    }

    public void setTruckNum(int truckNum) {
        this.truckNum = truckNum;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getGallons() {
        return gallons;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String toString()
    {
        return "Driver ID: " + getDriverID() + " Helper ID: " + getHelperID();
    }

    public boolean isIncomplete()
    {
        return true;
    }
}
