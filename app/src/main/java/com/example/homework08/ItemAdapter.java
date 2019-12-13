package com.example.homework08;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> mItem;

    static class ViewHolder extends RecyclerView.ViewHolder{
//        View itemView;
        ImageView itemImage;
        TextView itemText,itemWriter;
        public ViewHolder(View view){
            super(view);
//            itemView = view;
            itemImage = (ImageView) view.findViewById(R.id.image);
            itemWriter = (TextView)view.findViewById(R.id.writer);
            itemText = (TextView) view.findViewById(R.id.text);
        }
    }

    public ItemAdapter(List<Item> itemList){
        mItem = itemList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    public void onBindViewHolder(ViewHolder holder,int position){
        Item item = mItem.get(position);
        holder.itemImage.setImageResource(item.getImageId());
        holder.itemWriter.setText(item.getWriter());
        holder.itemText.setText(item.getText());
    }

    public int getItemCount(){
        return mItem.size();
    }
}
