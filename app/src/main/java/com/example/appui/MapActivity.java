package com.example.appui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.app.FragmentManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private FragmentManager fragmentManager;
    private MapFragment mapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        fragmentManager = getFragmentManager();
        mapFragment = (MapFragment)fragmentManager.findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
            LatLng location = new LatLng(35.85946320431924, 128.48700056957875); //계명대학교 공학관
            MarkerOptions markerOptions = new MarkerOptions();
            markerOptions.title("계명대학교");
            markerOptions.snippet("공학관");
            markerOptions.position(location);
            googleMap.addMarker(markerOptions);
//          googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 16));
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location, 16));
    }
}