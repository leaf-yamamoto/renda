package app.yamamoto.leaf.renda

import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var second:Int = 10
    var tapCount = 0

    val timer: CountDownTimer = object : CountDownTimer(10000, 10000){

        override fun onFinish() {
            startButton.isVisible = true
            tapButton.setBackgroundResource(R.drawable.background_rounded_circle_glay)
            second = 10
            secondText.text = second.toString()
            tapCount = 0
            countText.text = tapCount.toString()
        }

            override fun onTick(millisUntilFinished: Long) {
                tapButton.setBackgroundResource(R.drawable.background_rounded_circle)
                second -= 1
                secondText.text = second.toString()
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener {

            countText.text = tapCount.toString()
            startButton.isVisible = false
            timer.start()
            tapButton.setBackgroundResource(R.drawable.background_rounded_circle)


        }

        tapButton.setOnClickListener {

            if (second < 10) {

                tapCount = tapCount + 1
                countText.text = tapCount.toString()

            }
        }
    }

}