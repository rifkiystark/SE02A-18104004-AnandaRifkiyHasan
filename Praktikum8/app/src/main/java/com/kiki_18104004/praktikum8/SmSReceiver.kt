package com.kiki_18104004.praktikum8

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.telephony.SmsMessage
import android.util.Log

class SmSReceiver : BroadcastReceiver() {

    private val TAG = SmSReceiver::class.java.simpleName
    override fun onReceive(context: Context, intent: Intent) {
        val bundle = intent.extras
        try {
            if (bundle != null) {
                val pdusObj = bundle.get("pdus") as Array<Any>
                for (aPdusObj in pdusObj) {
                    val currentMessage = getIncomingMessage(aPdusObj, bundle)
                    val senderNum = currentMessage.displayOriginatingAddress.toString()
                    val message = currentMessage.displayMessageBody
                    Log.d(TAG, "senderNum: $senderNum; message: $message")
                    val showSmsIntent = Intent(context, SmsReceiverActivity::class.java)
                    showSmsIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    showSmsIntent.putExtra(SmsReceiverActivity.EXTRA_SMS_NO, senderNum)
                    showSmsIntent.putExtra(SmsReceiverActivity.EXTRA_SMS_MESSAGE, message)
                    context.startActivity(showSmsIntent)
                }
            }
        } catch (e: Exception) {
            Log.d(TAG, "Exception smsReceiver$e")
        }
    }

    private fun getIncomingMessage(aObject: Any, bundle: Bundle): SmsMessage {
        val currentSMS: SmsMessage
        currentSMS = if (Build.VERSION.SDK_INT >= 23) {
            val format = bundle.getString("format")
            SmsMessage.createFromPdu(aObject as ByteArray, format)
        } else SmsMessage.createFromPdu(aObject as ByteArray)
        return currentSMS
    }
}