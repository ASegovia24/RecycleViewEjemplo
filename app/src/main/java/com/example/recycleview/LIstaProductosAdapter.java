package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.clases.Producto;

import java.util.ArrayList;

public class LIstaProductosAdapter extends RecyclerView.Adapter<ProductoViewHolder> {
    private Context contexto =  null;
    private ArrayList<Producto> productos = null;
    private LayoutInflater inflate = null;

    public LIstaProductosAdapter(Context contexto, ArrayList<Producto> productos) {
        this.contexto = contexto;
        this.productos = productos;
        inflate = LayoutInflater.from(this.contexto);
    }

    public Context getContexto() {
        return contexto;
    }

    public void setContexto(Context contexto) {
        this.contexto = contexto;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public LayoutInflater getInflate() {
        return inflate;
    }

    public void setInflate(LayoutInflater inflate) {
        this.inflate = inflate;
    }

    @NonNull
    @Override
    public ProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = inflate.inflate(R.layout.item_producto,parent,false);
        ProductoViewHolder evh = new ProductoViewHolder(mItemView,this);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductoViewHolder holder, int position) {
        Producto p = this.productos.get(position);
        holder.getTxtNombre().setText(p.getNombre());
        holder.getTxtCantidad().setText(String.valueOf(p.getCantidad()));
        holder.getTxtPrecio().setText(String.valueOf(p.getPrecio()));
        holder.getImgProducto().setImageResource(R.drawable.fruta);

    }

    @Override
    public int getItemCount() {
        return this.productos.size();
    }
}
