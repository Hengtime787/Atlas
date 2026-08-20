/*
Android Service runs battery efficient and reacts to wake word
Perks up and activates python
python does its thing and if needed sends shit to android serice like MEDIA_PAUSE 
Android srbice controlls media from that with deeper integration than python. S r vices thet need to so that are :
media playback + music playlist playing
music recognition
world clock
calendar

__÷<£>÷* Wake Tone, Error Tone, and OK Yone=&×[£>£8]
£<×>£>£>÷*÷*÷ Hooks Here _<÷>£>%*#(÷(£)

_$ = Possible look into. So is other._
< Placeholder to specifics aomwtimes lol >
btw pfx means itll have a custom thing like WCL_<>cusotm thing. WCL_ is the prefix, just to tell this app to do this thing snd use after the prefix for it. use case stuff for it too.
-------------- Media ---------------
MEDIA_PLAY 
MEDIA_PAUSE
MEDIA_NEXT
MEDIA_PREVIOUS
MEDIA_GET (now playing basically)

VOLUME_UP (Custom amount)
VOLUME_DOWN (Custom amount)

MUTE_ON
MUTE_OFF

# TO ADD INTEGRATION

------------ World Clock -------------
Special send required. WIP thinking working.
# Prefix only!
WCL_ pfx
# is the prefix. next is the country, like WCL_SINGAPORE. Take WCL_ slice it off take singapore.lower or something lowercase match with android on that. that's your job now.

--------------- Battery ---------------
BATTERY_LEVEL_STATUS_GET - ("Charging at 20% ") [ possibly add eta for battery ]
BATTERY_SAVER_ON $
BATTERY_SAVER_OFF $
BATTERY_SAVER_STATUS $

--------------- Power ---------------
POWER_OFF
LOCK
REBOOT
#You can't exactly power on when the phone is off...

----------- Device Control -----------

BLUETOOTH_OFF
BLUETOOTH_ON

WIFI_OFF
WIFI_ON

DATA_OFF
DATA_ON

DND_ON
DND_OFF # for do not disturb

BRIGHTNESS_UP (custom amount. ask how much by without)
BRIGHTNESS_DOWN (Same as before i meana above)
ADAPTIVE_BRIGHTNESS_ON
ADAPTIVE_BRIGHTNESS_OFF

---------- App Launching ---------

OPEN_<Appname> pfx

---------- Search ----------

SEARCH_ pfx # use ai integration for a search. #most likely use gemini flash 3.5 api

÷<£&÷<_%_#8×>$~7€|€●♡~¡{♤\€~}|■●♤~€£&£* Worry About This Last ×>£_£(÷:£<#&£\$□$●€~♡□♡$`€\}€8\€○€♡^%>÷,£&×[>=%7£<÷&)


*/

