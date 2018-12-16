package jp.co.stah.homenobi.presentation.presentor.act.ui.actlist

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.stah.homenobi.R

class ActListFragment : Fragment() {

    companion object {
        fun newInstance() = ActListFragment()
    }

    private lateinit var viewModel: ActListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.act_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ActListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
