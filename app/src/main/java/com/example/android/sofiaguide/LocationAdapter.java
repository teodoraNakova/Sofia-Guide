package com.example.android.sofiaguide;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location>{

    public LocationAdapter(Activity context, ArrayList<Location> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.location_name);
        nameTextView.setText(currentLocation.getmName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.location_address);
        addressTextView.setText(currentLocation.getmAddress());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.location_description);
        descriptionTextView.setText(currentLocation.getmDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentLocation.getmImageId());

        return listItemView;
    }
}
