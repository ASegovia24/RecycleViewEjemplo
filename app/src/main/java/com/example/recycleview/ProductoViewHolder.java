package com.example.recycleview;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.clases.Producto;

import java.io.Serializable;

public class ProductoViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

    public static final String EXTRA_PRODUCTO_ITEM = "exProducto";
    private TextView txtNombre;
    private TextView txtPrecio;
    private TextView txtCantidad;
    private ImageView imgProducto;

    private LIstaProductosAdapter lpa;


    public ProductoViewHolder(@NonNull View itemView, LIstaProductosAdapter listaProductosAdapter) {
        super(itemView);
        txtNombre = itemView.findViewById(R.id.txtNombre);
        txtPrecio =  itemView.findViewById(R.id.txtPrecio);
        txtCantidad = itemView.findViewById(R.id.txtCantidad);
        imgProducto = itemView.findViewById(R.id.imgProducto);

        lpa = listaProductosAdapter;
        itemView.setOnClickListener(this);
    }

    public TextView getTxtNombre() {
        return txtNombre;
    }

    public ImageView getImgProducto() {
        return imgProducto;
    }

    public void setImgProducto(ImageView imgProducto) {
        this.imgProducto = imgProducto;
    }

    public void setTxtNombre(TextView txtNombre) {
        this.txtNombre = txtNombre;
    }

    public TextView getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(TextView txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public TextView getTxtCantidad() {
        return txtCantidad;
    }

    public void setTxtCantidad(TextView txtCantidad) {
        this.txtCantidad = txtCantidad;
    }

    @Override
    public void onClick(View view){
        int posicion  = getLayoutPosition();
        Producto p = lpa.getProductos().get(posicion);
        Intent intent = new Intent(lpa.getContexto(),DetallesProductosActivity.class);
        intent.putExtra(EXTRA_PRODUCTO_ITEM,p);
        lpa.getContexto().startActivity(intent);

    }
}
