package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.recycleview.clases.Producto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvProductos = null;
    private LIstaProductosAdapter adaptadorProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvProductos = findViewById(R.id.rvProductos);
        //
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto("manzana",2.4,2));
        productos.add(new Producto("pera",1.3,3));
        productos.add(new Producto("platano",5.4,12));
        productos.add(new Producto("melon",2.6,4));
        productos.add(new Producto("melocoton",2.2,6));
        productos.add(new Producto("cereza",1.6,4));
        productos.add(new Producto("aguacate",5.2,8));
        productos.add(new Producto("zanahoria",3.7,3));
        productos.add(new Producto("fresa",1.4,7));
        productos.add(new Producto("kiwi",3.6,3));
        //
        adaptadorProductos = new LIstaProductosAdapter(this,productos);
        rvProductos.setAdapter(adaptadorProductos);
        int orientation = getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // In landscape
            rvProductos.setLayoutManager(new GridLayoutManager(this,2));
        } else {
            // In portrait
            rvProductos.setLayoutManager(new LinearLayoutManager(this));
        }




    }
}