package jp.co.stah.homenobi.presentation.presentor.tweet.ui.timeline

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import jp.co.stah.homenobi.R

class TimeLineListAdapter(context: Context, resource: Int, items:List<TimeLineViewModel>) : ArrayAdapter<TimeLineViewModel>(context, resource) {
    private lateinit var layoutInflater: LayoutInflater
    private val resource = resource
    private val items = items
    init {
         layoutInflater =  context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        var view : View
        if (convertView != null) {
            view = convertView;
        }
        else {
            view = layoutInflater.inflate(resource, null);
        }

        val act = items.get(position)

        val date = view.findViewById<TextView>(R.id.act_date)
        date.setText(act.actDate)

        val name = view.findViewById<TextView>(R.id.act_name)
        name.setText(act.actName)

        val image = view.findViewById<ImageView>(R.id.act_image)
        //image.setImageDrawable(act.actImage)
       // image.setImageDrawable(R.drawable.ic_dashboard_black_24dp)

        val discription = view.findViewById<TextView>(R.id.act_discription)
        discription.setText(act.actText)

        //return super.getView(position, convertView, parent)
        return view
    }

}