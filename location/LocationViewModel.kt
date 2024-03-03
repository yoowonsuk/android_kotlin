package eu.tutorials.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

// https://tourspace.tistory.com/114
class LocationViewModel: ViewModel() {
    private val _location = mutableStateOf<LocationData?>(null)
    val loation: State<LocationData?> = _location

    fun updateLocation(newLocation: LocationData) {
        _location.value = newLocation
    }
}
