package com.sotti.a.clean.mvvm.flow.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.sotti.a.clean.mvvm.flow.databinding.MainFragmentBinding

class MainFragment : Fragment() {

	companion object {
		fun newInstance() = MainFragment()
	}

	private lateinit var viewModel: MainViewModel
	private lateinit var viewBinding: MainFragmentBinding

	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		viewBinding = MainFragmentBinding.inflate(LayoutInflater.from(context), container, false)
		return viewBinding.root
	}

	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
		viewModel
			.strings
			.observe(viewLifecycleOwner, Observer(::setMessage))
	}

	private fun setMessage(message: String) {
		viewBinding.message.text = message
	}

}
