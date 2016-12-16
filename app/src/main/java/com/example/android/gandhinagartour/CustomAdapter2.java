package com.example.android.gandhinagartour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mind on 15/12/16.
 */

public class CustomAdapter2 extends ArrayAdapter<Places> {
    public CustomAdapter2(Context context, ArrayList<Places> arrayLists) {
        super(context,0, arrayLists);
    }

    Places currentItem;


    static class ViewHolder {
        TextView textHeading, textDescription;
        ImageView ivImage;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        currentItem = getItem(position);

        ViewHolder holder;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.indroda_layout, parent, false);
            holder = new ViewHolder();

            holder.textHeading = (TextView) listItemView.findViewById(R.id.tvHeading);
            holder.textDescription = (TextView) listItemView.findViewById(R.id.tvDescription);
            holder.ivImage = (ImageView) listItemView.findViewById(R.id.ivImageIcon);

            listItemView.setTag(holder);

        } else {
            holder = (ViewHolder) listItemView.getTag();
        }

        holder.textHeading.setText(currentItem.getHeading());
        holder.textDescription.setText(currentItem.getDescription());
        holder.ivImage.setImageResource(currentItem.getImageResourceId());

        return listItemView;
    }
}
