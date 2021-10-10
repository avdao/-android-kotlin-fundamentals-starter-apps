package com.example.covidvaccine

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class CantTakeVaccine : Fragment(R.layout.fragment_cant_take_vaccine) {

//    private lateinit var vaccineTimer: VaccineTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
//        vaccineTimer= VaccineTimer(this.lifecycle)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menuu, menu)
    }

    private fun shareSuccess() {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
            type = "text/plain"
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
//        vaccineTimer.startTimer()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        vaccineTimer.stopTimer()
//    }

}