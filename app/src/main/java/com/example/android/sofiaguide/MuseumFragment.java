package com.example.android.sofiaguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> museums = new ArrayList<>();
        museums.add(new Location(R.string.name_museum_socialist, R.string.address_museum__socialist, R.string.description_museum_socialis, R.drawable.museum_socialist));
        museums.add(new Location(R.string.name_museum_earth_man, R.string.address_museum_earth_man, R.string.description_museum_earth_man, R.drawable.museum_earth_man));
        museums.add(new Location(R.string.name_museum_national_history, R.string.address_museum_natural_history, R.string.description_national_museum_history, R.drawable.museum_national_museum_history));

        LocationAdapter adapter = new LocationAdapter(getActivity(), museums);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
