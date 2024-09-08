package br.com.arthur.clonando_repo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class ItemModel(
    val id: Int,
    val name: String,
    val onRemove: (ItemModel) -> Unit


)