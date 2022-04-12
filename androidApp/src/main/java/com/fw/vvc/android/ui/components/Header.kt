package com.fw.vvc.android.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun Header(text: String) {
    Text(text = text, style = MaterialTheme.typography.h6)
}