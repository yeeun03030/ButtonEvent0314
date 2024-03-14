package kr.ac.kopo.buttonevent0314

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button /*늦은 초기화*/
    lateinit var btnHome : Button
    lateinit var btn911 : Button
    lateinit var btnGallery : Button
    lateinit var btnFin : Button

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
        btnHome.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kopo.ac.kr/jungsu/index.do"))
            startActivity(mIntent)
        }
        btn911.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"))
            startActivity(mIntent)
        }
        btnGallery.setOnClickListener {
            val mIntent = Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"))
            startActivity(mIntent)
        }
        btnFin.setOnClickListener {
            finish()
        }
    }
}