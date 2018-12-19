package jp.co.stah.homenobi.presentation.presentor

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import jp.co.stah.homenobi.R
import jp.co.stah.homenobi.presentation.presentor.tweet.ui.timeline.TimeLineListAdapter
import jp.co.stah.homenobi.presentation.presentor.tweet.ui.timeline.TimeLineViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                //  message.setText(R.string.title_home)
                // Log.d("tag", "home")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                // message.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                // message.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val listView = findViewById<ListView>(R.id.act_list)

        /*
        ArrayList<SampleListItem> listItems = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);  // 今回はサンプルなのでデフォルトのAndroid Iconを利用
            SampleListItem item = new SampleListItem(bmp, "sample text No. " + String.valueOf(i));
            listItems.add(item);
        }
         */
        val listItems =  ArrayList<TimeLineViewModel>()

        val item = TimeLineViewModel("testname", "yyyymmdd", 1, "test text")
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)
        listItems.add(item)


        val adapter = TimeLineListAdapter(this, R.layout.activity_main, listItems)

        // Assign adapter to ListView
        listView.adapter = adapter

        //DB初期化
        //val repository = GetRepository()
        //val list = GetRepository.getActList()

        // list 表示


    }


}
