package com.example.hots_application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Injection {
    static final String BASE_URL = "http://hotsapi.net/api/v1/" ;

    //TODO Faire un singleton.
    public static HotsPlayersRestApi getRestApiInstance(){
        //Debut creation instance de l'interface PokemonRestApi
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        //FIN creation instance de l'interface PokemonRestApi
        return retrofit.create(HotsPlayersRestApi.class);
    }

}
