package com.sotti.a.clean.mvvm.flow.ui.main

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

internal class RemoteDS() {
	suspend fun fetchStringFromNetworkCall(): String {
		delay(1000)
		return "THE END"
	}
}
