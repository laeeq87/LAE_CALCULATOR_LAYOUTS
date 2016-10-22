package example.itsme.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {

        EditText e1 = (EditText) findViewById(R.id.fisrt_num);
        EditText e2 = (EditText) findViewById(R.id.second_num);
        TextView tv = (TextView) findViewById(R.id.tv_result);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        tv.setText(Integer.toString(sum));
    }
}
