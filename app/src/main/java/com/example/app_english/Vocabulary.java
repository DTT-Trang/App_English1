package com.example.app_english;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.Firebase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Vocabulary extends AppCompatActivity {

    private final DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    private final List<MyItems> myItemsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

    //getting RecyclerView from file xml
        final RecyclerView recyclerView123 = findViewById(R.id.recyclerView123);
        //setting recyclerview size fixed for every item in the reryclerView
        recyclerView123.setHasFixedSize(true);
        recyclerView123.setLayoutManager(new LinearLayoutManager(Vocabulary.this));

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                myItemsList.clear();
                for (DataSnapshot vocabulary : snapshot.child("vocabulary").getChildren()){

                    if (vocabulary.hasChild("word") && vocabulary.hasChild("types") && vocabulary.hasChild("def")){
                        final String getWord = vocabulary.child("word").getValue(String.class);
                        final String getTypes = vocabulary.child("types").getValue(String.class);
                        final String getDef = vocabulary.child("def").getValue(String.class);
                        MyItems myItems = new MyItems(getWord,getTypes,getDef);
                        myItemsList.add(myItems);
                    }
                }

                recyclerView123.setAdapter(new MyAdapter(myItemsList,Vocabulary.this));

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}