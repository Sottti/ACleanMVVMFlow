package com.sotti.a.clean.mvvm.flow.ui.main

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow

internal class Repository {
	private val localDS = LocalDS()
	private val remoteDS = RemoteDS()

	fun getStrings(): Flow<String> = flow {
		localDS.strings().collect { emit(it) }
			.also { emit(remoteDS.fetchStringFromNetworkCall()) }
	}
}
