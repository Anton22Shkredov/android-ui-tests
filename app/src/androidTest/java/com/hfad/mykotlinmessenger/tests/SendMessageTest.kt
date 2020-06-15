package com.hfad.mykotlinmessenger.tests

import allure.*
import android.Manifest
import androidx.test.rule.ActivityTestRule
import androidx.test.rule.GrantPermissionRule
import com.hfad.mykotlinmessenger.CreateMessageActivity
import com.hfad.mykotlinmessenger.screens.ReceiveMessageScreen
import com.hfad.mykotlinmessenger.screens.CreateMessageScreen
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.qameta.allure.SeverityLevel
import org.junit.Rule
import org.junit.Test

class SendMessageTest : TestCase() {

    @get:Rule
    val activityTestRule = ActivityTestRule(CreateMessageActivity::class.java, true, false)

    @get:Rule
    val storagePermissionsRule: GrantPermissionRule = GrantPermissionRule.grant(
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE
    )

    @Test
    @Epic("General")
    @Feature("Text on main screen")
    @Story("Slow")
    @Owner("user2")
    @Severity(SeverityLevel.CRITICAL)
    fun testSendMessage () =
            before {
                activityTestRule.launchActivity(null)
            }.after {
            }.run {
            val message = "Hi, friend!"
                step("Отправляем сообщение") {
                    CreateMessageScreen {
                        textField {
                            typeText(message)
                        }
                        sendButton {
                            click()
                        }
                    }
                }
                step("Проверяем сообщение") {
                    ReceiveMessageScreen {
                        textView {
                            containsText(message)
                        }
                    }
                }
            }
}