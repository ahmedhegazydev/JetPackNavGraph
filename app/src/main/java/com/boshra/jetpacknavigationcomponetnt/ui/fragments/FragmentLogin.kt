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
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentLogin : Fragment(), View.OnClickListener {

    private var navigationController: NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigationController = Navigation.findNavController(view)


        btnLoginCancel.setOnClickListener {
//            navigationController!!.popBackStack()
            activity?.onBackPressed()
        }
//        view.findViewById<Button>(R.id.btnLoginCancel)
//            .setOnClickListener(this)
        view.findViewById<Button>(R.id.btnLoginNow)
            .setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v?.id) {
            R.id.btnLoginCancel -> {

            }
            R.id.btnLoginNow -> {
                navigationController?.navigate(R.id.action_fragmentLogin_to_fragmentProfile)
            }
            else -> {

            }
        }
    }


}
