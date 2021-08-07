package com.example.githubsearch.presentation

import moxy.MvpPresenter

class MainPresenter : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.setRootScreen()
    }
}