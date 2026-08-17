############# Atlas #############


 #### To Do ####
 
 # Weather
 
 ######### WIP ##########
 #Time ans date __ need timezone shit
 ## Done ##
 
 
 ######## Notes ########
 # deeper integratiojs like playerctl but for android wre like 1000000 eprcent soable just not done because ibwould need bakcgpeujd whit thet i sucl at right now plus im working ont uskonay?
#### Placeholders are marked by lyrics from Linkin Park songs ####

# Get the fuck aboard!

from datetime import datetime
from zoneinfo import Zoneinfo
#My timezones database
from timezones import dean


# Take input make it lowercase

request = input(">").lower()
# input is terminal style now. STT has not been set up yet neither has TTS

# if checks. Catagories showing

  ####### Time / Date #######
if "time" in request or "date" in request or "day" in request:
  print("yay")
  
  if "singapore" in request:
    print("Oh feeling like it's chemical")
    #Tell time in Singapore
  elif "missoula" in request:
    print("All under my skin like it's medical.")
    #Tell time in Missoula
  elif "time" in request:
    print(datetime.now().strftime("%I:%M %p"))
    
    # Date (kinda twice? i think tjis is best way to do this?)
  elif "day" in request or "date" in request:
    
    if "today" in request or "date" in request:
      print(date.strftime("%B %d, %Y"))
    elif "day" in request:
      print(datetime.now().strftime("%A, %B %d, %Y"))
      
  
elif ""
      

else:
  print("Stuck on repititions that are only hypothetical.")
    #AI