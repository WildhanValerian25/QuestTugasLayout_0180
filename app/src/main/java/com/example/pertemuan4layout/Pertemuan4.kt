package com.example.pertemuan4layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ActivitasPertama(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = stringResource(id = R.string.prodi),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 14.sp,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Card 1 : DarkGray
        ProfileCard(
            nameRes = R.string.nama_1,
            telpRes = R.string.telp_1,
            alamatRes = R.string.alamat_1,
            BackgroundColor = colorResource(id = R.color.card_gray)

        )
        // Card 2 : Purple
        ProfileCard(
            nameRes = R.string.nama_2,
            telpRes = R.string.telp_2,
            alamatRes = R.string.alamat_2,
            BackgroundColor = colorResource(id = R.color.card_purple)
        )
    }
}

@Composable
fun ProfileCard(nameRes: Int, telpRes: Int, alamatRes: Int, BackgroundColor: Color) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp), // <--- Tutup kurung modifier di sini (tambah koma)
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = BackgroundColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {

            Column(modifier = Modifier.weight(1f).padding(horizontal = 12.dp)) {
                Text(text = stringResource(id = nameRes), fontSize = 16.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Text(text = stringResource(id = telpRes), fontSize = 12.sp, color = Color.Yellow)
                Text(text = stringResource(id = alamatRes), fontSize = 12.sp, color = Color.White)
            }

            Image(painter = painterResource(id = R.drawable.logoultraman), contentDescription = null, modifier = Modifier.size(50.dp).clip(CircleShape))
        }
    }


