package jp.co.stah.homenobi.presentation.presentor.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.co.stah.homenobi.R
import jp.co.stah.homenobi.presentation.presentor.act.ui.actlist.ActListFragment

class ActListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_list_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, ActListFragment.newInstance())
                .commitNow()
        }
    }

}
