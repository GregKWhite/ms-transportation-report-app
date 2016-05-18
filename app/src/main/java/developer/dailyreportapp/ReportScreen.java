package developer.dailyreportapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReportScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_screen);

        Report newReport = new Report();

        TextView debugText = (TextView)findViewById(R.id.debugText);
        debugText.setText(newReport.toString());
    }
}
