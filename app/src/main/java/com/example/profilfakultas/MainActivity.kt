package com.example.profilfakultas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFakultas()
        RecyclerView.layoutManager = LinearLayoutManager(this)
        RecyclerView.setHasFixedSize(true)
        RecyclerView.adapter = Adapterf(data, { onItem: DataCl -> onItemClicked(onItem) })
    }

    private fun onItemClicked(onItem: DataCl) {
        val showDetailActivityIntent = Intent(this, intFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.gbr)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.deskripsi)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.daftar)
        startActivity(showDetailActivityIntent)
    }

    private fun createFakultas(): List<DataCl> {
        val List = ArrayList<DataCl>()
        List.add(
            DataCl(
                R.drawable.logo_upn,
                "FAKULTAS ILMU KOMPUTER",
                "Fakultas Ilmu Komputer\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas di UPN 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi :",
                "1. Teknik Informatika\n" +
                        "2. Sistem Informasi"
            )
        )
        List.add(
            DataCl(
                R.drawable.logo_upn,
                "FAKULTAS TEKNIK",
                "Fakultas Teknik\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas di UPN 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi :",
                "1. Teknik Kimia\n" +
                        "2. Teknik Industri\n" +
                        "3. Teknik Sipil\n" +
                        "4. Teknik Lingkungan\n" +
                        "5. Teknologi Pangan"
            )
        )
        List.add(
            DataCl(
                R.drawable.logo_upn,
                "FAKULTAS EKONOMI DAN BISNIS",
                "Fakultas Ekonomi dan Bisnis\n" +
                        "merupakan salah satu dari 7\n" +
                        "Fakultas di UPN 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi :",
                "1.Ekonomi Pembangunan\n" +
                        "2. Akuntansi\n" +
                        "3. Manajemen"
            )
        )
        List.add(
            DataCl(
                R.drawable.logo_upn,
                "FAKULTAS PERTANIAN",
                "Fakultas Pertanian\n" +
                        "merupakan salah stau dari 7\n" +
                        "Fakultas di UPN 'Veteran' Jawa\n" +
                        "Timur. Yang terdiri dari program\n" +
                        "studi :",
                "1. Agroteknologi\n" +
                        "2. Agribisnis"
            )
        )
        List.add(
            DataCl(
                R.drawable.screenshot,
                "NURISA RAHMA SHANTIKA",
                "Nurisa Rahma Shantika\n" +
                        "bisa dipanggil Tika.\n" +
                        "Lahir di Surabaya, 16 September\n" +
                        "1999. Tinggal di Semolowaru Elok.",
                "No. Hp : 082337477XXX\n" +
                        "Email : nurisarahmashantika@gmail.com\n" +
                        "Github : github.com/nurishantika\n \n" +
                        "Riwayat Pendidikan: \n" +
                        "(2006-2012) SDN Baratajaya\n" +
                        "(2012-2015) SMPN 39 Surabaya\n" +
                        "(2015-2018) SMA Muhammadiyah 2 Surabaya\n" +
                        "(2018-Sekarang) UPN 'Veteran' Jatim"
            )
        )
        return List
    }
}
