package com.bwl.aspectjdemo

import android.os.Bundle
import androidx.annotation.Keep
import androidx.appcompat.app.AppCompatActivity
import com.bwl.aspectjdemo.ui.main.MainFragment
import com.bwl.libaspectj.annotation.DebugTrace

class MainActivity : AppCompatActivity() {

    @DebugTrace
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
        ClassJ().doSomething()
        haha()
    }

    @DebugTrace
    @Keep
    fun haha() {

    }
}
