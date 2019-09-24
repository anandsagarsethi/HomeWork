package com.anand.homework.Fragments.dbwork


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.anand.homework.Fragments.mainmenu.mainmenuDirections

import com.anand.homework.R
import com.anand.homework.db.DBCreator
import com.anand.homework.db.DbworkUserInfo
import kotlinx.android.synthetic.main.fragment_dbwork.*
import kotlinx.android.synthetic.main.fragment_mainmenu.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * A simple [Fragment] subclass.
 */
class dbwork : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dbwork, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         val TAG = this.javaClass.simpleName

        val dBuserinfoDao = DBCreator().getAppDatabase(activity!!.baseContext).dBUserInfoDao()


        btSave.setOnClickListener {
            doAsync {
                val workinfo =  DbworkUserInfo( ipName.text.toString(), ipPhone.text.toString())
                dBuserinfoDao.insert(workinfo)
                uiThread{
                    Log.e(TAG, "Record Inserted")
                    findNavController().navigate(dbworkDirections.actionDbworkToDbworkShowdata())

                }

                }



        }


    }


}
