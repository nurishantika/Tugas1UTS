package com.example.profilfakultas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.profile.*

class intFakultas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var imgF = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var namaFakultas =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var deskripsiFakultas =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var deskripsiDiri =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            imageView.setImageResource(imgF)
            datafakultas.text = namaFakultas
            deskfakultas.text = deskripsiFakultas
            dataprofil.text = deskripsiDiri
        }
    }
}