package com.example.moviesapp.ui.Screens.homeScreen

import androidx.lifecycle.ViewModel
import com.example.moviesapp.DoMain.Models.ShortMovieModel

class HomeScreenViewModel : ViewModel(){
   val Movies = listOf<ShortMovieModel>(
       ShortMovieModel(1,"https://cdn.weatherapi.com/weather/64x64/day/116.png","A","gg"),
       ShortMovieModel(2,"https://cdn.weatherapi.com/weather/64x64/day/116.png","B","gg"),
       ShortMovieModel(3,"https://cdn.weatherapi.com/weather/64x64/day/116.png","C","gg"),
       ShortMovieModel(4,"https://cdn.weatherapi.com/weather/64x64/day/116.png","D","gg"),
   )
}