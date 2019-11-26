package com.example.bakingrecipe

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

            btnLogin.setOnClickListener {

                    if(username.text.toString().equals("peggy")
                    &&password.text.toString().equals("peggy"))
                    {
                        var name = username.text.toString()

                        val intent = Intent(this, MainActivity::class.java)
                        intent.putExtra("name", name)
                        startActivity(intent)
                        Toast.makeText(this,"Logged in Successfully",Toast.LENGTH_SHORT).show()
                    }



                    else
                    Toast.makeText(this,"Login Failed",Toast.LENGTH_LONG).show()

            }


    }
}
