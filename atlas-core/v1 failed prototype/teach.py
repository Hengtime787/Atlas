# all abord ### redone on 21 aug sgtime
from sentence_transformers import SentenceTransformer # need pip install as well for this to work
from training_data import TRAINING_DATA

model = SentenceTransformer("sentence-transformers/all-MiniLM-L6-v2") # FUCKING LOCKED AND LOADED

ENC = {}
#adds to it in the loop
for hook, examples in TRAINING_DATA.items():#encex stands for encoded examples
  encex = model.encode(examples)
  encex = encex.tolist()
  ENC[hook] = encex
with open("intent_model.py", "w") as file:
  file.write(repr(ENC))

  






