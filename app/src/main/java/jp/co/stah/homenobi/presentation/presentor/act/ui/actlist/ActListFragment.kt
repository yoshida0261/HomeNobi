package jp.co.stah.homenobi.presentation.presentor.act.ui.actlist

import android.app.Activity
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import jp.co.stah.homenobi.R
import java.io.IOException


class ActListFragment : Fragment() {

    companion object {
        fun newInstance() = ActListFragment()
    }

    private val READ_REQUEST_CODE = 1234
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


        activity?.findViewById<ImageView>(R.id.act_icon)?.setOnClickListener {
            // 画像取得
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            intent.type = "image/*"
            startActivityForResult(intent, READ_REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, resultData: Intent?) {
        if (requestCode == READ_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            var uri: Uri? = null
            if (resultData != null) {
                uri = resultData.data
                try {
                    val bitmap = MediaStore.Images.Media.getBitmap(activity?.getContentResolver(), uri)
                    activity?.findViewById<ImageView>(R.id.act_icon)?.setImageBitmap(bitmap)

                    //TODO dbに保存
                } catch (e: IOException) {
                    e.printStackTrace()
                }

            }
        }
    }


}
