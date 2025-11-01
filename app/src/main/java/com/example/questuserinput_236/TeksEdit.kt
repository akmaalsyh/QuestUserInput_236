package com.example.questuserinput_236


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormDataDiri(modifier: Modifier)
{
    // Variabel-variabel untuk mengingat nilai masukan dari
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    var textStatus by remember { mutableStateOf(value = "") }

    val gender:List<String> = listOf("Laki-laki", "Perempuan")
    val status:List<String> = listOf("Janda", "Lajang", "Duda")

    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                bottom = dimensionResource(R.dimen.padding_medium),
                top = dimensionResource(R.dimen.padding_medium)),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF3E5F5))
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.padding_medium)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = dimensionResource(R.dimen.padding_small)),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFBA68C8)), // Ungu sedang
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
            ) {
                Text(
                    text = "Formulir Pendaftaran",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = dimensionResource(R.dimen.padding_small))
                    )
                }
            }
            ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = dimensionResource(R.dimen.padding_small)),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(dimensionResource(R.dimen.padding_medium))
                ) {
                    Text(
                        text = "NAMA LENGKAP",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp
                    )
                    OutlinedTextField(
                        value = textNama,
                        onValueChange = { textNama = it },
                        label = { Text("Isian nama lengkap") },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = dimensionResource(R.dimen.padding_small))
                    )
                    Text(
                        text = "JENIS KELAMIN",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
                    )
                    gender.forEach { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectable(
                                    selected = textJK == item,
                                    onClick = { textJK = item }
                                )
                                .padding(start = 16.dp, top = 4.dp, bottom = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = textJK == item,
                                onClick = { textJK = item }
                            )
                            Text(text = item)
                        }
                    }
                    Text(
                        text = "STATUS PERKAWINAN",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
                    )
                    status.forEach { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .selectable(
                                    selected = textStatus == item,
                                    onClick = { textStatus = item }
                                )
                                .padding(start = 16.dp, top = 4.dp, bottom = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = textStatus == item,
                                onClick = { textStatus = item }
                            )
                            Text(text = item)
                        }
                    }
                    Text(
                        text = "ALAMAT",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
                    )
                    OutlinedTextField(
                        value = textAlamat,
                        onValueChange = { textAlamat = it },
                        label = { Text("Alamat") },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = dimensionResource(R.dimen.padding_small))
                    )
                    Button(
                        onClick = {
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(top = dimensionResource(R.dimen.padding_small)),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3F51B5))
                    ) {
                        Text(text = stringResource(id = R.string.submit), color = Color.White)
                    }
                }
            }
        }
    }
