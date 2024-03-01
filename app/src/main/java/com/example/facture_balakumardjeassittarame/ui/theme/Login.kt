package com.example.facture_balakumardjeassittarame.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class LoginFormState {
    var username by mutableStateOf("")
    var password by mutableStateOf("")
}