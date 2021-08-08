package com.example.githubsearch.ui

import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.githubsearch.R
import com.example.githubsearch.databinding.FragmentUserFragmentBinding
import com.example.githubsearch.databinding.RecyclerviewItemBinding
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