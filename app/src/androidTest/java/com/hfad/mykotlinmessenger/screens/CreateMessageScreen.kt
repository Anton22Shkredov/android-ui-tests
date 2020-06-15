package com.hfad.mykotlinmessenger.screens

import com.agoda.kakao.edit.KEditText
import com.agoda.kakao.text.KButton
import com.hfad.mykotlinmessenger.CreateMessageActivity
import com.hfad.mykotlinmessenger.R
import com.kaspersky.kaspresso.screens.KScreen

object CreateMessageScreen : KScreen<CreateMessageScreen>() {

    override val layoutId: Int? = R.layout.activity_create_message
    override val viewClass: Class<*>? = CreateMessageActivity::class.java

    val sendButton = KButton { withId(R.id.send) }
    val textField = KEditText { withId(R.id.message) }
}