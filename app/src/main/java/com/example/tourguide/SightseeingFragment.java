package com.example.tourguide;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class SightseeingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.list_view, container, false);

        String[] sightName = getResources().getStringArray(R.array.sightName);
        String[] sightAddress = getResources().getStringArray(R.array.sightAddress);

        int[] images = {
                R.drawable.sight_eiffel_tower,
                R.drawable.sight_bellagio,
                R.drawable.sight_caesar_palace,
                R.drawable.sight_mandalay_bay,
                R.drawable.sight_mirage,
                R.drawable.sight_hersheys,
                R.drawable.sight_fremont,
                R.drawable.sight_ancient_egypt,
                R.drawable.sight_new_york,
                        };
        String [] sightDescription = getResources().getStringArray(R.array.sightDescription);

         ArrayList<Location> locations = new ArrayList<Location>();

        for (int i = 0; i < sightName.length ; i++) {

            locations.add(new Location(
                    sightName[i],
                    sightAddress[i],
                    sightDescription[i],
                    images[i] ));
                    }

        LocationAdapter locAdapter = new LocationAdapter(getActivity(), locations);

        ListView listView = (ListView) rootview.findViewById(R.id.list);
        listView.setAdapter(locAdapter);

        return rootview;
    }

}



