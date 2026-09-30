package com.atlas.space

import android.content.Context
import android.util.Log
import java.io.File
import java.io.FileOutputStream

object Adrenaline {
    init {
        System.loadLibrary("atlas_native")
    }

    private external fun Ignite(modelPath: String): Boolean
    private external fun Purge()
    private external fun Resolve(query: String): String

    private var modelFilePath: String? = null

    // 1. Called ONCE in MainActivity.onCreate(this) to unpack model.bin from assets
    fun setup(context: Context, modelFileName: String = "starlight.ftz") {
        try {
            val file = File(context.filesDir, modelFileName)
            if (!file.exists()) {
                context.assets.open(modelFileName).use { input ->
                    FileOutputStream(file).use { output ->
                        input.copyTo(output)
                    }
                }
            }
            modelFilePath = file.absolutePath
        } catch (e: Exception) {
            Log.e("Adrenaline", "Setup failed", e)
        }
    }

    // 2. Autonomous intent resolver: Ignite -> Predict -> Purge
    fun processQuery(input: String): String {
        val path = modelFilePath ?: return "UNKNOWN"

        // Ignite into RAM (~2ms)
        Ignite(path)

        // Run inference
        val rawResult = Resolve(input)

        // Purge from RAM instantly (0 idle memory)
        Purge()

        // Clean up label e.g. "MEDIA_PLAY"
        return rawResult.split(" ").firstOrNull()?.removePrefix("__label__") ?: "UNKNOWN"
    }
}