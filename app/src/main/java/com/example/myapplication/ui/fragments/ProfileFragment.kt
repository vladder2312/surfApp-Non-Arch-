package com.example.myapplication.ui.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_profile.*
class ProfileFragment : Fragment() {

    private lateinit var userData : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        retainInstance=true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        retainInstance = true
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val toolbar = view.findViewById(R.id.mainToolbar) as? Toolbar
        val activity = activity as AppCompatActivity?
        activity!!.setSupportActionBar(toolbar)
        val actionBar = activity.supportActionBar
        return view
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        getUserData()
        super.onActivityCreated(savedInstanceState)
    }

    private fun getUserData(){
        userData = activity?.getSharedPreferences("UserData", Context.MODE_PRIVATE) ?: return
        profile_nickname.text = userData.getString("UserName","Username")
        profile_description.text = userData.getString("UserDescription","Description")
    }

}