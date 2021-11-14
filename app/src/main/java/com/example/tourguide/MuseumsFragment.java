package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String [] museumName = getResources().getStringArray(R.array.museum);
        String [] museumAddress = getResources().getStringArray(R.array.museumAddress);
        String [] museumDescription = getResources().getStringArray(R.array.museumDescription);
        String [] wHours = getResources().getStringArray(R.array.museumWorkingHours);
        int [] images = {
                R.drawable.museum_titanic,
                R.drawable.museum_gallery_aria,
                R.drawable.museum_madame_tussauds,
                R.drawable.museum_real_bodies,
                R.drawable.museum_marvel_station,
                R.drawable.museum_nevada_state_museum,
                R.drawable.museum_neon,
                R.drawable.museum_selfie
                };
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();

        for (int i = 0; i < museumName.length; i++) {

            locations.add(new Location(
                    museumName[i],
                    museumAddress[i],
                    images[i],
                    museumDescription[i],
                   "Working hours: " + wHours[i]));
                     }
        LocationAdapter locAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(locAdapter);

             return rootview;
    }
}