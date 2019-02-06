package com.example.jack.volleydemo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.jack.volleydemo3.model.Model;
import com.example.jack.volleydemo3.model.Model_Second;
import com.example.jack.volleydemo3.service.BackgroundTask;
import com.example.jack.volleydemo3.service.MySingleton;

import org.json.JSONObject;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView akash,inkar;
    ArrayList<Model_Second> arrayList = new ArrayList<>();
    Model_Second model_second;
    BackgroundTask backgroundTask;
    String server_url = "https://simplifiedcoding.net/demos/marvel/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        akash =findViewById(R.id.akash);
        inkar = findViewById(R.id.inkar);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, server_url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                akash.setText(model_second.getName());
                akash.setText(model_second.getBio());

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),"something went wrong",Toast.LENGTH_SHORT).show();
            }
        });
        MySingleton.getInstance(this).addToRequestque(jsonObjectRequest);
    }



}
