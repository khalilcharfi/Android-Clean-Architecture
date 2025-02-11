package com.aliasadi.data.repository.movie.favorite

import com.aliasadi.data.entities.FavoriteMovieDbData
import com.aliasadi.domain.util.Result

/**
 * @author by Ali Asadi on 22/08/2022
 */
interface FavoriteMoviesDataSource {

    interface Local {
        suspend fun getFavoriteMovieIds(): Result<List<FavoriteMovieDbData>>
        suspend fun addMovieToFavorite(movieId: Int)
        suspend fun removeMovieFromFavorite(movieId: Int)
        suspend fun checkFavoriteStatus(movieId: Int): Result<Boolean>
    }

}