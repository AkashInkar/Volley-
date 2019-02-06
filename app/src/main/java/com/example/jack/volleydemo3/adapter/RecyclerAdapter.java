package com.example.jack.volleydemo3.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.jack.volleydemo3.DisplayActivity;
import com.example.jack.volleydemo3.MainActivity;
import com.example.jack.volleydemo3.R;
import com.example.jack.volleydemo3.SecondActivity;
import com.example.jack.volleydemo3.model.Model;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    ArrayList<Model> arrayList = new ArrayList<>();
    Context context;



    public RecyclerAdapter(ArrayList<Model> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        Model model = arrayList.get(position);

        holder.name.setText(arrayList.get(position).getName());
        holder.realname.setText(arrayList.get(position).getRealname());
        holder.team.setText(arrayList.get(position).getTeam());
        holder.publisher.setText(arrayList.get(position).getCreatedby());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "check", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
