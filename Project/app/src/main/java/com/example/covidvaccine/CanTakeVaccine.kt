package com.example.covidvaccine

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.media.session.MediaSessionCompat.Token.fromBundle
import android.view.*
import android.view.Gravity.apply
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.app.Person.fromBundle
import androidx.core.view.GravityCompat.apply
import androidx.fragment.app.Fragment
import androidx.media.AudioAttributesCompat.fromBundle
import androidx.navigation.fragment.findNavController
import com.example.covidvaccine.databinding.FragmentBlankCovidBinding
import com.example.covidvaccine.databinding.FragmentCanTakeVaccineBinding
import timber.log.Timber


class CanTakeVaccine : Fragment(R.layout.fragment_can_take_vaccine) {

//    private lateinit var vaccineTimer: VaccineTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding=FragmentCanTakeVaccineBinding.bind(view)

//        vaccineTimer= VaccineTimer(this.lifecycle)

        binding.refreshButton.setOnClickListener {
//            val time=vaccineTimer.secondsCount
//            val b=time + 2
        }

    }



    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menuu, menu)
    }

    private fun shareSuccess() {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
            type = "text/plain"
            //TODO UCITAJ SAVE ARGS I NAPRAVI PERSONALNU PORUKU OVDJE I ZA CANT TAKE VACINE ISTO
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home1-> shareSuccess()
        }
        return super.onOptionsItemSelected(item)
    }



//    override fun onResume() {
//        super.onResume()
//        Timber.i("on resume fragment")
//        vaccineTimer.startTimer()
//    }
//
//    override fun onPause(){
//        super.onPause()
//        Timber.i("on pause fragment")
//        vaccineTimer.stopTimer()
//    }
}

