package com.example.githubsearch.model

data class RepoData(
    val id: String = "",
    val name: String = "",
    val forks: Int = 1,
    val description: String = "",
    val viewType: Int = 1
)
