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
            "Jose",
            """Bro pues tienes que ir al médico""".trim()
        ),
        Message1(
            "Michael",
            """Tio no te pases con el chaval""".trim()
        ),
        Message1(
            "Kobe",
            "Bro esque he entrenado mucho"
        ),
        Message1(
            "Michael",
            """Además Jose cuantos anillos tienes? porque yo tengo 6
                |Kobe tiene 5 y tu cuantos tienes?""".trimMargin().trim()
        ),
        Message1(
            "Jose",
            "Yo no tengo ninguno la verdad." +
                    "Estoy jugando en la liga provincial de cordoba" +
                    "porque soy un poco malo"
        ),
        Message1(
            "Michael",
            "Ya lo sabemos pero te daremos unas clases cuando quieras"
        ),
        Message1(
            "Jose",
            "Por mi genial, cuando quereis que juguemos?"
        ),
        Message1(
            "Kobe",
            "A mi me viene bien el sabado, tu como lo tienes michael? ^_^"
        ),
        Message1(
            "Michael",
            "Pues tengo que ir en mi avión privado a londres"

        ),
        Message1(
            "Jose",
            "No puedes recogerme?"
        ),
        Message1(
            "Kobe",
            "Y a mi?"
        ),
        Message1(
            "Michael",
            "Vale os recojo a los dos pero no no tardeis"
        ),
    )
}
