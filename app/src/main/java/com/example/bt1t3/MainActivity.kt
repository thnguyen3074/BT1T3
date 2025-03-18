package com.example.bt1t3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bt1t3.ui.theme.BT1T3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BT1T3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                }
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {
                        composable("home") { JetpackComposeScreen(navController) }
                        composable("componentsList") { UIComponentsListScreen(navController) }
                        composable("textDetail") { TextDetailScreen(navController) }
                }
            }
        }
    }
}

@Composable
fun JetpackComposeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp), // Add padding around the screen
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
// Thêm hình ảnh vào giao diện
        Image(
            painter = painterResource(id = R.drawable.logo), // Thay đổi tên tài nguyên hình ảnh nếu cần
            contentDescription = "Jetpack Compose Logo",
            modifier = Modifier.size(350.dp).padding(top = 80.dp)// Cài đặt kích thước cho hình ảnh
        )


        // Text showing Jetpack Compose description
        Text(
            text = "Jetpack Compose",
            style = androidx.compose.ui.text.TextStyle(
                color = Color.Black,
                fontSize = 24.sp
            ),
            modifier = Modifier.padding(top = 60.dp).padding(bottom = 10.dp)
        )

        Text(
            text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
            style = androidx.compose.ui.text.TextStyle(
                color = Color(0xFF4A4646),
                fontSize = 16.sp
            ),
            modifier = Modifier.padding(bottom = 200.dp),
            textAlign = TextAlign.Center
        )

        // Button with 'I'm ready'
        Button(
            onClick = { navController.navigate("componentsList") },
            modifier = Modifier.width(315.dp).height(53.dp),
            colors = androidx.compose.material3.ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2196F3) // Đặt màu nền là #2196F3
            )
        ) {
            Text(text = "I'm ready", color = Color.White, fontSize = 20.sp)
        }
    }
}

@Composable
fun UIComponentsListScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize().padding(16.dp),

    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "UI Components List",
                style = androidx.compose.ui.text.TextStyle(fontSize = 24.sp),
                color = Color(0xFF2196F3),
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }


        Text("Display",fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color(0xFF333333))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { navController.navigate("textDetail") }
                .background(Color(0x4D2196F3), shape = RoundedCornerShape(10.dp))
                .padding(16.dp) // Padding to separate text from the edge of the box
        ) {
            Text(
                text = "Text",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 3.dp)            )
            Text(
                text = "Displays text",
                fontSize = 18.sp,
                color = Color(0xFF333333)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { /* Handle Image click */ }
                .background(Color(0x4D2196F3), shape = RoundedCornerShape(10.dp))
                .padding(16.dp) // Padding to separate text from the edge of the box
        ) {
            Text(
                text = "Image",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 3.dp)            )
            Text(
                text = "Displays an image",
                fontSize = 18.sp,
                color = Color(0xFF333333)
            )
        }

        // Input heading
        Text("Input",fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color(0xFF333333))

        // TextField clickable entire box instead of just the text
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { /* Handle TextField click */ }
                .background(Color(0x4D2196F3), shape = RoundedCornerShape(10.dp))
                .padding(16.dp) // Padding to separate text from the edge of the box
        ) {
            Text(
                text = "TextField",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 3.dp)            )
            Text(
                text = "Input field for text",
                fontSize = 18.sp,
                color = Color(0xFF333333)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { /* Handle PasswordField click */ }
                .background(Color(0x4D2196F3), shape = RoundedCornerShape(10.dp))
                .padding(16.dp) // Padding to separate text from the edge of the box
        ) {
            Text(
                text = "PasswordField",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 3.dp)
            )
            Text(
                text = "Input field for passwords",
                fontSize = 18.sp,
                color = Color(0xFF333333)
            )
        }

        // Layout heading
        Text("Layout",fontWeight = FontWeight.Bold, fontSize = 18.sp, color = Color(0xFF333333))

        // Column clickable entire box instead of just the text
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { /* Handle Column click */ }
                .background(Color(0x4D2196F3), shape = RoundedCornerShape(10.dp))
                .padding(16.dp) // Padding to separate text from the edge of the box
        ) {
            Text(
                text = "Column",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 3.dp)            )
            Text(
                text = "Arranges elements vertically",
                fontSize = 18.sp,
                color = Color(0xFF333333)
            )
        }

        // Row clickable entire box instead of just the text
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .clickable { /* Handle Row click */ }
                .background(Color(0x4D2196F3), shape = RoundedCornerShape(10.dp))
                .padding(16.dp) // Padding to separate text from the edge of the box
        ) {
            Text(
                text = "Row",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333),
                modifier = Modifier.padding(bottom = 3.dp)            )
            Text(
                text = "Arranges elements horizontally",
                fontSize = 18.sp,
                color = Color(0xFF333333)
            )
        }
    }
}

@Composable
fun TextDetailScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().padding(vertical = 16.dp)) {

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.align(Alignment.CenterStart) // Đặt nút "Back" ở bên trái
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color(0xFF2196F3) // Màu nút Back
                )
            }


            Text(
                text = "Text Detail",
                style = androidx.compose.ui.text.TextStyle(fontSize = 24.sp),
                color = Color(0xFF2196F3), // Màu tiêu đề
                modifier = Modifier.align(Alignment.Center) // Căn giữa tiêu đề
            )
        }
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Text Detail",
            modifier = Modifier.size(450.dp).padding(top = 250.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BT1T3Theme {
        JetpackComposeScreen(navController = rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun UIComponentsListPreview() {
    UIComponentsListScreen(navController = rememberNavController())
}

@Preview(showBackground = true)
@Composable
fun TextDetailPreview() {
    TextDetailScreen(navController = rememberNavController())
}

