package br.com.arthur.clonando_repo

data class ItemModel(
    val name: String,
    val onRemove: (ItemModel) -> Unit = { _ -> }
)