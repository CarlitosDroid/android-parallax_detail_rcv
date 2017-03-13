package com.carlitosdroid.parallaxdetailrcv.view.adapter;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carlitosdroid.parallaxdetailrcv.MainActivity;
import com.carlitosdroid.parallaxdetailrcv.R;
import com.carlitosdroid.parallaxdetailrcv.model.FoodEntity;

import java.util.List;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 3/6/17.
 *
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ItemViewHolder>{

    private List<FoodEntity> objectList;

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;

    public FoodAdapter(MainActivity activity, List<FoodEntity> objectList) {
        this.objectList = objectList;
    }

    @Override
    public int getItemViewType(int position) {
        return TYPE_ITEM;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_food, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        switch (holder.getItemViewType()){
            case TYPE_HEADER:
                break;
            case TYPE_ITEM:
                if(objectList.get(position).isFavorite()){
                    ((ItemViewHolder)holder).lblTest.setText("Android");
                }else{
                    //((ItemViewHolder)holder).lbvFavorite.setImageResource(R.drawable.ic_star_border_blue_500_24dp);
                }

                break;
            default:
                break;
        }

    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder{
        private final AppCompatTextView lblTest;

        ItemViewHolder(View view) {
            super(view);
            lblTest = (AppCompatTextView) view.findViewById(R.id.lblTest);

        }

    }
}