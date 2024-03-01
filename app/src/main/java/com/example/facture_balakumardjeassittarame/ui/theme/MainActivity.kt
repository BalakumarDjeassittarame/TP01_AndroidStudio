package com.example.facture_balakumardjeassittarame.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.facture_balakumardjeassittarame.ui.theme.Facture_BalakumarDjeassittarameTheme
import android.widget.Toast
import com.example.facture_balakumardjeassittarame.ui.theme.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen { isSuccessful ->
                if (isSuccessful) {

                    Toast.makeText(this@MainActivity, "Login successful", Toast.LENGTH_SHORT).show()

                } else {

                    Toast.makeText(this@MainActivity, "Login failed", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}