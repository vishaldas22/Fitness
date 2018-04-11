package com.example.vishal.fitness;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private String[] titles = {"ABS",
            "CHEST",
            "SHOULDER",
            "BICEPS",
            "TRICEPS",
            "BACK",
            "CARDIO",
    };

    private int[] images = { R.drawable.abs,
            R.drawable.chest,
            R.drawable.shoulder,
            R.drawable.bicep,
            R.drawable.triceps,
            R.drawable.back,
            R.drawable.cardio,
            //R.drawable.android_image_8
    };

    private Context mContext;

    public MyAdapter() {

    }

    public MyAdapter(Context mContext) {
        this.mContext = mContext;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage;
        public TextView itemTitle;

        public ViewHolder(final View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.image);
            itemTitle = (TextView)itemView.findViewById(R.id.text);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();

//                    Snackbar.make(v, "Click detected on item " + position,
//                            Snackbar.LENGTH_LONG)
//                            .setAction("Action", null).show();
                    if(position == 0)
                    {
                        mContext.startActivity(new Intent(mContext, AbsActivity.class));
                    }
                    else if(position == 1)
                    {
                        Intent i = new Intent(mContext, ChestActivity.class);
                        mContext.startActivity(i);
                    }
                    else if(position == 2)
                    {
                        Intent i = new Intent(mContext, ShoulderActivity.class);
                        mContext.startActivity(i);
                    }
                    else if(position == 3)
                    {
                        Intent i = new Intent(mContext, BicepsActivity.class);
                        mContext.startActivity(i);
                    }
                    else if(position == 4)
                    {
                        Intent i = new Intent(mContext, AbsActivity.class);
                        mContext.startActivity(i);
                    }
                    else if(position == 5)
                    {
                        Intent i = new Intent(mContext, TricepsActivity.class);
                        mContext.startActivity(i);
                    }
                    else if(position == 6)
                    {
                        Intent i = new Intent(mContext, BackActivity.class);
                        mContext.startActivity(i);
                    }
                    else if(position == 7)
                    {
                        Intent i = new Intent(mContext, CardioActivity.class);
                        mContext.startActivity(i);
                    }
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.items, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
