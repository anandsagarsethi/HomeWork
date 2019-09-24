package com.anand.homework.Fragments.mainmenu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.anand.homework.R
import kotlinx.android.synthetic.main.fragment_mainmenu.*

/**
 * A simple [Fragment] subclass.
 */
class mainmenu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mainmenu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btDBWork.setOnClickListener {
            findNavController().navigate(mainmenuDirections.actionMainmenuToDbwork())
        }

        //phonebook

        //features ->
        //1. Add contact (name, image, email, phone, dob)
        //2. Contact server synchronise (firebase)
        //3. Settings ()
        //4. COntact sharing, whatsapp, fb
        //5. login/signup


        //fragments, navigation, viewmodel & livedata, pagination, networking, firebase, app wokrflow, signed/release apk, proguard, versioning, custom drawable, 



    }


}
