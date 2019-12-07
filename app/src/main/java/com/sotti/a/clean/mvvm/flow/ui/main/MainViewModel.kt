package com.sotti.a.clean.mvvm.flow.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.onStart

@ExperimentalCoroutinesApi
internal class MainViewModel : ViewModel() {
	val strings = Repository()
		.strings()
		.onStart {
			emit("Loading")
			delay(1000)
		}
		.asLiveData()
}
