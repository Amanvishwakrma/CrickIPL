package com.jpex.crickipl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // this is a Data class from where we are going to fetch data into the cards

    private RecyclerView recyclerView;
    private ArrayList<Match> list = new ArrayList<Match>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.matchesRecyclerView);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        initlist();

        recyclerView.setAdapter(new MatchAdapter(this, list));





    }

    private void initlist() {
        list.add(new Match("IPL 2023", "CSK","MI","250","200","CSK Won By 50 Runs"));
        list.add(new Match("IPL 2023", "CSK","MI","250","200","CSK Won By 50 Runs"));
        list.add(new Match("IPL 2023", "CSK","MI","250","200","CSK Won By 50 Runs"));
        list.add(new Match("IPL 2023", "CSK","MI","250","200","CSK Won By 50 Runs"));




    }
}




