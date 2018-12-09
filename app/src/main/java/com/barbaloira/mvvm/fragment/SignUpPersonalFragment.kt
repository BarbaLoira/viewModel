package com.barbaloira.mvvm.fragment


import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.barbaloira.mvvm.R
import com.makeramen.roundedimageview.RoundedImageView
import kotlinx.android.synthetic.main.fragment_sign_up_personal.*
import me.iwf.photopicker.PhotoPicker

/**
 * A simple [Fragment] subclass.
 *
 */
class SignUpPersonalFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_up_personal, container, false)


        view
            .findViewById<RoundedImageView>(R.id.iv_profile)
            .setOnClickListener(this)

        // Inflate the layout for this fragment
        return view;
    }


    override fun onClick(v: View?) {
        PhotoPicker.builder()
            .setPhotoCount(1)
            .setShowCamera(true)
            .setShowGif(true)
            .setPreviewEnabled(true)
            .start(this!!.activity!!, PhotoPicker.REQUEST_CODE);
    }


    fun updatePhoto(imgPath: String) {
        if (!imgPath.isEmpty()) {
            iv_profile.setImageURI(Uri.parse(imgPath))
        }
    }
}
