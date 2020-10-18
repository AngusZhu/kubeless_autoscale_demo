import random

def hello(event,context):
    for i in range(1,100):
      rand=i*random.randint(0,9)
      print(rand)
    print event
    return event['data']
