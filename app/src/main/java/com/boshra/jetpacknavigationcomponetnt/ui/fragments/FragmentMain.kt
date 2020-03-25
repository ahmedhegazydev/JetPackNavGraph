package com.boshra.jetpacknavigationcomponetnt.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.boshra.jetpacknavigationcomponetnt.R

class FragmentMain : Fragment(), OnClickListener {

    var navigatController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigatController = Navigation.findNavController(view)

        view.findViewById<Button>(R.id.btnLogin)
            .setOnClickListener(this)
        view.findViewById<Button>(R.id.btnRegister)
            .setOnClickListener(this)


    }

    override fun onClick(v: View?) {

        when (v!!.id) {
            R.id.btnLogin -> {
                navigatController!!.navigate(R.id.action_fragmentMain_to_fragmentLogin)
            }
            R.id.btnRegister -> {
                navigatController!!.navigate(R.id.action_fragmentMain_to_fragmentRegister)
            }
            else -> {
                //
            }
        }

    }


}
