package com.example.navigationkt.ui.model

import java.io.Serializable

data class RecyclerModel(
    val imageUrl: String,
    val name: String,
    val cost: String,
    val color: String
): Serializable