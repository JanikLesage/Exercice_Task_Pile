package ca.uqtr.dmi.exercice_task_pile;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import ca.uqtr.dmi.exercice_task_pile.databinding.ActivityActivityBinding;

public class ActivityA extends AppCompatActivity {
    private ActivityActivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityActivityBinding.inflate(getLayoutInflater());
        //title to activity
        setTitle("Activity A");
        setContentView(binding.getRoot());
        binding.CreateA.setOnClickListener(this::onClickButton);
        binding.CreateB.setOnClickListener(this::onClickButton);
        binding.BackButton.setOnClickListener(this::onClickButton);
    }

    public void onClickButton(android.view.View view) {
        if(view.getId() == R.id.CreateA) {
            //Create a new letter to put in activity
            binding.Letter.setText(String.valueOf((char) (Math.random() * 26 + 'A')));
            //Create new activity main
            Intent intent = new Intent(this, ActivityA.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.CreateB) {
            binding.Letter.setText(String.valueOf((char) (Math.random() * 26 + 'A')));
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.BackButton) {
            getOnBackPressedDispatcher().onBackPressed();
        }
    }
}