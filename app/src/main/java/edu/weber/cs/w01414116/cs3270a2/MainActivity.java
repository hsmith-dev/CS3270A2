package edu.weber.cs.w01414116.cs3270a2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.fragmentContainer1, new FragmentA(), "frag1")
                // allows for the state to be reversed (undo)
                .addToBackStack(null)
                .commit();



        Button btnLoad = findViewById(R.id.btnLoadFrag2);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction()
                        .replace(R.id.fragmentContainer2, new FragmentB(), "frag2")
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnLoad = findViewById(R.id.btnLoadFrag3);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction()
                        .replace(R.id.fragmentContainer3, new FragmentC(), "frag3")
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnLoad = findViewById(R.id.btnLoadFrag4);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction()
                        .replace(R.id.fragmentContainer4, new FragmentD(), "frag2")
                        .addToBackStack(null)
                        .commit();
            }
        });

        btnLoad = findViewById(R.id.btnSwitch34);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction()
                        .replace(R.id.fragmentContainer3, new FragmentD(), "frag3")
                        .replace(R.id.fragmentContainer4, new FragmentC(), "frag4")
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}