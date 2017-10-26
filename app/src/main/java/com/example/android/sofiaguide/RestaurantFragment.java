package com.example.android.sofiaguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> restaurants = new ArrayList<>();
        restaurants.add(new Location(R.string.name_sasa, R.string.address_sasa, R.string.description_sasa, R.drawable.sasa));
        restaurants.add(new Location(R.string.name_garden_house, R.string.address_garden_house, R.string.description_garden_house, R.drawable.garden_house));
        restaurants.add(new Location(R.string.name_mr_pizza, R.string.address_mr_pizza, R.string.description_mr_pizza, R.drawable.mr_pizza));

        LocationAdapter adapter = new LocationAdapter(getActivity(), restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
