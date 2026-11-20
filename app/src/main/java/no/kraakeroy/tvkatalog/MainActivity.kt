package no.kraakeroy.tvkatalog

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * POC for TV-katalog.
 *
 * Målet med dette skjelettet er bare å bekrefte hele kjeden:
 *  - at appen bygges til en APK (via GitHub Actions),
 *  - at den kan sidelastes på Google TV,
 *  - at den dukker opp / kan festes i app-raden,
 *  - og at fjernkontrollens D-pad flytter fokus mellom kortene og «OK» velger.
 *
 * Ingen tredjepartsbibliotek, ingen nettverk – bare fokuserbare kort.
 * Den ekte katalogen (Jellyfin + NRK først) bygges oppå når POC-en er bekreftet.
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val status = findViewById<TextView>(R.id.status)

        val kort = listOf(
            R.id.btnFilmer to "Filmer",
            R.id.btnSerier to "Serier",
            R.id.btnFortsett to "Fortsett",
            R.id.btnJellyfin to "Jellyfin",
            R.id.btnNrk to "NRK"
        )

        for ((id, navn) in kort) {
            findViewById<Button>(id).setOnClickListener {
                status.text = "Valgt: $navn  (her kobles innholdet på senere)"
            }
        }

        // La første kort ha fokus ved oppstart, så fjernkontrollen har noe å navigere fra
        findViewById<Button>(R.id.btnFilmer).requestFocus()
    }
}
