package ca.uqtr.dmi.exercice_task_pile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import ca.uqtr.dmi.exercice_task_pile.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //Exercice 1
        binding.Button.setOnClickListener(this::onClickButton);
        binding.BackButton.setOnClickListener(this::onClickButton);
        //Exercice 2
        binding.Exercice2.setOnClickListener(this::onExercice2ButtonPressed);
    }

    //Exercice 1
    public void onClickButton(android.view.View view) {
        if(view.getId() == R.id.Button) {
            //Create a new letter to put in activity
            binding.Letter.setText(String.valueOf((char) (Math.random() * 26 + 'A')));
            //Create new activity main
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.BackButton) {
            getOnBackPressedDispatcher().onBackPressed();
        }
    }
    //Exercice 2
    public void onExercice2ButtonPressed(android.view.View view) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
}