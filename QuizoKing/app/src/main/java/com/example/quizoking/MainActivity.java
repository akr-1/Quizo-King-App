package com.example.quizoking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SubmitResult(View view)
    {    score=0;
         //Checkboxes code begin
        CheckBox option1 = (CheckBox) findViewById(R.id.op1);
        CheckBox option2 = (CheckBox) findViewById(R.id.op2);
        CheckBox option3 = (CheckBox) findViewById(R.id.op3);
        CheckBox option4 = (CheckBox) findViewById(R.id.op4);
       if(option1.isChecked()&&option2.isChecked())
           score=score+1;
        if(option1.isChecked()&&option2.isChecked()&&option3.isChecked()||option1.isChecked()&&option2.isChecked()&&option4.isChecked())
            score=score-1;
        // End
        // EditText1 Code Begins
        EditText answer1= (EditText) findViewById(R.id.ans1);
        String ans= answer1.getText().toString();
        String number = new String("625");
        if(ans.equals(number))
            score=score+1;
        //Ends
        RadioButton F=(RadioButton) findViewById(R.id.false_radio_button);
        if(F.isChecked())
            score=score+1;
        RadioButton T=(RadioButton) findViewById(R.id.true1_radio_button);
        if(T.isChecked())
            score=score+1;
        // EditText2 Code Begins
        EditText answer2= (EditText) findViewById(R.id.ans2);
        String ans1= answer2.getText().toString();
        String num = new String("25");
      if(ans1.equals(num))
            score=score+1;
        //Ends
        Toast.makeText(this,"Your Score:" + score + "/5",Toast.LENGTH_SHORT).show();
    }
    //RadioButton Code

}