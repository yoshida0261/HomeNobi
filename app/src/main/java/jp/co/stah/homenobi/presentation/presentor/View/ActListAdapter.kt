package jp.co.stah.homenobi.presentation.presentor.View

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import jp.co.stah.homenobi.data.entity.ActEntity

class ActListAdapter(context: Context, resource: Int) : ArrayAdapter<ActEntity>(context, resource) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }
}