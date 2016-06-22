package developer.dailyreportapp;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Spinner;

import static java.lang.Integer.parseInt;

public class ReportScreen extends AppCompatActivity {

    private EditText driverInput;
    private EditText helperInput;
    private EditText truckInput;
    private EditText mileageInput;
    private EditText gallonsInput;
    private EditText moneyInput;
    private Spinner locationInput;
    private EditText notesInput;
    private TextView debugText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_screen);
        setUpFields();

        final TextView debugText = (TextView)findViewById(R.id.debugText);
        Button submitButton = (Button)findViewById(R.id.submitButton);

        submitButton.setOnClickListener
        (
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Report newReport = fieldsToReport();
                        if(newReport.isValid()) {
                            debugText.setText("");
                            new ReportManager().execute(newReport);
                        }
                        else
                        {
                            debugText.setText(newReport.getEmpty());
                            Log.d("test", "Invalid report.");
                        }
                    }
                }
        );
    }

    public Report fieldsToReport()
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
        //if (isEmpty(locationInput))
        //    debug += "Location,";
        newReport.setLocation(String.valueOf(locationInput.getSelectedItem()));
        if (isEmpty(notesInput))
            debug += "Notes,";
        else
            newReport.setNotes(notesInput.getText().toString());
        Log.d("test", debug);
        return newReport;
    }

    public boolean isEmpty(EditText input)
    {
        if (input.getText().toString().equals(""))
            return true;
        else if (!input.getText().toString().equals(""))
            return false;
        else
            return true;
    }

    public void setUpFields()
    {
        driverInput = (EditText)findViewById(R.id.driverBox);
        helperInput = (EditText)findViewById(R.id.helperBox);
        truckInput = (EditText)findViewById(R.id.truckBox);
        mileageInput = (EditText)findViewById(R.id.mileageBox);
        gallonsInput = (EditText)findViewById(R.id.gallonsBox);
        moneyInput = (EditText)findViewById(R.id.moneyBox);
        locationInput = (Spinner)findViewById(R.id.locationBox);
        notesInput = (EditText)findViewById(R.id.notesBox);
    }
    public void resetFields()
    {
        gallonsInput.setText("");
        moneyInput.setText("");
        notesInput.setText("");
        Log.d("test", "Fields Rest");
    }

    public void storeFields()
    {

    }

    public void loadFields()
    {

    }
}
