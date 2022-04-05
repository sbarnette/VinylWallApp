package com.example.litvinylwall

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

var albumCount = -1

class MainActivity : AppCompatActivity() {
    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img1 = findViewById<ImageView>(R.id.image_grid1)
        img1.tag = R.drawable.blankalbum
        val img2 = findViewById<ImageView>(R.id.image_grid2)
        img2.tag = R.drawable.blankalbum
        val img3 = findViewById<ImageView>(R.id.image_grid3)
        img3.tag = R.drawable.blankalbum
        val img4 = findViewById<ImageView>(R.id.image_grid4)
        img4.tag = R.drawable.blankalbum
        val img5 = findViewById<ImageView>(R.id.image_grid5)
        img5.tag = R.drawable.blankalbum
        val img6 = findViewById<ImageView>(R.id.image_grid6)
        img6.tag = R.drawable.blankalbum
        val img7 = findViewById<ImageView>(R.id.image_grid7)
        img7.tag = R.drawable.blankalbum
        val img8 = findViewById<ImageView>(R.id.image_grid8)
        img8.tag = R.drawable.blankalbum
        val images = arrayOf(img1, img2, img3, img4, img5, img6, img7, img8)

        val actionButton1 = findViewById<FloatingActionButton>(R.id.floatingActionButton_grid1)
        val actionButton2 = findViewById<FloatingActionButton>(R.id.floatingActionButton_grid2)
        val actionButton3 = findViewById<FloatingActionButton>(R.id.floatingActionButton_grid3)
        val actionButton4 = findViewById<FloatingActionButton>(R.id.floatingActionButton_grid4)
        val actionButton5 = findViewById<FloatingActionButton>(R.id.floatingActionButton_grid5)
        val actionButton6 = findViewById<FloatingActionButton>(R.id.floatingActionButton_grid6)
        val actionButton7 = findViewById<FloatingActionButton>(R.id.floatingActionButton_grid7)
        val actionButton8 = findViewById<FloatingActionButton>(R.id.floatingActionButton_grid8)

        val buttonAddAlbum = findViewById<Button>(R.id.button_addAlbum)
        buttonAddAlbum.setOnClickListener {
            Log.i("MainActivity", "Clicked the Add button")
            albumCount++

            if (albumCount < 8) {
                images[albumCount].setImageDrawable(resources.getDrawable(R.drawable.anawesomewave))
                images[albumCount].tag = R.drawable.anawesomewave
            }
        }

        img1.setOnLongClickListener {
            val resource = img1.tag
            if (resource != R.drawable.blankalbum) {
                actionButton1.visibility = View.VISIBLE
            }
            true
        }

        img2.setOnLongClickListener {
            val resource = img2.tag
            if (resource != R.drawable.blankalbum) {
                actionButton2.visibility = View.VISIBLE
            }
            true
        }

        img3.setOnLongClickListener {
            val resource = img3.tag
            if (resource != R.drawable.blankalbum) {
                actionButton3.visibility = View.VISIBLE
            }
            true
        }

        img4.setOnLongClickListener {
            val resource = img4.tag
            if (resource != R.drawable.blankalbum) {
                actionButton4.visibility = View.VISIBLE
            }
            true
        }

        img5.setOnLongClickListener {
            val resource = img5.tag
            if (resource != R.drawable.blankalbum) {
                actionButton5.visibility = View.VISIBLE
            }
            true
        }

        img6.setOnLongClickListener {
            val resource = img6.tag
            if (resource != R.drawable.blankalbum) {
                actionButton6.visibility = View.VISIBLE
            }
            true
        }

        img7.setOnLongClickListener {
            val resource = img7.tag
            if (resource != R.drawable.blankalbum) {
                actionButton7.visibility = View.VISIBLE
            }
            true
        }

        img8.setOnLongClickListener {
            val resource = img8.tag
            if (resource != R.drawable.blankalbum) {
                actionButton8.visibility = View.VISIBLE
            }
            true
        }

        actionButton1.setOnClickListener {
            Log.i("MainActivity", "Clicked the remove button")
            img1.setImageDrawable(img2.drawable)
            img1.tag = img2.tag
            img2.setImageDrawable(img3.drawable)
            img2.tag = img3.tag
            img3.setImageDrawable(img4.drawable)
            img3.tag = img4.tag
            img4.setImageDrawable(img5.drawable)
            img4.tag = img5.tag
            img5.setImageDrawable(img6.drawable)
            img5.tag = img6.tag
            img6.setImageDrawable(img7.drawable)
            img6.tag = img7.tag
            img7.setImageDrawable(img8.drawable)
            img7.tag = img8.tag
            img8.setImageDrawable(resources.getDrawable(R.drawable.blankalbum))
            img8.tag = R.drawable.blankalbum

            actionButton1.visibility = View.INVISIBLE
            albumCount--
        }

        actionButton2.setOnClickListener {
            img2.setImageDrawable(img3.drawable)
            img2.tag = img3.tag
            img3.setImageDrawable(img4.drawable)
            img3.tag = img4.tag
            img4.setImageDrawable(img5.drawable)
            img4.tag = img5.tag
            img5.setImageDrawable(img6.drawable)
            img5.tag = img6.tag
            img6.setImageDrawable(img7.drawable)
            img6.tag = img7.tag
            img7.setImageDrawable(img8.drawable)
            img7.tag = img8.tag
            img8.setImageDrawable(resources.getDrawable(R.drawable.blankalbum))
            img8.tag = R.drawable.blankalbum

            actionButton2.visibility = View.INVISIBLE
            albumCount--
        }

        actionButton3.setOnClickListener {
            img3.setImageDrawable(img4.drawable)
            img3.tag = img4.tag
            img4.setImageDrawable(img5.drawable)
            img4.tag = img5.tag
            img5.setImageDrawable(img6.drawable)
            img5.tag = img6.tag
            img6.setImageDrawable(img7.drawable)
            img6.tag = img7.tag
            img7.setImageDrawable(img8.drawable)
            img7.tag = img8.tag
            img8.setImageDrawable(resources.getDrawable(R.drawable.blankalbum))
            img8.tag = R.drawable.blankalbum

            actionButton3.visibility = View.INVISIBLE
            albumCount--
        }

        actionButton4.setOnClickListener {
            img4.setImageDrawable(img5.drawable)
            img4.tag = img5.tag
            img5.setImageDrawable(img6.drawable)
            img5.tag = img6.tag
            img6.setImageDrawable(img7.drawable)
            img6.tag = img7.tag
            img7.setImageDrawable(img8.drawable)
            img7.tag = img8.tag
            img8.setImageDrawable(resources.getDrawable(R.drawable.blankalbum))
            img8.tag = R.drawable.blankalbum

            actionButton4.visibility = View.INVISIBLE
            albumCount--
        }

        actionButton5.setOnClickListener {
            img5.setImageDrawable(img6.drawable)
            img5.tag = img6.tag
            img6.setImageDrawable(img7.drawable)
            img6.tag = img7.tag
            img7.setImageDrawable(img8.drawable)
            img7.tag = img8.tag
            img8.setImageDrawable(resources.getDrawable(R.drawable.blankalbum))
            img8.tag = R.drawable.blankalbum

            actionButton5.visibility = View.INVISIBLE
            albumCount--
        }

        actionButton6.setOnClickListener {
            img6.setImageDrawable(img7.drawable)
            img6.tag = img7.tag
            img7.setImageDrawable(img8.drawable)
            img7.tag = img8.tag
            img8.setImageDrawable(resources.getDrawable(R.drawable.blankalbum))
            img8.tag = R.drawable.blankalbum

            actionButton6.visibility = View.INVISIBLE
            albumCount--
        }

        actionButton7.setOnClickListener {
            img7.setImageDrawable(img8.drawable)
            img7.tag = img8.tag
            img8.setImageDrawable(resources.getDrawable(R.drawable.blankalbum))
            img8.tag = R.drawable.blankalbum

            actionButton7.visibility = View.INVISIBLE
            albumCount--
        }

        actionButton8.setOnClickListener {
            img8.setImageDrawable(resources.getDrawable(R.drawable.blankalbum))
            img8.tag = R.drawable.blankalbum

            actionButton8.visibility = View.INVISIBLE
            albumCount--
        }
    }
}