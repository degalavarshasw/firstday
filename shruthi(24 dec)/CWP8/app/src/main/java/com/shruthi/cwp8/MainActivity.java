package com.shruthi.cwp8;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.shruthi.cwp8.R;

public class MainActivity extends AppCompatActivity implements LocationListener
{
    TextView tv;
    @SuppressLint("MissingPermission")

    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        LocationManager lm=(LocationManager)getSystemService(LOCATION_SERVICE);
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,(LocationListener)this);
    }

    public void onLocationChanged(Location location)
    {
        double latitude=location.getLatitude();
        double longitude=location.getLongitude();
        tv.setText("Latitude:"+latitude+"\n"+"Longitude:"+longitude);
    }
    public void onStatusChanged(String provider,int status,Bundle extras)
    {

    }
    public void onProviderEnabled(String provider)
    {
        Toast.makeText(this,"Gps is on",Toast.LENGTH_LONG).show();
    }
    public void onProviderDisabled(String provider)
    {
        Toast.makeText(this,"Gps is off",Toast.LENGTH_LONG).show();
    }
}
