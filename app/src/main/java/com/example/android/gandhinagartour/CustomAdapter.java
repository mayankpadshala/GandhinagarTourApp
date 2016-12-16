package com.example.android.gandhinagartour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by mind on 15/12/16.
 */

public class CustomAdapter extends ArrayAdapter<Places> {

    float[] rating;

    public CustomAdapter(Context context, ArrayList<Places> arrayLists) {
        super(context,0, arrayLists);
        rating = new float[arrayLists.size()];
    }

    Places currentItem;


    static class ViewHolder {
        TextView textHeading, textDescription, rating;
        ImageView ivImage;
        RatingBar ratingBar1;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        currentItem = getItem(position);

        final ViewHolder holder;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.single_list, parent, false);
            holder = new ViewHolder();

            holder.textHeading = (TextView) listItemView.findViewById(R.id.tvHeading);
            holder.textDescription = (TextView) listItemView.findViewById(R.id.tvDescription);
            holder.ivImage = (ImageView) listItemView.findViewById(R.id.ivImageIcon);
            holder.ratingBar1 = (RatingBar) listItemView.findViewById(R.id.ratingBar1);

            listItemView.setTag(holder);

        } else {
            holder = (ViewHolder) listItemView.getTag();
        }
        holder.ratingBar1.setOnRatingBarChangeListener(null);
        holder.ratingBar1.setRating(rating[position]);
        holder.ratingBar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                rating[position] = v;
            }
        });

        holder.textHeading.setText(currentItem.getHeading());
        holder.textDescription.setText(currentItem.getDescription());
        holder.ivImage.setImageResource(currentItem.getImageResourceId());



        return listItemView;
    }
}
