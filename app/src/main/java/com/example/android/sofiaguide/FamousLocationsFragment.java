package com.example.android.sofiaguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FamousLocationsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        ArrayList<Location> famousLocations = new ArrayList<>();
        famousLocations.add(new Location(R.string.name_ndk, R.string.address_ndk, R.string.description_ndk, R.drawable.ndk));
        famousLocations.add(new Location(R.string.name_serdika, R.string.address_serdika, R.string.description_serdika, R.drawable.serdika));
        famousLocations.add(new Location(R.string.name_alexander_nevski, R.string.address_alexander_nevsky, R.string.description_alexander_nevski, R.drawable.alexander_nevski));

        LocationAdapter adapter = new LocationAdapter(getActivity(), famousLocations);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
