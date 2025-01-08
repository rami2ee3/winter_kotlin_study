package day15.model

import kotlinx.serialization.Serializable

@Serializable
class Album (
    val userId: Int,
    val id: Int,
    val title: String,
)