package com.d34th.nullpointer.virtualtrainercompose.ui.share

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.d34th.nullpointer.virtualtrainercompose.R
import com.d34th.nullpointer.virtualtrainercompose.ui.theme.ubuntu

@Composable
fun ToolbarBack(title: String, actionBack: () -> Unit) {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.primary,
        title = { Text(title, color = Color.Black, fontFamily = ubuntu, fontWeight = FontWeight.SemiBold) },
        contentColor = Color.White,
        navigationIcon = {
            IconButton(onClick = actionBack) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    tint = Color.Black
                )
            }
        })
}

@Composable
fun SimpleToolbar(title: String) {
    TopAppBar(
        contentColor = Color.White,
        backgroundColor = MaterialTheme.colors.primary,
        title = { Text(title,color = Color.Black, fontFamily = ubuntu, fontWeight = FontWeight.SemiBold) })
}

@Composable
fun ToolbarSettings(title: String, actionSettings: () -> Unit) {
    TopAppBar(
        contentColor = Color.White,
        backgroundColor = MaterialTheme.colors.primary,
        title = { Text(title,color = Color.Black, fontFamily = ubuntu, fontWeight = FontWeight.SemiBold) },
        actions = {
            IconButton(onClick = actionSettings) {
                Icon(
                    Icons.Default.Settings,
                    contentDescription = null,
                    tint = Color.Black
                )
            }
        }
    )
}