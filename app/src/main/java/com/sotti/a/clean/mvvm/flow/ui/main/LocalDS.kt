package com.sotti.a.clean.mvvm.flow.ui.main

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

internal class LocalDS() {

	suspend fun strings(): Flow<String> =
		flow {
			emit("Yo")
			delay(500)
			emit("Flow")
			delay(275)
			emit("is")
			delay(250)
			emit("fucking")
			delay(225)
			emit("could")
			delay(200)
			emit("for")
			delay(150)
			emit("speed")
			delay(100)
			emit("reading")
			delay(75)
			emit("text")
		}
}
