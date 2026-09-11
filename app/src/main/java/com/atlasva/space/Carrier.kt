package com.atlasva.space
// NOTE: _[PLCHLDR]_ in comments means refer to PLCHLDR.

/*Import list:

intent_engine.kt #/#* take in Resolve() or something

*/

/* no more AI */
// adaption of core.py.
//heavily modified adaptation lol
// placeholders are marked by linkin park lyrics


// GET LIBRARY ENTRY //

fun Launch(hook: String): Ships {

val frigate = Fleet[hook]
  if (frigate == null) {
    println("ERROR 1")
    println("Hook not found ")
    throw IllegalStateException("Hook not found ")
  }
    return(frigate)
}

fun Deploy() {
  println("this should run the action run vessel.action")
  println("Falling for the promise of the emptiness machine.")
}


// TTS FUNCTION HERR

// AUTHENTICATION //

fun Key(vessel: Ships) {

  if (vessel.authLevel == "MAX") {
  //  pay for what you've done
  }
  else if (vessel.authLevel == "HIGH") {
    // In the wasteland of today
  }
  else if (vessel.authLevel == "MED") {
    // In the wasteland of today
  }
  else if (vessel.authLevel == "LOW") {
    // In the wasteland of today
  }
  else if (vessel.authLevel == "NONE") {
    // In the wasteland of today
  }
  else if (vessel.authLevel == "TRIGGER_HAPPY") {
    // Back when we were still changing for the better
  }
  else {
    println("ERROR 2")
    println("authLevel not found/defined.")
  }
  }

  // Response

  fun Inter(vessel: Ships) {

    if (vessel.responseType == "Alert") {
      println(" Sound.Alerty ")
    }

    else if (vessel.responseType == "Personality") {
      println("personality engine")
    }

    else if (vessel.responseType == "Chirp") {
      println("Sound.chirpy")
    }

    else if (vessel.responseType == "Chime") {
      println("Sound.chimy")
    }

    else if (vessel.responseType == "Blip0") {
      println("Sound.Blippy0")
    }

    else if (vessel.responseType == "Blip1") {
      println("Sound.Blippy1")
    }

    else if (vessel.responseType == "Blood") {
      println("Sound.Bloody")
    }

    else {
    println("sound.Errory")
    println("ERROR 3")
    println("RESPONSE TYPE NOT FOUND/DEFINED")
  }

}

   // NTS //

  // MED . Screen is on and unlocked or will prompt unlock

  //\\ NTS \\//

  // RUNTIME //
  fun Fly() {
    val request =
      "Placeholder for stt input"// do a .strip AND a .lower to that as well (for keyword only!)
    // hook = Resolve(request) //This is the real final intent
    val hook = Rkesolve(request) // this is for keyword

    val pallet = Launch(hook)

    /*%^65*/ println(pallet)

    Key(pallet) // Verification Checks

    Inter(pallet) // Sound Checks

// if key and inter both pass, then run the action Deploy()

// for debug mode have key and inter run a series of prints for their values


    // here will be function to execute the action. AFTER verifying all verification is 100% valid.


//  if Fleet[hook].authLevel == "MAX"
//  require screen on unlocked and biometrics and pin and final confirmation.

    // elif == "NONE"

    /*
  MAKE SOME BEEP WHEN REQUIRING CONFIRMATION RECOGNISABLE
  */
  }