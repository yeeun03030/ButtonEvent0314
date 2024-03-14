package kr.ac.kopo.buttonevent0314

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button /*늦은 초기화*/
    lateinit var btnHome : Button
    lateinit var btn911 : Button
    lateinit var btnGallery : Button
    lateinit var btnFin : Button
    lateinit var btnListener : View.OnClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById<Button>(R.id.buttonC)
        btnHome = findViewById<Button>(R.id.buttonHome)
        btn911 = findViewById<Button>(R.id.button911)
        btnGallery = findViewById<Button>(R.id.buttonGallery)
        btnFin = findViewById<Button>(R.id.buttonFin)

        btn.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 클릭하셨군요?", Toast.LENGTH_SHORT).show()
        }
        /*
        btnHome.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kopo.ac.kr/jungsu/index.do"))
            startActivity(intent)
        }
        btn911.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"))
            startActivity(intent)
        }
        btnGallery.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(intent)
        }
        */
        btnFin.setOnClickListener {
            finish()
        }

        btnListener = View.OnClickListener {
            when(it.id) {
                R.id.buttonHome -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kopo.ac.kr/jungsu/index.do"))
                R.id.button911 -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"))
                R.id.buttonGallery -> intent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            }
            startActivity(intent)
        }

        btnHome.setOnClickListener(btnListener)
        btn911.setOnClickListener(btnListener)
        btnGallery.setOnClickListener(btnListener)
    }
}