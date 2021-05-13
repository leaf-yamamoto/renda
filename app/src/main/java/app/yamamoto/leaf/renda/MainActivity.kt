package app.yamamoto.leaf.renda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tapCount = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tapButton.setOnClickListener{

            tapCount = tapCount +1

            countText.text = tapCount.toString()

        }

    }
}