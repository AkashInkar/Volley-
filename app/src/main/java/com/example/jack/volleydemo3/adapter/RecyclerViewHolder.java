package com.example.jack.volleydemo3.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jack.volleydemo3.DisplayActivity;
import com.example.jack.volleydemo3.R;
import com.example.jack.volleydemo3.SecondActivity;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView name,realname,team,publisher;
    ImageView img;
    Context context;
    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        realname = itemView.findViewById(R.id.realname);
        team =itemView.findViewById(R.id.team);
        publisher = itemView.findViewById(R.id.publisher);
        img = itemView.findViewById(R.id.img);
        this.context = context;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,SecondActivity.class);
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        Intent intent = new Intent(context,SecondActivity.class);
//        context.startActivity(intent);
//
//    }
}
