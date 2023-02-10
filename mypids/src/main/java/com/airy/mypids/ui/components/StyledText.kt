package com.airy.mypids.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Warning
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * 警告风格的文字，占满一行
 */
@Composable
fun FullWarningText(text: String, modifier: Modifier = Modifier) {
    Row(modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Icon(Icons.Rounded.Warning, "注意")
        Text(text, color = Color.DarkGray)
    }
}

/**
 * 警告风格的文字，占满一行
 */
@Composable
fun RowScope.RowWarningText(text: String, modifier: Modifier = Modifier) {
    Row(modifier.weight(1f).align(Alignment.CenterVertically), horizontalArrangement = Arrangement.Center) {
        Icon(Icons.Rounded.Warning, "注意")
        Text(text, color = Color.DarkGray)
    }
}