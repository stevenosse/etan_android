package com.stevenosse.tan.viewmodels

import com.stevenosse.tan.models.Stop

class StopListViewModel {
    companion object {
        val shared: StopListViewModel = StopListViewModel()
    }
    var stopList: MutableList<Stop> = mutableListOf()
}