package com.example.questuserinput_236

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

fun FormDataDiri(modifier: Modifier)
{
    // Variabel-variabel untuk mengingat nilai masukan dari
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }

    // variabel-variabel untuk menyimpan data yang diperoleh dari
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender:List<String> = listOf("Laki-laki", "Perempuan")
}