package com.sotti.a.clean.mvvm.flow.ui.main

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

internal class Repository {
	private val localDS = LocalDS()
	private val remoteDS = RemoteDS()

	fun strings(): Flow<String> = flow {
		localDS.strings().collect { emit(it) }
			// This next line could be actually inserting into ROOM,
			// which will create a new emission on the localDS flow.
			.also { emit(remoteDS.fetchStringFromNetworkCall()) }
	}
}
