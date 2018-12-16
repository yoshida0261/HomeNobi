package jp.co.stah.homenobi.presentation.presentor.tweet

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import jp.co.stah.homenobi.R

class TweetActivity : AppCompatActivity(){

    // メイン画面
    // ここに各種actを表示させるなどをする

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)

    }
}