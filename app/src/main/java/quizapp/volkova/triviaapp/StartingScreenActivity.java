package quizapp.volkova.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingScreenActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBeginQuiz = findViewById(R.id.begin_trivia);

        btnBeginQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTrivia();
            }
        });
    }

    private void startTrivia() {
        Intent intent = new Intent(StartingScreenActivity.this, QuizActivity.class);
        startActivity(intent);
    };
}