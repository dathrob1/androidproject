package com.example.teleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.budiyev.android.codescanner.*



class scanner : AppCompatActivity() {

    private lateinit var codeScanner:CodeScanner

    override fun onCreate(savedInstanceState: Bundle?) {
        val scannerView = findViewById<CodeScannerView>(R.id.scannerView1)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanner)

        codeScanner = CodeScanner(this,scannerView)
        codeScanner.camera = CodeScanner.CAMERA_BACK
        codeScanner.formats = CodeScanner.ALL_FORMATS
        codeScanner.autoFocusMode = AutoFocusMode.SAFE
        codeScanner.scanMode = ScanMode.SINGLE
        codeScanner.isAutoFocusEnabled = true
        codeScanner.isFlashEnabled = false


        codeScanner.decodeCallback = DecodeCallback {

            runOnUiThread {
                Toast.makeText(this,"scan result : "+(it.text),Toast.LENGTH_LONG).show()
            }
        }
        codeScanner.errorCallback = ErrorCallback {
             runOnUiThread{
                 Toast.makeText(this,"camera error : "+(it.message),Toast.LENGTH_LONG).show()
             }
        }
        codeScanner.startPreview()

    }
    override fun onResume(){
        super.onResume()
        codeScanner.startPreview()
    }
}