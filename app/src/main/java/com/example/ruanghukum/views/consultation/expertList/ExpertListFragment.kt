package com.example.ruanghukum.views.consultation.expertList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ruanghukum.R

class ExpertListFragment : Fragment() {

    companion object {
        fun newInstance() = ExpertListFragment()
    }

    private lateinit var viewModel: ExpertListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_expert_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExpertListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}