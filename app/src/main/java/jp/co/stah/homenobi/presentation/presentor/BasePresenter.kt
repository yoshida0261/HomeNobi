package jp.co.stah.homenobi.presentation.presentor

import android.content.Context
import android.content.Intent
import android.support.v4.app.FragmentActivity

abstract class BasePresenter<V : BaseView> {

    private lateinit var view: V

    fun setView(view: V) {
        this.view = view
    }

    open fun onAttach() {
        // NOP
    }

    open fun onViewCreated() {
        // NOP
    }

    open fun onResume() {
        // NOP
    }

    open fun onPause() {
        // NOP
    }

    open fun onDestroyView() {
        // NOP
    }

    open fun onDetach() {
        // NOP
    }

    fun startActivity(intent: Intent) {
        view.startActivity(intent)
    }

    fun startActivityForResult(intent: Intent, requestCode: Int) {
        view.startActivityForResult(intent, requestCode)
    }

    fun finishActivity() {
        view.finishActivity()
    }

    fun getContext(): Context? {
        return view.getContext()
    }

    fun getActivity(): FragmentActivity? {
        return view.getActivity()
    }
}