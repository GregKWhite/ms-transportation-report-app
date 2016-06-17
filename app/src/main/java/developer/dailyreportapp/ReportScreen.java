package developer.dailyreportapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import static java.lang.Integer.parseInt;

public class ReportScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_screen);

        //links objects to their layout counterparts
        final EditText driverInput = (EditText)findViewById(R.id.driverBox);
        final EditText helperInput = (EditText)findViewById(R.id.helperBox);
        final EditText truckInput = (EditText)findViewById(R.id.truckBox);
        final EditText mileageInput = (EditText)findViewById(R.id.mileageBox);
        final EditText gallonsInput = (EditText)findViewById(R.id.gallonsBox);
        final EditText moneyInput = (EditText)findViewById(R.id.moneyBox);
        final EditText locationInput = (EditText)findViewById(R.id.locationBox);
        final EditText notesInput = (EditText)findViewById(R.id.notesBox);

        final TextView debugText = (TextView)findViewById(R.id.debugText);
        Button submitButton = (Button)findViewById(R.id.submitButton);

        submitButton.setOnClickListener
        (
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                       Report newReport = new Report();
                       String debug = "Empty Fields: ";

                        if (isEmpty(driverInput))
                            debug += "Driver,";
                        else
                            newReport.setDriverID(Integer.parseInt(driverInput.getText().toString()));
                        if (isEmpty(helperInput))
                            debug += "Helper,";
                        else
                            newReport.setHelperID(Integer.parseInt(helperInput.getText().toString()));
                        if (isEmpty(truckInput))
                            debug += "Truck Number,";
                        else
                            newReport.setTruckNum(Integer.parseInt(truckInput.getText().toString()));
                        if (isEmpty(mileageInput))
                            debug += "Mileage,";
                        else
                            newReport.setMileage(Double.parseDouble(mileageInput.getText().toString()));
                        if (isEmpty(gallonsInput))
                            debug += "Gallons,";
                        else
                            newReport.setGallons(Double.parseDouble(gallonsInput.getText().toString()));
                        if (isEmpty(moneyInput))
                            debug += "$ Amount Paid,";
                        else
                            newReport.setAmountPaid(Double.parseDouble(moneyInput.getText().toString()));
                        if (isEmpty(locationInput))
                            debug += "Location,";
                        else
                            newReport.setLocation(locationInput.getText().toString());
                        if (isEmpty(notesInput))
                            debug += "Notes,";
                        else
                            newReport.setNotes(notesInput.getText().toString());

                        debugText.setText(debug);

                        //add isReportValid() here
                        new ReportManager().execute(newReport);
                        //add resetFields() here
                    }
                }
        );
    }

    //when given an EditText object, returns if the field is empty or not.
    public boolean isEmpty(EditText input)
    {
        if (input.getText().toString().equals(""))
            return true;
        else if (!input.getText().toString().equals(""))
            return false;
        else
            return true;
    }

    public void resetFields()
    {

    }
}
