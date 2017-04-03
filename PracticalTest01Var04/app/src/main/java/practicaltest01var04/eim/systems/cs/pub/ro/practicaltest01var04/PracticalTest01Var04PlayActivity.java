package practicaltest01var04.eim.systems.cs.pub.ro.practicaltest01var04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PracticalTest01Var04PlayActivity extends AppCompatActivity {

    private TextView numberguessEditText;
    private TextView numberEditText;

    final public static String NUMBER_INTRO = "numberIntro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var04_play);

        numberEditText = (TextView)findViewById(R.id.number_value_edit_text);
        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey(NUMBER_INTRO)) {
            int numberInt = intent.getIntExtra(NUMBER_INTRO, -1);

            
        }
    }
}
