package com.example.covidvaccine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.covidvaccine.databinding.FragmentBlankCovidBinding


class BlankCovid : Fragment(R.layout.fragment_blank_covid) {

    private lateinit var fragmentBlankCovidBinding: FragmentBlankCovidBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding=FragmentBlankCovidBinding.bind(view)
        fragmentBlankCovidBinding=binding

        binding.button4.setOnClickListener {
            val action=BlankCovidDirections.actionBlankCovidToCanTakeVaccine()
            findNavController().navigate(action)
        }
    }
}