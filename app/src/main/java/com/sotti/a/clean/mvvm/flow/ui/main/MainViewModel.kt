package com.sotti.a.clean.mvvm.flow.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData

internal class MainViewModel : ViewModel() {
	val strings = Repository().getStrings().asLiveData()
}
