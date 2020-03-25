package com.boshra.jetpacknavigationcomponetnt.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.boshra.jetpacknavigationcomponetnt.R

class FragmentRegister : Fragment(), View.OnClickListener {


    private var navController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        init()

    }

    private fun init() {
        navController = view?.let { Navigation.findNavController(it) }

        view?.findViewById<Button>(R.id.btnRegSubmit)
            ?.setOnClickListener(this)
        view?.findViewById<Button>(R.id.btnRegBack)
            ?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnRegSubmit -> {
                navController?.navigate(R.id.action_fragmentRegister_to_fragmentProfile)
            }
            R.id.btnRegBack -> {
                activity?.onBackPressed()
            }
            else -> {
            }
        }
    }
}
