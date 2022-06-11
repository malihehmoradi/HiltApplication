package ir.malihemoradi.hiltapplication.viewmodel

import androidx.lifecycle.ViewModel
import ir.malihemoradi.hiltapplication.api.InterfaceApi
import javax.inject.Inject


class PhotoViewModel @Inject constructor(var api: InterfaceApi) : ViewModel() {

    suspend fun getPhoto(id : Int) = api.getPhoto(id)

}