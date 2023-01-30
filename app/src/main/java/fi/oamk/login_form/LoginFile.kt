package fi.oamk.login_form

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun LoginFile(){
    //tow variables
    var email by remember {
        mutableStateOf( "")
    }
    var password by remember {
        mutableStateOf( "")
    }

    //layout column
    Column( modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally ) {
        TextField(
            value = email,
            onValueChange = { newText ->
                email = newText
            },
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            label = { Text(text = "Email") },
            placeholder = { Text(text = "Type your name") }
        )
        TextField(
            value = password,
            onValueChange = { newText ->
                password = newText
            },
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Type your password") }
        )
        Spacer(modifier = Modifier.height(0.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text(text = "Login")
            
        }

    }

}