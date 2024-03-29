package developer.dailyreportapp;


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
        this.location = "";
        this.notes = "";
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

    public String getHelperID() {
        if (helperID == -1)
            return "";
        else
            return ""+ helperID;
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

    public String getGallons() {
        if (gallons == -1)
            return "";
        else
            return ""+ String.format("%.02f", gallons);
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    public String getAmountPaid() {

        if (amountPaid == -1)
            return "";
        else
            return ""+ String.format("%.02f", amountPaid);
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

    public String getNotes()
    {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String toString()
    {
        return  "{\"report:\"{" +
                "\"driver_id:\" \"" + getDriverID() + "\"," +
                "\"helper_id:\" \"" + getHelperID() + "\"," +
                "\"gallons:\" \"" + getGallons() + "\"," +
                "\"amount_paid:\" \"" + getAmountPaid() + "\"," +
                "\"notes:\" \"" + getNotes() + "\"," +
                "\"truck_number:\" \"" + getTruckNum() + "\"," +
                "\"mileage:\" \"" + getMileage() + "\"," +
                "\"location:\" \"" + getLocation() + "\"" +
                "}}";
    }

    public boolean isValid()
    {
        if (driverID == -1 || truckNum == -1 || mileage == -1 || location.equals(""))
            return false;
        else
            return true;
    }

    public String getEmpty()
    {
        String message = "REQUIRED:\n";
        if(driverID == -1)
            message+= "Driver ID.\n";
        if(truckNum == -1)
            message+= "Truck Number.\n";
        if(mileage == -1)
            message+= "Mileage.\n";
        if(location.equals(""))
            message+= "Location.";
        return message;
    }
}
