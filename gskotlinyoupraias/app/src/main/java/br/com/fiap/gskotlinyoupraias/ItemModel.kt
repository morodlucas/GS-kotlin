package br.com.fiap.gskotlinyoupraias

data class ItemModel(val praiaName: String, val estadoName: String, val cidadeName: String,  val onRemove: (ItemModel) -> Unit)