package com.example.kuit7th_api_practice.data.model.response

data class PostResponse(
    val id: Long,
    val title: String,
    val content: String,
    val imageUrl: String?,
    val author: AuthorResponse,
    val createdAt: String,
<<<<<<< HEAD
    val updatedAt: String,
    var isFavorite: Boolean = false
=======
    val updatedAt: String
>>>>>>> 2d00d38cb906b526729d7106c165368d9e80b23f
)
