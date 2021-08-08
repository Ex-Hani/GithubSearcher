package com.example.githubsearch.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubsearch.R
import com.example.githubsearch.databinding.RecyclerviewItemBinding
import com.example.githubsearch.model.UserData

class SearchAdapter(
    val onUserClick: ((users: MutableList<UserData>, position: Int) -> Unit?)? = null
) : RecyclerView.Adapter<SearchHolder>() {

    lateinit var binding: RecyclerviewItemBinding

    var users: MutableList<UserData> = mutableListOf(
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
        UserData("Lalalala"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchHolder {
        val v = if (request) {
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_user, parent, false)
        } else {
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_repo, parent, false)
        }

        return object : SearchHolder(v) {
            override fun onClick(v: View) {
                onUserClick?.invoke(users, adapterPosition)
            }
        }
    }

    override fun onBindViewHolder(holder: SearchHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return users.get(position).viewType //Todo viewType = для юзера например 1, а для репо - 0 чтобы работал
    }

    override fun getItemCount(): Int {
        return users.size
    }
}