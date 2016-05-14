package l337hax.swaglords.mstruckapp;

/**
 * Created by Alberto on 5/13/2016.
 */
public class Report {
    private int driverID;
    private int helperID;
    private int truckNum;
    private double mileage;
    private double gallons;
    private double moneyPaid;
    private String location;
    private String driverNotes;

    public Report()
    {
    }

    public void setDriverID(int input)
    {
        driverID = input;
    }

    public int getDriverID()
    {
        return driverID;
    }
    public void setHelperID(int input)
    {
        helperID = input;
    }
    public int getHelperID()
    {
        return helperID;
    }

    public void setTruckNum(int input)
    {
        truckNum = input;
    }

    public int getTruckNum()
    {
        return truckNum;
    }

    public void setMileage(double input)
    {
        mileage = input;
    }

    public double getMileage()
    {
        return mileage;
    }

    public void setGallons(double input)
    {
        gallons = input;
    }

    public double getGallons()
    {
        return gallons;
    }

    public void setMoneyPaid(double input)
    {
        moneyPaid = input;
    }

    public double getMoneyPaid()
    {
        return moneyPaid;
    }

    public void setLocation(String input)
    {
        location = input;
    }

    public String getLocation()
    {
        return location;
    }

    public void setDriverNotes(String input)
    {
        driverNotes = input;
    }

    public String getDriverNotes()
    {
        return driverNotes;
    }

}
