import com.pmydm.conversacioncondinamicas.Message1

/**
 * SampleData for Jetpack Compose Tutorial 
 */
object SampleData {
    // Sample conversation data
    val conversationSample = listOf(
        Message1(
            "Michael",
            "Que pasa bro como estas?"
        ),
        Message1(
            "Kobe",
            """Pues regular tio, me duele:
            -La pierna.
            -La cabeza.
            -El corazon.
            -La rodilla.
            -El codo""".trim()
        ),
        Message1(
            "",
            """Bro si estas muerto""".trim()
        ),
        Message1(
            "Michael",
            """Tio no te pases con el chaval.
            |It's so much fun!""".trim()
        ),
        Message1(
            "Kobe",
            "Searching for alternatives to XML layouts..."
        ),
        Message1(
            "Michael",
            """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trim()
        ),
        Message1(
            "Kobe",
            "It's available from API 21+ :)"
        ),
        Message1(
            "Michael",
            "Writing Kotlin for UI seems so natural, Compose where have you been all my life?"
        ),
        Message1(
            "Kobe",
            "Android Studio next version's name is Arctic Fox"
        ),
        Message1(
            "Michael",
            "Android Studio Arctic Fox tooling for Compose is top notch ^_^"
        ),
        Message1(
            "Kobe",
            "I didn't know you can now run the emulator directly from Android Studio"
        ),
        Message1(
            "Michael",
            "Compose Previews are great to check quickly how a composable layout looks like"
        ),
        Message1(
            "Kobe",
            "Previews are also interactive after enabling the experimental setting"
        ),
        Message1(
            "Michael",
            "Have you tried writing build.gradle with KTS?"
        ),
    )
}
