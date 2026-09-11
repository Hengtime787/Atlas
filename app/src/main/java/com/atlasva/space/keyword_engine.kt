//Hey! This is the keyword intent model, not to be used for the final, just the v1 prototype.
package com.atlasva.space

fun Rkesolve(request: String): String {

        if ("time now" in request) {
            return "TIME_CURRENT"
        }
        else return "ERROR"
}
