/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.wearable.geofencing;

/**
 * GEOLOCATIONS FROM:
 * https://geolocation.ws/map/55.601995,12.974675/15/en?types=&limit=300&licenses=
 *
 * EXAMPLE CODE FROM:
 * https://github.com/googlesamples/android-Geofencing
 *
 * DON'T KNOW IF ANYTHING HAPPENS WHEN "RUNNING"
 *
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.61015,12.9786)).title("Cykelpump Kockums Torg"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.5877, 12.9887)).title("Cykelpump Malmö gamla stadion"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6093, 12.9967)).title("Cykelpump, Anna Linds plats"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6025, 12.9679)).title("Cykelpump, Ribersborgsstigen"));

 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6131,12.9767)).title("Turning Torso"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6140, 12.9839)).title("Stapelbäddsparken, skatepark"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6125, 12.9914)).title("Media Evolution City"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6144, 12.9895)).title("Doc Piazza Trattoria"));

 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6156, 12.9857)).title("Kranen K3, Malmö Högskola"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6150, 12.9858)).title("Ubåtshallen"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6108, 12.9949)).title("Orkanen, Malmö Högskola"));

 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.5850,12.9873)).title("Swedbank Stadion"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.5922, 12.9975)).title("Pildammsparken Entré"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.5901, 12.9887)).title("Pildammsparken Tallriken"));

 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.5890, 12.9825)).title("Jet bensinmack, Lorensborg"));

 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6048, 12.9658)).title("Ribersborgs Kallbadhus"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6041, 12.9735)).title("Toalett, Ribersborgsstigen"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6086, 12.9774)).title("Kockum fritid"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6138, 12.9812)).title("Varvsparken"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6137, 12.9725)).title("Daniabadet, Västra Hamnen"));
 * mMap.addMarker(new MarkerOptions().position(new LatLng(55.6171, 12.9744)).title("Scaniabadet, Västra Hamnen"));
 */

/*
import static com.example.android.wearable.geofencing.Constants.ANDROID_BUILDING_ID;
import static com.example.android.wearable.geofencing.Constants.ANDROID_BUILDING_LATITUDE;
import static com.example.android.wearable.geofencing.Constants.ANDROID_BUILDING_LONGITUDE;
import static com.example.android.wearable.geofencing.Constants.ANDROID_BUILDING_RADIUS_METERS;

import static com.example.android.wearable.geofencing.Constants.YERBA_BUENA_ID;
import static com.example.android.wearable.geofencing.Constants.YERBA_BUENA_LATITUDE;
import static com.example.android.wearable.geofencing.Constants.YERBA_BUENA_LONGITUDE;
import static com.example.android.wearable.geofencing.Constants.YERBA_BUENA_RADIUS_METERS;
*/
import static com.example.android.wearable.geofencing.Constants.CONNECTION_FAILURE_RESOLUTION_REQUEST;
import static com.example.android.wearable.geofencing.Constants.CYKELPUMP_KOCKUMS_ID;
import static com.example.android.wearable.geofencing.Constants.CYKELPUMP_KOCKUMS_LATITUDE;
import static com.example.android.wearable.geofencing.Constants.CYKELPUMP_KOCKUMS_LONGITUDE;
import static com.example.android.wearable.geofencing.Constants.CYKELPUMP_KOCKUMS_RADIUS_METERS;
import static com.example.android.wearable.geofencing.Constants.GEOFENCE_EXPIRATION_TIME;
import static com.example.android.wearable.geofencing.Constants.JET_ID;
import static com.example.android.wearable.geofencing.Constants.JET_LATITUDE;
import static com.example.android.wearable.geofencing.Constants.JET_LONGITUDE;
import static com.example.android.wearable.geofencing.Constants.JET_RADIUS_METERS;
import static com.example.android.wearable.geofencing.Constants.KRANEN_ID;
import static com.example.android.wearable.geofencing.Constants.KRANEN_LATITUDE;
import static com.example.android.wearable.geofencing.Constants.KRANEN_LONGITUDE;
import static com.example.android.wearable.geofencing.Constants.KRANEN_RADIUS_METERS;
import static com.example.android.wearable.geofencing.Constants.TAG;
import static com.example.android.wearable.geofencing.Constants.TURNING_TORSO_ID;
import static com.example.android.wearable.geofencing.Constants.TURNING_TORSO_LATITUDE;
import static com.example.android.wearable.geofencing.Constants.TURNING_TORSO_LONGITUDE;
import static com.example.android.wearable.geofencing.Constants.TURNING_TORSO_RADIUS_METERS;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.LocationServices;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements ConnectionCallbacks,
        OnConnectionFailedListener, GoogleApiClient.ConnectionCallbacks {

    // Internal List of Geofence objects. In a real app, these might be provided by an API based on
    // locations within the user's proximity.
    List<Geofence> mGeofenceList;

    // These will store hard-coded geofences in this sample app.
    private SimpleGeofence mTurningTorsoGeofence;
    private SimpleGeofence mKranenGeofence;
    private SimpleGeofence mJetGeofence;
    private SimpleGeofence mCykelPumpKockums;

    // Persistent storage for geofences.
    private SimpleGeofenceStore mGeofenceStorage;

    private LocationServices mLocationService;
    // Stores the PendingIntent used to request geofence monitoring.
    private PendingIntent mGeofenceRequestIntent;
    private GoogleApiClient mApiClient;

    // Defines the allowable request types (in this example, we only add geofences).
    private enum REQUEST_TYPE {ADD}
    private REQUEST_TYPE mRequestType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Rather than displayng this activity, simply display a toast indicating that the geofence
        // service is being created. This should happen in less than a second.
        if (!isGooglePlayServicesAvailable()) {
            Log.e(TAG, "Google Play services unavailable.");
            finish();
            return;
        }

        mApiClient = new GoogleApiClient.Builder(this)
                .addApi(LocationServices.API)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .build();

        mApiClient.connect();

        // Instantiate a new geofence storage area.
        mGeofenceStorage = new SimpleGeofenceStore(this);
        // Instantiate the current List of geofences.
        mGeofenceList = new ArrayList<Geofence>();
        createGeofences();
    }

    /**
     * In this sample, the geofences are predetermined and are hard-coded here. A real app might
     * dynamically create geofences based on the user's location.
     */
    public void createGeofences() {
        // Create internal "flattened" objects containing the geofence data.
        mTurningTorsoGeofence = new SimpleGeofence(
                TURNING_TORSO_ID,                // geofenceId.
                TURNING_TORSO_LATITUDE,
                TURNING_TORSO_LONGITUDE,
                TURNING_TORSO_RADIUS_METERS,
                GEOFENCE_EXPIRATION_TIME,
                Geofence.GEOFENCE_TRANSITION_ENTER | Geofence.GEOFENCE_TRANSITION_EXIT
        );
        mKranenGeofence = new SimpleGeofence(
                KRANEN_ID,                // geofenceId.
                KRANEN_LATITUDE,
                KRANEN_LONGITUDE,
                KRANEN_RADIUS_METERS,
                GEOFENCE_EXPIRATION_TIME,
                Geofence.GEOFENCE_TRANSITION_ENTER | Geofence.GEOFENCE_TRANSITION_EXIT
        );

        mJetGeofence = new SimpleGeofence(
                JET_ID,                // geofenceId.
                JET_LATITUDE,
                JET_LONGITUDE,
                JET_RADIUS_METERS,
                GEOFENCE_EXPIRATION_TIME,
                Geofence.GEOFENCE_TRANSITION_ENTER | Geofence.GEOFENCE_TRANSITION_EXIT
        );

        mCykelPumpKockums = new SimpleGeofence(
                CYKELPUMP_KOCKUMS_ID,                // geofenceId.
                CYKELPUMP_KOCKUMS_LATITUDE,
                CYKELPUMP_KOCKUMS_LONGITUDE,
                CYKELPUMP_KOCKUMS_RADIUS_METERS,
                GEOFENCE_EXPIRATION_TIME,
                Geofence.GEOFENCE_TRANSITION_ENTER | Geofence.GEOFENCE_TRANSITION_EXIT
        );

        // Store these flat versions in SharedPreferences and add them to the geofence list.
        mGeofenceStorage.setGeofence(TURNING_TORSO_ID, mTurningTorsoGeofence);
        mGeofenceStorage.setGeofence(KRANEN_ID, mKranenGeofence);
        mGeofenceStorage.setGeofence(JET_ID, mJetGeofence);
        mGeofenceStorage.setGeofence(CYKELPUMP_KOCKUMS_ID, mCykelPumpKockums);
        mGeofenceList.add(mTurningTorsoGeofence.toGeofence());
        mGeofenceList.add(mKranenGeofence.toGeofence());
        mGeofenceList.add(mJetGeofence.toGeofence());
        mGeofenceList.add(mCykelPumpKockums.toGeofence());
    }


    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {
        // If the error has a resolution, start a Google Play services activity to resolve it.
        if (connectionResult.hasResolution()) {
            try {
                connectionResult.startResolutionForResult(this,
                        CONNECTION_FAILURE_RESOLUTION_REQUEST);
            } catch (IntentSender.SendIntentException e) {
                Log.e(TAG, "Exception while resolving connection error.", e);
            }
        } else {
            int errorCode = connectionResult.getErrorCode();
            Log.e(TAG, "Connection to Google Play services failed with error code " + errorCode);
        }
    }

    @Override
    public void onDisconnected() {
    }

    /**
     * Once the connection is available, send a request to add the Geofences.
     */
    @Override
    public void onConnected(Bundle connectionHint) {
        // Get the PendingIntent for the geofence monitoring request.
        // Send a request to add the current geofences.
        mGeofenceRequestIntent = getGeofenceTransitionPendingIntent();
        LocationServices.GeofencingApi.addGeofences(mApiClient, mGeofenceList,
                mGeofenceRequestIntent);
        Toast.makeText(this, getString(R.string.start_geofence_service), Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void onConnectionSuspended(int i) {
        if (null != mGeofenceRequestIntent) {
            LocationServices.GeofencingApi.removeGeofences(mApiClient, mGeofenceRequestIntent);
        }
    }

    /**
     * Checks if Google Play services is available.
     * @return true if it is.
     */
    private boolean isGooglePlayServicesAvailable() {
        int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (ConnectionResult.SUCCESS == resultCode) {
            if (Log.isLoggable(TAG, Log.DEBUG)) {
                Log.d(TAG, "Google Play services is available.");
            }
            return true;
        } else {
            Log.e(TAG, "Google Play services is unavailable.");
            return false;
        }
    }

    /**
     * Create a PendingIntent that triggers GeofenceTransitionIntentService when a geofence
     * transition occurs.
     */
    private PendingIntent getGeofenceTransitionPendingIntent() {
        Intent intent = new Intent(this, GeofenceTransitionsIntentService.class);
        return PendingIntent.getService(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

}
