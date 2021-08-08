package com.example.githubsearch.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.githubsearch.R
import com.example.githubsearch.databinding.FragmentUserBinding
import com.example.githubsearch.presentation.UserPresenter
import com.example.githubsearch.presentation.UserView
import moxy.MvpAppCompatFragment

class UserFragment : MvpAppCompatFragment(), UserView {
    lateinit var adapter: SearchAdapter
    lateinit var presenter: UserPresenter
    lateinit var binding: FragmentUserBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_user, container, false
        )

        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = SearchAdapter(onUserClick = { users, position ->

        })

        binding.recyclerListInfo.layoutManager = LinearLayoutManager(activity)
        binding.recyclerListInfo.adapter = adapter
    }
}