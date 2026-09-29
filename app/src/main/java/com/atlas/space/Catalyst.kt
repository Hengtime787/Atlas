package com.atlas.space

// All Aboard //

import android.os.Build
import android.speech.RecognitionListener
import android.speech.SpeechRecognizer
import android.speech.SpeechRecognizer.createSpeechRecognizer
import androidx.annotation.RequiresApi
import android.os.Bundle

fun Shells() {

}

@RequiresApi(Build.VERSION_CODES.S)
fun main() {
/*
    val Burning = SpeechRecognizer.createOnDeviceSpeechRecognizer(this)
    Burning.setRecognitionListener(object: RecognitionListener {
        fun onResults(results: Bundle?)
    })
*/
    val command: String = SpeechRecognizer.RESULTS_RECOGNITION

Ease() // sound saying 'im listening"

Fly(command)

}