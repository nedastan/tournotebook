package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.list_view, container, false);
        final ArrayList<Location> locations = new ArrayList<Location>();

        String [] restaurantName = getResources().getStringArray(R.array.restaurants);
        String [] restaurantAddress = getResources().getStringArray(R.array.restaurantAddress);
        String [] restaurantNumber = getResources().getStringArray(R.array.restaurantNumber);
        String [] priceRange = getResources().getStringArray(R.array.priceRange);
        String [] cuisine = getResources().getStringArray(R.array.cuisine);
        String [] wHours = getResources().getStringArray(R.array.restaurantWorkingHours);
        int [] images = {
                R.drawable.cafe_black_craft_burger,
                R.drawable.cafe_lavo_restaurant,
                R.drawable.cafe_americana_restaurant,
                R.drawable.cafe_boiling_crab,
                R.drawable.cafe_water_grill,
                R.drawable.cafe_chart_house,
                R.drawable.cafe_honey_salt,
                R.drawable.cafe_abriya_raku,
                R.drawable.cafe_sw_steakhouse
                          };
        for (int i = 0; i < restaurantName.length ; i++) {

            locations.add(new Location(
                    restaurantName[i],
                    restaurantAddress[i],
                    restaurantNumber[i],
                    images[i],
                    "Cuisine: " + cuisine[i] + "\n\nPrice range: " + priceRange[i] ,
                    "Working hours: " + wHours[i]));
        }

        LocationAdapter locAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(locAdapter);

        return rootview;
    }
}