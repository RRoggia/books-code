import enum

print('''
  Thriple quotation marks
  lines
  are kept
''')

CONSTANT= "CONSTANSTS CAN BE CHANGED, BUT UPPERCASE SUGGESTS IT IS A CONSTANT"

# docstring
def add(x,y):
  'Adds X and Y'
  return x+y

#help(add)

print(add( 10,20))

for _ in range(10):
  print("ola")

class TrafficLight(enum.Enum):
  RED=1
  YELLOW=2
  GREEN=3

print(TrafficLight.GREEN)