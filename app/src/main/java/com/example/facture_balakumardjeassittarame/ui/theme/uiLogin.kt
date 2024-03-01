package com.example.facture_balakumardjeassittarame.ui.theme

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner

@Composable
fun LoginScreen(onLoginClick: (isSuccessful: Boolean) -> Unit) {
    val context = LocalContext.current

    val loginFormState = LoginFormState()

    Surface(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            TextField(
                value = loginFormState.username,
                onValueChange = { loginFormState.username = it },
                placeholder = { Text("Username") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = loginFormState.password,
                onValueChange = { loginFormState.password = it },
                placeholder = { Text("Password") },
                modifier = Modifier.fillMaxWidth()
            )
            Button(
                onClick = {
                    if (loginFormState.username == "etudiant" && loginFormState.password == "Azerty") {

                        onLoginClick(true)
                        Toast.makeText(context, "Login successful", Toast.LENGTH_SHORT).show()
                    } else {

                        onLoginClick(false)
                        Toast.makeText(context, "Login failed", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Login")
            }
        }
    }
}