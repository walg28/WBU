
package com.bibleunion.WABU

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.WHITE)
            setPadding(30, 30, 30, 30)
        }

        val title = TextView(this).apply {
            text = "WABU"
            textSize = 36f
            setTextColor(Color.rgb(30, 60, 120))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "Bible Union\n\nBienvenue dans votre espace biblique."
            textSize = 18f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 25, 0, 0)
        }

        layout.addView(title)
        layout.addView(subtitle)

        setContentView(layout)
    }
}
