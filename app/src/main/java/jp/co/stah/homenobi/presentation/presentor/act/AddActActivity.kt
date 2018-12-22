package jp.co.stah.homenobi.presentation.presentor.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jp.co.stah.homenobi.R
import kotlinx.android.synthetic.main.activity_add_act.*

class AddActActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_act)
        setSupportActionBar(toolbar)


    }

}
