package com.example.githubsearch.ui

import android.os.Bundle
import com.example.githubsearch.R
import com.example.githubsearch.presentation.MainView
import moxy.MvpAppCompatActivity

class MainActivity : MvpAppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main)
    }
    override fun setRootScreen() {
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, UserFragment())
            .commit()
    }
}