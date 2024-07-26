package com.example.memeapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.memeapp.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        button=findViewById(R.id.button);

        int arr[]={R.drawable.hritamm,
                   R.drawable.hritammm,
                   R.drawable.hritammmm,
                   R.drawable.image,
                   R.drawable.imagee,
                   R.drawable.ronaldo};
        binding.imageView.setImageResource(arr[0]);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Random random=new Random();
                int i=random.nextInt(arr.length);
                binding.imageView.setImageResource(arr[i]);
            }
        });
    }
}