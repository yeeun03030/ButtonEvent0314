package kr.ac.kopo.buttonevent0314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button /*늦은 초기화*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 클릭하셨군요?", Toast.LENGTH_SHORT).show()
        }
    }
}