package com.example.hiltexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/*
@AndroidEntryPoint 어노테이션이 지정된 모든 클래스에 의존성을 제공할 수 있다.
의존성을 주입할 대상에게는 @Inject 어노테이션을 사용한다.
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car : Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        car.start()

    }

}