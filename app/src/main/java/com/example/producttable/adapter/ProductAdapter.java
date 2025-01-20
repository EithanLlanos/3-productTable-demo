package com.example.producttable.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.producttable.R;
import com.example.producttable.entities.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    ArrayList<Product> products;

    public ProductAdapter(ArrayList<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ViewHolder holder, int pos) {
        Product product = products.get(pos);
        holder.prodId.setText(product.getId());
        holder.prodName.setText(product.getName());
        holder.prodDesc.setText(product.getDesc());
        holder.prodStock.setText(String.valueOf(product.getStock()));
        holder.prodPrice.setText(String.format("$%.2f", product.getPrice()));
        holder.prodDel.setOnClickListener(v -> {
            products.remove(holder.getAdapterPosition());
            notifyItemRemoved(holder.getAdapterPosition());
//            Redundant
//            notifyItemChanged(holder.getAdapterPosition(), products.size());
            Toast.makeText(v.getContext(), R.string.prodRemoved, Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //        public  TextView textView;
        TextView prodId, prodName, prodDesc, prodStock, prodPrice;
        Button prodDel;

        public ViewHolder(View itemView) {
            super(itemView);
            prodId = itemView.findViewById(R.id.textView1);
            prodName = itemView.findViewById(R.id.textView2);
            prodDesc = itemView.findViewById(R.id.textView3);
            prodStock = itemView.findViewById(R.id.textView4);
            prodPrice = itemView.findViewById(R.id.textView5);
            prodDel = itemView.findViewById(R.id.btn_del);
        }

    }


}
