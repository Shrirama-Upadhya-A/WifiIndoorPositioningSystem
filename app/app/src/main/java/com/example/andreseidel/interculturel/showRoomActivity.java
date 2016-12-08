package com.example.andreseidel.interculturel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

import java.util.List;

import java.util.ArrayList;

public class showRoomActivity extends AppCompatActivity {
    EditText roomName;
    Button runRoomLearning;
    Button stopRunning;
    List<Room> rooms = new ArrayList<Room>();
    AppFileManager fileManager;

    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_room);

        roomName = (EditText) findViewById(R.id.roomNameEntry);
        runRoomLearning = (Button) findViewById(R.id.runRoomLearning);

        fileManager = new AppFileManager(this, "arquivo-teste");
    }

    public void sendMessage(View view) {
        runRoomLearning.setText(fileManager.getPath());
        Intent intent = new Intent(this, LearningActivity.class);
        intent.putExtra("message", roomName.getText().toString());
        startActivity(intent);
    }

}