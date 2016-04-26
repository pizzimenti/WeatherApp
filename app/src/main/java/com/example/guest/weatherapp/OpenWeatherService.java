package com.example.guest.weatherapp;

import okhttp3.Callback;
import okhttp3.HttpUrl;

public class OpenWeatherService {
    public static void getForecast(String location, Callback callback) {
        String APIKEY = Constants.OPENWEATHER_APIKEY;

        HttpUrl.Builder urlBuilder = HttpUrl.parse(Constants.OPENWEATHER_BASE_URL).newBuilder();
        urlBuilder.addQueryParameter(Constants.OPENWEATHER_LOCATION_QUERY_PARAMETER, "location");

    }
}
