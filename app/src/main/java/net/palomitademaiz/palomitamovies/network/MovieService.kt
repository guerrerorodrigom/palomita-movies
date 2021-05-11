package net.palomitademaiz.palomitamovies.network

import retrofit2.http.GET

interface MovieService {

    @GET("$API_VERSION/movie/popular?language=en-US&page=1")
    suspend fun getPopularMovies()
}