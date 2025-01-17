package com.example.producttable.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.producttable.R;
import com.example.producttable.adapter.ProductAdapter;
import com.example.producttable.entities.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<Product> products;
    private EditText inpId,inpName,inpDesc,inpStock,inpPrc;
    private Button btn_add;
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

//
        recyclerView = findViewById(R.id.recView);
//        TODO init EditText
        products = new ArrayList<>();
        RecyclerView.Adapter adapter = new ProductAdapter(products);

//
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        products.add(new Product("PD0001", "Pencil", "A tool for writing", 10, 1.20));
        products.add(new Product("PD0002", "Pen", "A ballpoint pen", 15, 1.50));
        products.add(new Product("PD0003", "Notebook", "A ruled notebook", 8, 3.75));
        products.add(new Product("PD0004", "Eraser", "Removes pencil marks", 20, 0.80));
        products.add(new Product("PD0005", "Sharpener", "Sharpens pencils", 12, 1.00));
        products.add(new Product("PD0006", "Ruler", "A 30cm ruler", 6, 2.50));
        products.add(new Product("PD0007", "Marker", "A black marker", 10, 1.20));
        products.add(new Product("PD0008", "Glue Stick", "Non-toxic glue", 8, 1.75));
        products.add(new Product("PD0009", "Scissors", "Cuts paper easily", 5, 4.25));
        products.add(new Product("PD0010", "Tape", "Adhesive tape roll", 15, 1.50));
        products.add(new Product("PD0011", "Highlighter", "A yellow highlighter", 12, 1.25));
        products.add(new Product("PD0012", "Folder", "A plastic folder", 10, 3.00));
        products.add(new Product("PD0013", "Paper Clips", "A pack of clips", 25, 2.00));
        products.add(new Product("PD0014", "Binder", "A ring binder", 5, 6.50));
        products.add(new Product("PD0015", "Sketchbook", "A4 drawing pad", 7, 5.75));
        products.add(new Product("PD0016", "Paintbrush", "Set of brushes", 6, 4.99));
        products.add(new Product("PD0017", "Canvas", "A small canvas", 8, 3.80));
        products.add(new Product("PD0018", "Graph Paper", "Ruled graph sheets", 9, 2.99));
        products.add(new Product("PD0019", "Calculator", "Pocket calculator", 3, 9.99));
        products.add(new Product("PD0020", "Whiteboard", "A magnetic board", 4, 14.99));

    }


}