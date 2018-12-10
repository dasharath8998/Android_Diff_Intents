package com.example.hari.demo4

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDial.setOnClickListener{
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:${etNum.text.toString()}")
            startActivity(i)
        }

        btnBr.setOnClickListener{
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("${etBr.text.toString()}")
            startActivity(i)
        }

        btnWApp.setOnClickListener{
            val i = packageManager.getLaunchIntentForPackage("com.whatsapp")
            if(i==null){
                val i1 = Intent()
                i1.action = Intent.ACTION_VIEW
                i1.data = Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")
                startActivity(i1)
            }
            else{
                startActivity(i)
            }
        }

        btnAbhiBus.setOnClickListener{
            val i = packageManager.getLaunchIntentForPackage("com.app.abhibus")
            if(i==null){
                val i1 = Intent()
                i1.action = Intent.ACTION_VIEW
                i1.data = Uri.parse("https://play.google.com/store/apps/details?id=com.app.abhibus")
                startActivity(i1)
            }
            else{
                startActivity(i)
            }
        }

        btnNext.setOnClickListener{
            val i = Intent(this@MainActivity, welcomActivity::class.java)

            i.putExtra("name","${etName.text}")
            i.putExtra("email", "${etEmail.text}")
            startActivity(i)
        }

        btnAll.setOnClickListener{
            val i = Intent()
            i.action = Intent.ACTION_GET_CONTENT
            i.type = "*/*"
            startActivity(i)
        }
    }
}
