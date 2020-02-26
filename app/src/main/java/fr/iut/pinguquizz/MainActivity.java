package fr.iut.pinguquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView wallpaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wallpaper = findViewById(R.id.main_imageview_wallpaper);

        final Button button_start = (Button) findViewById(R.id.main_button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> questions = new ArrayList<String>();
                questions.add("pingu est quel animal? manchot");
                questions.add("pingu est trop bo ? manchot");
                questions.add("Combien y a t il de saisons de pingu? 6");
                questions.add("Combien y a t il d'épisodes de pingu? 156");
                questions.add("Quel est le nom de la soeur de pingu? Pinga");
                questions.add("Quel est le métier du papa de pingu? facteur");
                for (String question:questions) {
                    Intent myIntent = new Intent(MainActivity.this, QuestionActivity.class);
                    myIntent.putExtra("question",question);
                    startActivity(myIntent);
                }










            }
        }
        );

    }
}
