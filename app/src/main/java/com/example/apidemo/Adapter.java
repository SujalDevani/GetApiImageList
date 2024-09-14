package com.example.apidemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private final List<Model> products;
    public Context context;

    public Adapter(List<Model> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.getapi, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model product = products.get(position);
        holder.id.setText(product.getId());
        holder.name.setText(product.getName());
        holder.year.setText(product.getYear());
        holder.color.setText(product.getColor());

        // Load image using Picasso
        Picasso.get().load(product.getAvatarUrl()).into(holder.avatar);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView id, name, year, color;
        ImageView avatar;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id);
            name = itemView.findViewById(R.id.name);
            year = itemView.findViewById(R.id.year);
            color = itemView.findViewById(R.id.color);
            avatar = itemView.findViewById(R.id.avatar);
        }
    }
}
