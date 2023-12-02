package com.example.radio

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.radio.ui.theme.RadioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RadioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Today()
                   // LiveRadio()
                    Rosary()
                }
            }
        }
    }
}
val color1= Color(0xFFC5DBF3)

val color2= Color( 0xFF0D2E6D)
val color3= Color( 0xFF92C1E9)
val backgroundColor= Color( 0xFFEAEFF4)
val sandal=Color(0xFFD7BB79)
val sandal2=Color(0xFFCAB78F)
val sandal3=Color(0xFFBEA76F)
val sandal4=Color(0xFFE1D2B8)

val white= Color.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Today( modifier: Modifier = Modifier) {


    val scrollState = rememberScrollState()

    Column(
        Modifier
            .background(backgroundColor)
            .padding(horizontal = 24.dp, vertical = 30.dp)
            .verticalScroll(state = scrollState,)
        ) {
//            Image(
//                painter = painterResource(id = ),
//                contentDescription = null
//            )
        Box(modifier = Modifier
            .height(100.dp)
            .fillMaxWidth())
        Spacer(modifier = Modifier.height(10.dp))
        Box(
                modifier = Modifier
                    .height(180.dp)
                    .clip(shape = RoundedCornerShape(10))
                    .background(color1)
                    .fillMaxWidth()
            ) {
                Column{
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                       modifier= Modifier
                           .clip(RoundedCornerShape(bottomEnd = 10.dp, topEnd = 10.dp))
                           .background(color2)
                           .width(180.dp)
                           .padding(horizontal = 16.dp)
                    ) {
                        Text("ON NOW", color = white, )
                        Box(modifier = Modifier
                            .height(40.dp)
                            .fillMaxWidth()
                        )
//                        Image(
//                            painter = painterResource(id = R.drawable.ic_launcher_background),
//                            contentDescription = null
//                        )
                    }
                    Column(
                        Modifier.padding(horizontal = 16.dp, vertical = 4.dp)
                    ){
                        Text(
                            "The Doctor is In",
                            color = color2,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 26.sp
                        )
                        Text("with Dr. Ray Guarendi", color = color2, fontSize = 18.sp, fontStyle = FontStyle.Italic)
                        Spacer(Modifier.weight(1f))
                        Row(
                            Modifier.fillMaxWidth(),
                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.ic_launcher_background),
//                                contentDescription = null
//                            )
                            Column {
                                Row(

                                ) {
                                    Text("UP NEXT", color = color2)
                                    Icon(
                                        imageVector = Icons.Default.ArrowForward,
                                        contentDescription = null
                                    )
                                }
                                Text("Road Map Heaven", color = color2, fontWeight = FontWeight.Bold, )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            Text("8:00 am", color = color2)
                        }
                    }
                }
            }
        Spacer(modifier = Modifier.height(30.dp))
        Text("Saint", color=color3, fontSize = 26.sp, fontWeight = FontWeight.Bold)
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Bottom,
        ){
            Text("Benignus",color=color2, fontSize = 40.sp, fontWeight = FontWeight.Bold)
            Text("Nov 6",color=color2, fontSize = 26.sp, fontWeight = FontWeight.Bold)

        }
        Text("Saint of the Day", color = color2, fontSize = 18.sp, fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.height(30.dp))

        Row ( Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            ){
            Box(
                Modifier
                    .clip(RoundedCornerShape(15))
                    .background(color3)
                    .height(50.dp)
                    .padding(horizontal = 16.dp), contentAlignment = Alignment.Center
            ){
                Row (verticalAlignment = Alignment.CenterVertically){
                    Text("About Saint Benignus",color=color2, fontWeight = FontWeight.Bold,)
                }
            }
            Text("Read more...", color = color2, textDecoration = TextDecoration.Underline)
        }
        Spacer(modifier = Modifier.height(30.dp))

        Text("TODAY'S ROSARY", color=color2, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            Modifier
                .fillMaxWidth()
                .height(350.dp)
                .clip(RoundedCornerShape(10))
                .background(sandal)
        ){
            Column {
                Box(contentAlignment = Alignment.Center, modifier= Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color.Transparent)) {
                    Text("THE JOYFUL MYSTERIES", color = Color.White, fontWeight = FontWeight.Bold)
                }
                Spacer(modifier = Modifier.weight(1f))
                Box(contentAlignment = Alignment.Center, modifier= Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color.Black.copy(alpha = 0.5F))) {
                    Row {
                        Text("PRAY NOW", color=sandal)
                    }
                }

            }
        }



    }



























}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiveRadio(modifier: Modifier = Modifier){
    val scrollState = rememberScrollState()

    Scaffold {it
        Column(
            Modifier
                .background(backgroundColor)
                .padding(it)
                .padding(horizontal = 24.dp, vertical = 30.dp)
                .verticalScroll(state = scrollState,)
                .fillMaxWidth()
        ) {
            Text("LIVE", color = color1, fontSize = 26.sp, fontWeight = FontWeight.Bold)
            Text("RADIO", color = color2, fontSize = 40.sp, fontWeight = FontWeight.W900)

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                "The Doctor is In",
                color = color2,
                fontWeight = FontWeight.SemiBold,
                fontSize = 26.sp
            )
            Text(
                "with Dr. Ray Guarendi",
                color = color3,
                fontSize = 18.sp,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .height(180.dp)
                    .clip(shape = RoundedCornerShape(10))
                    .background(color1)
                    .fillMaxWidth()
            ) {

            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"",
                color = color2,

                )
            Spacer(modifier = Modifier.height(30.dp))

            Row(verticalAlignment = Alignment.Bottom) {
                Text(
                    "Coming up at 8:00 am",
                    color = color2,
                    fontSize = 18.sp,
                    fontStyle = FontStyle.Italic
                )
                Spacer(Modifier.width(10.dp))
                Text("Road Map Heaven", color = color2, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(10.dp))



        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Rosary(){
    var selectedIndex:Int by remember{
        mutableStateOf(0)
    }
    val scrollState = rememberScrollState()
    val tabs= listOf<String>("Joyful", "Sorrowful", "Glorious", "Luminous")
    Scaffold {it
        Box(Modifier.background(sandal4).padding(it).fillMaxHeight()) {
            Column(
                Modifier
                    .padding(20.dp)
                   // .verticalScroll(scrollState)

            ) {
                Spacer(modifier = Modifier.height(50.dp))
                TabRow(
                    modifier = Modifier
                        .height(50.dp)
                        .clip(shape = RoundedCornerShape(30)),
                    containerColor = sandal2,
                    indicator = {

                    },
                    divider = {

                    },
                    selectedTabIndex = selectedIndex,
                ) {
                    tabs.forEachIndexed { index, title ->

                        Tab(

                            selected = selectedIndex == index,
                            onClick = {
                                selectedIndex = index
                            },
                            modifier = if (selectedIndex == index) {
                                Modifier
                                    .padding(horizontal = 2.dp)
                                    .height(38.dp)
                                    .clip(shape = RoundedCornerShape(30))
                                    .background(sandal3)
                            } else {
                                Modifier.drawBehind {
                                    drawLine(
                                        color = Color.Gray,
                                        start = Offset(size.width, 0f),
                                        end = Offset(size.width, size.height),
                                        strokeWidth = 1.dp.toPx()
                                    )
                                }
                            }
                        ) {

                            Text(title, color = Color.White)

                        }

                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    "THE JOYFUL MYSTERIES",
                    fontSize = 18.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Monday & Sunday",
                    color = sandal3,
                    fontSize = 18.sp,
                    fontStyle = FontStyle.Italic
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. ",
                    color = Color.White,

                    )
                Spacer(modifier = Modifier.height(10.dp))
                Column(
                    Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        Modifier
                            .clip(shape = CircleShape)
                            .background(sandal3)
                            .padding(20.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    Spacer(Modifier.height(10.dp))
                    Text("LISTEN LIVE", color = sandal3, fontWeight = FontWeight.SemiBold)

                }


            }
        }
    }
}

//
//@Preview(showBackground = true)
//@Composable
//fun TodayPreview() {
//    RadioTheme {
//        Today(modifier = Modifier)
//    }
//}

//@Preview(showBackground = true)
//@Composable
//fun LiveRadioPreview() {
//    RadioTheme {
//        LiveRadio(modifier = Modifier)
//    }
//}
@Preview(showBackground = true)
@Composable
fun RosaryPreview() {
    RadioTheme {
        Rosary()
    }
}
