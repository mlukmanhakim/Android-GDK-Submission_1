package com.lukmancyb.latihangoogledevkejar.activity

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.lukmancyb.latihangoogledevkejar.R
import org.jetbrains.anko.*

/**
 * Created by TOSHIBA on 02/09/2018.
 */
class DetailActivity : AppCompatActivity() {

    lateinit var nameTextView : TextView
    lateinit var imgImageView : ImageView
    lateinit var descTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        val  name = intent.getStringExtra("name")
        val image = intent.getIntExtra("image", 0)
        val desc = intent.getStringExtra("desc")



        verticalLayout{
            backgroundColor = Color.WHITE
            padding = dip(16)
            gravity = Gravity.CENTER
            imgImageView = imageView().

                    lparams(width = dip(50), height = dip(50)){
                        topMargin = dip(5)
                        gravity = Gravity.CENTER
                    }
            nameTextView = textView(){
               gravity = Gravity.CENTER

            }.
                    lparams(width = matchParent, height = dip(30)){
                        topMargin = dip(5)

                    }
            descTextView = textView(){
                    textAlignment = View.TEXT_ALIGNMENT_INHERIT
            }.
                    lparams(width = wrapContent){
                        topMargin = dip(8)

                    }

            linearLayout{
                    imageView{
                        setImageResource(R.drawable.img_gdk)
                    }.lparams(width = dip(250), height = matchParent){
                        gravity = Gravity.CENTER or Gravity.BOTTOM
                    }

                }.lparams(width = wrapContent)
        }

        nameTextView.text = name
        imgImageView.image = getDrawable(image)
        descTextView.text = desc


    }


}