package fr.iut.pinguquizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class QuestionActivity extends Activity {

    public TextView question;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.question_layout);
        question = (TextView) findViewById(R.id.questionLabel);
        Button y = (Button) findViewById(R.id.bouton_yes);
        Button n = (Button) findViewById(R.id.bouton_no);

        String str = "";
        if (intent.hasExtra("question")){
            str = intent.getStringExtra("question");
        }

        changeQuestion(str);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeQuestion("pingu power");
            }
        });
    }

    private void changeQuestion(String question){
        this.question.setText(question);
    }
}
