package com.bwl.aspectjdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bwl.aspectjdemo.ui.main.MainFragment
import com.bwl.libaspectj.annotation.DebugTrace
import com.bwl.mylibrary2.Test

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
        Test.test()
    }
}
