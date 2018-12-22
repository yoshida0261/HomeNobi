package jp.co.stah.homenobi.presentation.presentor

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.util.Base64
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import jp.co.stah.homenobi.R
import jp.co.stah.homenobi.presentation.presentor.act.ActListActivity
import jp.co.stah.homenobi.presentation.presentor.tweet.ui.timeline.TimeLineListAdapter
import jp.co.stah.homenobi.presentation.presentor.tweet.ui.timeline.TimeLineViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.io.ByteArrayOutputStream
import java.io.IOException


class MainActivity : AppCompatActivity() {

    private val READ_REQUEST_CODE = 12345

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                //  message.setText(R.string.title_home)
                // Log.d("tag", "home")
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                // message.setText(R.string.title_dashboard)
                val intent = Intent(this, ActListActivity::class.java)
                startActivity(intent)
                finish()
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

        val fav = findViewById<FloatingActionButton>(R.id.fab)
        fav.setOnClickListener {
            Toast.makeText(this@MainActivity, "FABが押されました", Toast.LENGTH_SHORT).show();
        }


        // androrryの読み込み
        val pref  = getSharedPreferences("andrroy", Context.MODE_PRIVATE)
        val s = pref.getString("key", "")
        val andrry = findViewById<ImageView>(R.id.andorry)
        if (!s.equals("")) {
            val options = BitmapFactory.Options()
            val basebyte = Base64.decode(s, Base64.DEFAULT)

            val bitmap = BitmapFactory.decodeByteArray(basebyte, 0, basebyte.size).copy(Bitmap.Config.ARGB_8888, true);
            andrry.setImageBitmap(bitmap)
        }


        andrry.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            intent.type = "image/*"
            startActivityForResult(intent, READ_REQUEST_CODE)
        }

        val listItems = ArrayList<TimeLineViewModel>()

        /*
        val item = TimeLineViewModel("testname", "yyyymmdd", 1, "test text")
        listItems.add(item)
        */


        val adapter = TimeLineListAdapter(this, R.layout.activity_main, listItems)

        // Assign adapter to ListView
        listView.adapter = adapter

        //DB初期化
        //val repository = GetRepository()
        //val list = GetRepository.getActList()

        // list 表示


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, resultData: Intent?) {
        if (requestCode == READ_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            var uri: Uri? = null
            if (resultData != null) {
                uri = resultData.data
                try {
                    val bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), uri)
                    this.findViewById<ImageView>(R.id.andorry)?.setImageBitmap(bitmap)

                    // prefに保存
                    val baos = ByteArrayOutputStream()
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos)
                    val bitmapStr = Base64.encodeToString(baos.toByteArray(), Base64.DEFAULT)

                    val pref = this.getSharedPreferences("andrroy", Context.MODE_PRIVATE)
                    val editor = pref.edit()
                    editor.putString("key", bitmapStr)
                    editor.apply()

                } catch (e: IOException) {
                    e.printStackTrace()
                }

            }
        }
    }


}
