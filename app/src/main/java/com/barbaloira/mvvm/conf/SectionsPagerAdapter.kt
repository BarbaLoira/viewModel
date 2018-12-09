package com.barbaloira.mvvm.conf

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.barbaloira.mvvm.activity.SignUpActivity
import com.barbaloira.mvvm.fragment.SignUpAccessFragment
import com.barbaloira.mvvm.fragment.SignUpPersonalFragment
import com.barbaloira.mvvm.fragment.SignUpTermsFragment

/**
 * Um [FragmentPagerAdapter] que retorna um fragment correspondente a
 * uma das seções/tabs/pages.
 */
class SectionsPagerAdapter(activity: SignUpActivity, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        /* getItem é invocado para instanciar o fragment da tab informada. */

        return when (position) {
            0 -> SignUpPersonalFragment()
            1 -> SignUpAccessFragment()
            else -> SignUpTermsFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}