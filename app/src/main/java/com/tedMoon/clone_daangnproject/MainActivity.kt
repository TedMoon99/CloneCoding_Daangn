package com.tedMoon.clone_daangnproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


// github 연동테스트 주석1
// github 연동테스트 주석2
// github 연동테스트 주석3
// github 브랜치 연동 테스트 주석4
// github 연동테스트 주석4
// github 브랜치 연동테스트 주석5

//
//
//
//
//
/// vuuybuybyubuybybub///
/// ㄴㅁ아룬이ㅏㅁ루ㅏㅣㄴㅇ리ㅏㄴㅁㅇ리ㅏㄴㅇ머ㅏㅣ런ㅁ이ㅏ런미ㅏ러ㅣㄴ멍리ㅏㅇㅁ너리ㅏ
///
