package com.anand.homework.Fragments.dbwork


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.anand.homework.db.DBCreator
import com.anand.homework.db.DbworkUserInfo
import kotlinx.android.synthetic.main.dblistview.*
import kotlinx.android.synthetic.main.fragment_dbwork_showdata.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

/**
 * A simple [Fragment] subclass.
 */
class dbwork_showdata : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(com.anand.homework.R.layout.fragment_dbwork_showdata, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dBuserinfoDao = DBCreator().getAppDatabase(activity!!.baseContext).dBUserInfoDao()

        doAsync{

            val data = dBuserinfoDao.getAll()

            uiThread {

                val adapter = ArrayAdapter<DbworkUserInfo>(activity!!, android.R.layout.simple_list_item_1, data)
                lstDB.adapter = adapter

            }

        }

        //val adapter = ArrayAdapter<String>



    }

}
