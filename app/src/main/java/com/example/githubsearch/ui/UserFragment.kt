package com.example.githubsearch.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.githubsearch.R
import com.example.githubsearch.databinding.FragmentUserFragmentBinding
import com.example.githubsearch.presentation.UserPresenter
import com.example.githubsearch.presentation.UserView
import moxy.MvpAppCompatFragment

class UserFragment : MvpAppCompatFragment(), UserView {

    lateinit var presenter: UserPresenter
    lateinit var binding: FragmentUserFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_user_fragment, container, false
        )
        return inflater.inflate(R.layout.fragment_user_fragment, container, false)
    }
}