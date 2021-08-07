package com.example.githubsearch.presentation

import moxy.MvpView
import moxy.viewstate.strategy.alias.Skip

interface MainView: MvpView {
    @Skip
    fun setRootScreen()
}