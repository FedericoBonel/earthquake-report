package com.example.android.quakereport;

/**
 * @link represents an earthquake, with a place, magnitude,
 * and date.
 */
public class Earthquake {
    //Variables definition:

    //City of the earthquake
    private String mPlace;
    //Url of the quake;
    private String mUrl;
    //Earthquake's magnitude
    private double mMagnitude;
    // Time of the earthquake
    private long mTimeInMilliseconds;


    /**
     * Constructs a new Earthquake object
     *
     * @param place              City where the earthquake happened.
     * @param magnitude          Earthquake's magnitude
     * @param timeInMilliseconds Time in milliseconds of the earthquake
     */
    public Earthquake(String place, String url, long timeInMilliseconds, double magnitude) {
        mPlace = place;
        mMagnitude = magnitude;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    //Methods

    /**
     * @return the place of the earthquake
     */
    public String getPlace() {
        return mPlace;
    }

    /**
     * @return the magnitude of the earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * @return the time in ms
     */
    public long getTimeInMilli() {
        return mTimeInMilliseconds;
    }

    /**
     * @return the url of the item
     */
    public String getUrl() {
        return mUrl;
    }

}
