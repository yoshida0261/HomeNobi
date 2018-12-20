package jp.co.stah.homenobi.presentation.presentor

import android.content.Context
import android.content.Intent
import android.support.v4.app.FragmentActivity

interface BaseView {
    abstract fun startActivity(intent: Intent)

    abstract fun startActivityForResult(intent: Intent, requestCode: Int)

    abstract fun finishActivity()

    abstract fun getContext(): Context?

    abstract fun getActivity(): FragmentActivity?

}