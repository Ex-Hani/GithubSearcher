package com.example.githubsearch.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView

open class SearchHolder (taskView: View): RecyclerView.ViewHolder(taskView) {
    init {
        taskView.setOnClickListener { onClick(taskView) }
    }

    open fun onClick(v: View) {}
}