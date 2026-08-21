

#All fucking aboard
from intent_model import MODEL
# this file started out as chatgpt generated but it inly took the gia""nt thing i gave it and ripped itnintobthis list so i didnt have to maually copy. id call this not vibe coding but assisted coding ;)

COMMANDS = [
    "MEDIA_PLAY",
    "MEDIA_PAUSE",
    "MEDIA_NEXT",
    "MEDIA_PREVIOUS",
    "MEDIA_GET",

    "VOLUME_UP",
    "VOLUME_DOWN",
    
    "MUTE_ON",
    "MUTE_ON",
    "BATTERY_LEVEL_STATUS_GET",
# MAKE FAILSAFE
   # DSHUTDOEN",
  #  "LOCK",
  #  "REBOOT",

    "BLUETOOTH_ON",
    "BLUETOOTH_OFF",
    "WIFI_ON",
    "WIFI_OFF",
    "DATA_ON",
    "DATA_OFF",
    "DND_ON",
    "DND_OFF",

    "ADAPTIVE_BRIGHTNESS_ON",
    "ADAPTIVE_BRIGHTNESS_OFF",

    "OPEN",
    "WCL",
    "SEARCH",
] # REDO THIS SHIR INCE REQYIREMENTS.KT IS FINSIHED WS WELL AS TRAIFNING_DATA

# function for resolving or understanding what the fuck that senile human is saying.

def resolve(request):