package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.recycleview.clases.Producto;

public class DetallesProductosActivity extends AppCompatActivity {
    private TextView txtDetallesNombre;
    private TextView txtDetallesPrecio;
    private TextView txtDetallesCantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_productos);

        txtDetallesNombre = (TextView) findViewById(R.id.detallesNombre);
        txtDetallesPrecio = (TextView) findViewById(R.id.detallesPrecio);
        txtDetallesCantidad = (TextView) findViewById(R.id.detallesCantidad);

        Intent intent = getIntent();
        if (intent !=   null){
            Producto p =(Producto) intent.getSerializableExtra(ProductoViewHolder.EXTRA_PRODUCTO_ITEM);
            txtDetallesNombre.setText(p.getNombre());
            txtDetallesPrecio.setText(String.valueOf(p.getPrecio()));
            txtDetallesCantidad.setText(String.valueOf(p.getCantidad()));

        }
    }
}