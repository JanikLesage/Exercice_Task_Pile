package ca.uqtr.dmi.exercice_task_pile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ca.uqtr.dmi.exercice_task_pile.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    //Create a new activity when the button Button is clicked where the textView Letter will have a random letter generated
    public void onClickButton(android.view.View view) {
        if(view.getId() == R.id.Button) {
            //Create a new letter to put in activity
            binding.Letter.setText(String.valueOf((char) (Math.random() * 26 + 'A')));
            //Create new activity main
            MainActivity main = new MainActivity();
            setContentView(main.binding.getRoot());
        }

    }
}