package ir.malihemoradi.hiltapplication.api

import ir.malihemoradi.hiltapplication.model.Photo
import retrofit2.http.GET
import retrofit2.http.Path

interface  InterfaceApi {

    @GET("photos/{id}")
    suspend fun getPhoto(@Path("id") id : Int) : Photo

}