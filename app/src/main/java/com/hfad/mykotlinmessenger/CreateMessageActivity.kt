package com.hfad.mykotlinmessenger

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class CreateMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_message)
    }
    //Вызвать onSendMessage() при щелчке на кнопке
    fun onSendMessage(view: View?) {
        val messageView = findViewById<View>(R.id.message) as EditText
        val messageText = messageView.text.toString()
        val intent = Intent(this, ReceiveMessageActivity::class.java)
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText)
        startActivity(intent)
    }
}
