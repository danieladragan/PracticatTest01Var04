package practicaltest01var04.eim.systems.cs.pub.ro.practicaltest01var04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PracticalTest01Var04ChooseNumber extends AppCompatActivity {

    private EditText numberEditText;
    private EditText numbervalueEditText;
    private Button playButton;
    final public static String NUMBER_INTRO = "numberIntro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var04_choose_number);

        numberEditText = (EditText)findViewById(R.id.number_edit_text);
        numbervalueEditText = (EditText)findViewById(R.id.number_value_edit_text);
        playButton = (Button)findViewById(R.id.play_button);

        playButton.setOnClickListener(buttonClickListener);
    }

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            int numberIntro = Integer.valueOf(numbervalueEditText.getText().toString());

            switch (view.getId()) {
                case R.id.play_button:
          //          leftEditText.setText(String.valueOf(leftNumberOfClicks));
                    Intent intent = new Intent(getApplicationContext(), PracticalTest01Var04PlayActivity.class);
                    intent.putExtra(NUMBER_INTRO, numberIntro);
                    startActivityForResult(intent, 1);
                    break;
            }
        }
    }
}
