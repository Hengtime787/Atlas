from sentence_transformers import SentenceTransformer

model = SentenceTransformer("sentence-transformers/all-MiniLM-L6-v2")

#embeddings = model.encode(sentences)

#similarities = model.similarity(embeddings, embeddings)
#print(similarities.shape)




from training_data import TRAINING_DATA





Model = {} 
# we gonna worry about that shit later.

for hook, examples in TRAINING_DATA.items():
  #tskin the examples
  print(hook)
  print(examples)
  Model[hook] = examples
  #theowin them into a data file
  with open("intent_model.py", "w") as file:
      file.write("MODEL = ")
      file.write(repr(Model)) #representation of model
  print("Training Model Complete")

    