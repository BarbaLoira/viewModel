package com.barbaloira.mvvm.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.barbaloira.mvvm.R


/**
 * A simple [Fragment] subclass.
 *
 */
class SignUpAccessFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_sign_up_access,
            container,
            false
        )
        return view
    }


}
