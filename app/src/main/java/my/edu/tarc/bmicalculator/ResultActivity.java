package my.edu.tarc.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    public static final String TAG_MESSAGE = "my.edu.tarc.lab2intent.MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        TextView ResultMessage;
        ResultMessage = findViewById(R.id.ResultMessage);

        //Retrieve intent data
        Intent intent = getIntent(); //Who called me?
        if(intent.hasExtra(MainActivity.TAG_MESSAGE)){
            Double resultBMI = intent.getDoubleExtra(MainActivity.TAG_MESSAGE,0);
            if(resultBMI < 18.5){

            }else if(resultBMI <= 25){

            }else{

            }
            ResultMessage.setText(String.format("BMI : %.2f",resultBMI));
        }

    }
}
