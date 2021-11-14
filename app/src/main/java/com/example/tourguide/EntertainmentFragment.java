package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainmentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String [] funPlaces = getResources().getStringArray(R.array.fun);
        String [] funAddress = getResources().getStringArray(R.array.funAddress);
        String [] price = getResources().getStringArray(R.array.funPrice);
        String [] wHours = getResources().getStringArray(R.array.funWorkingHours);
        int [] images = {
                R.drawable.fun_big_shot,
                R.drawable.fun_x_scream,
                R.drawable.fun_gondola_rides,
                R.drawable.fun_zipline,
                R.drawable.fun_insanity,
                R.drawable.fun_bungee_jumping,
                R.drawable.fun_high_roller_ferris,
                R.drawable.fun_helicopter_rides,
                R.drawable.fun_big_apple_coaster,
                R.drawable.fun_circus
                 };

        View rootview = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        for (int i = 0; i < funPlaces.length ; i++) {

            locations.add(new Location(
                    funPlaces[i],
                    funAddress[i],
                    images[i],
                    "Price for ticket: " + price[i] ,
                    "Open from Monday to Sunday: " + "\n" + wHours[i]));

        }

        LocationAdapter locAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(locAdapter);

        return rootview;
    }
}