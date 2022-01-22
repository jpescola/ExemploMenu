package br.com.jpescola.exemplomenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var cont = 0
    private lateinit var txtResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtResultado = findViewById(R.id.txtResultado)
        txtResultado.text = "$cont"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.opcoes, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.mnuReiniciar -> cont = 0
            R.id.mnuIncrementar -> cont++
            R.id.mnuFechar -> finish() // fecha o aplicativo
            else -> return super.onOptionsItemSelected(item)
        }
        txtResultado.text = "$cont"
        return true
    }
}