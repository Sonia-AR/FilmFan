package com.example.filmfan.my_interface;

import com.example.filmfan.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetMoviesList {

        @GET("movie/now_playing")
        Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

}
