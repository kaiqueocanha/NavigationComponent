package com.ocanha.navigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ocanha.navigationcomponent.models.User

class FirstFragment : Fragment(R.layout.fragment_first) {

    /*
    Não sabe porque estamos usando esse método em específico?
    Assista a LIVE #016! https://youtu.be/hr2fhWskrFU
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_id).setOnClickListener {

            val action = FirstFragmentDirections.fromFirstFragmentToSecondFragment(
                user = User(
                    "Kaique Ocanha",
                    25
                )
            )

            findNavController().navigate(action)

        }

    }
}