package com.ocanha.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val args: SecondFragmentArgs by navArgs()

    /*
    Não sabe porque estamos usando esse método em específico?
    Assista a LIVE #016! https://youtu.be/hr2fhWskrFU
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_id).text = "${args.user.name} - ${args.user.age}"

        view.findViewById<TextView>(R.id.tv_id).setOnClickListener {

            findNavController().navigate(R.id.fromSecondFragmentToFirstFragment)

        }

    }

}