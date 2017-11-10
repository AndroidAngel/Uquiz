package com.teamandroidangel.iamangelauditor.uquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    RadioButton choice_a_question_1;
    RadioButton choice_a_question_2;
    RadioButton choice_a_question_6;
    EditText answer_question_3;
    EditText answer_question_5;
    CheckBox choice_a_question_4;
    CheckBox choice_b_question_4;
    CheckBox choice_d_question_4;
    private static final String NUMBER_3_ANSWER = "manny pacquiao";
    private static final String NUMBER_5_ANSWER = "eagle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }
    public void submitAnswer(View view) {
        CharSequence displayResults;
        int score1;
        int score2;
        int score3;
        int score4;
        int score5;
        int score6;
        int totalScore;
        Boolean answer1;
        choice_a_question_1 = this.findViewById(R.id.choice_a_question_1);
        answer1 = choice_a_question_1.isChecked();
        if (answer1) {
            score1 = 1;
        } else {
            score1 = 0;
        }
        Boolean answer2;
        choice_a_question_2 = this.findViewById(R.id.choice_a_question_2);
        answer2 = choice_a_question_2.isChecked();
        if (answer2) {
            score2 = 1;
        } else {
            score2 = 0;
        }
        boolean answer3;
        answer_question_3 = this.findViewById(R.id.answer_question_3);
        answer3 = answer_question_3.getText().toString().toLowerCase().equalsIgnoreCase(NUMBER_3_ANSWER);
        if (!answer3) {
            score3 = 0;
        } else {
            score3 = 1;
        }
        Boolean answer4Choice1;
        Boolean answer4Choice2;
        Boolean answer4Choice3;
        choice_a_question_4 = findViewById(R.id.choice_a_question_4);
        choice_b_question_4 = findViewById(R.id.choice_b_question_4);
        choice_d_question_4 = findViewById(R.id.choice_d_question_4);
        answer4Choice1 = choice_a_question_4.isChecked();
        answer4Choice2 = choice_b_question_4.isChecked();
        answer4Choice3 = choice_d_question_4.isChecked();
        if (answer4Choice1 && answer4Choice2 && !answer4Choice3) {
            score4 = 1;
        } else {
            score4 = 0;
        }
        boolean answer5;
        answer_question_5 = this.findViewById(R.id.answer_question_5);
        answer5 = answer_question_5.getText().toString().toLowerCase().equalsIgnoreCase(NUMBER_5_ANSWER);
        if (answer5) {
            score5 = 1;
        } else {
            score5 = 0;
        }
        Boolean answer6;
        choice_a_question_6 = this.findViewById(R.id.choice_a_question_6);
        answer6 = choice_a_question_6.isChecked();
        if (answer6) {
            score6 = 1;
        } else {
            score6 = 0;
        }
        totalScore = score1 + score2 + score3 + score4 + score5 + score6;
        if (totalScore == 6) {
            displayResults = "Perfect! Great Job :)";
        } else {
            displayResults = "Try Again. Your score is " + totalScore;
        }
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, displayResults, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
