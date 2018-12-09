package com.barbaloira.mvvm.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.CompoundButton

import com.barbaloira.mvvm.R
import kotlinx.android.synthetic.main.fragment_sign_up_terms.*
import me.drakeet.materialdialog.MaterialDialog

/**
 * A simple [Fragment] subclass.
 *
 */
class SignUpTermsFragment : Fragment(), CompoundButton.OnCheckedChangeListener, View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(
            R.layout.fragment_sign_up_terms,
            container,
            false
        )

        view
            .findViewById<CheckBox>(R.id.cb_terms)
            .setOnCheckedChangeListener(this)

        view
            .findViewById<Button>(R.id.bt_send)
            .setOnClickListener(this)

        return view
    }

    override fun onCheckedChanged(
        view: CompoundButton?,
        status: Boolean
    ) {

        bt_send.isEnabled = status
    }

    override fun onClick(view: View?) {

        val layout = LayoutInflater
            .from(activity)
            .inflate(R.layout.dialog_personal, null, false)

        MaterialDialog(activity)
            .setContentView(layout)
            .setCanceledOnTouchOutside(true)
            .show()
    }


}
