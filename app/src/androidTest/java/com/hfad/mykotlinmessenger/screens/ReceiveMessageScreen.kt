package com.hfad.mykotlinmessenger.screens

import com.agoda.kakao.text.KTextView
import com.hfad.mykotlinmessenger.R
import com.hfad.mykotlinmessenger.ReceiveMessageActivity
import com.kaspersky.kaspresso.screens.KScreen

object ReceiveMessageScreen : KScreen<ReceiveMessageScreen>() {

    override val layoutId: Int? = R.layout.activity_receive_message
    override val viewClass: Class<*>? = ReceiveMessageActivity::class.java

    val textView = KTextView { withId(R.id.message) }
}