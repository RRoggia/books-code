import string

print("\n---Tip 17---")
print("for i in range(len(seq))")
seq = ["a", "b", "c", "d", "e"]
for i in range(len(seq)):
  print(seq[i])

print("for i in seq")
for i in seq:
  print(i)

print("for i,sq in enumerate(seq)")
for i, sq in enumerate(seq):
  print(i, sq)

seq2 = ["A", "B", "C", "D", "E"]

# returns a tuple with the nth element of the each sequence
print("for item, item2 in zip(seq, seq2)")
for item, item2 in zip(seq, seq2):
  print(item, item2)

seq3 = [seq, seq2]

print("for items in zip(*seq3)")
for items in zip(*seq3):
  print(*items)

print("\n---Tip 19---")


def string_to_float(s):
  try:
    return float(s)
  except ValueError:
    return float('nan')


print(string_to_float('10.00'))
print(string_to_float('something'))

try:
  with open('demo.txt') as infile:
    for i in infile.readlines():
      print(i.split("\n")[0])
except Exception as error:
  print(error)

print("\n---Tip 20---")
print("\nset comprehension")
unique_letters = {
  c for c in "Mary had a little lamb" if c in string.ascii_letters}
print(unique_letters)

print("\ndict comprehension")
unique_letters = {pos + 1: c for pos,
                  c in enumerate("Mary had a little lamb") if c in string.ascii_letters}
print(unique_letters)

print("\n---Tip 21---")
a = 10 if len(unique_letters) > 30 else 20
print(a)

print("\n---Tip 22---")


def player_turn():
  print("player")


def machine_turn():
  print("machine")


def not_found():
  print("player not found")


options = {
  0: player_turn,
  1: machine_turn
}

for i in range(3):
  options.get(i, not_found)()

print("\n---Tip 23---")


def complexExpression(x):
  if x >= 10:
    x *= 2
  if x >= 100:
    x = 999
  return x


print([complexExpression(x) for x in [10, 300, 24, 50, 25]])

odd = []
even = []

for x in [10, 20, 23, 25, 610, 999]:
  (even if x % 2 == 0 else odd).append(x)

print(even, odd)

print("\n---Tip 24---")
phrase = "Mary had a little lamb"

# all from 0 to len(phrase)-1, every 2 index (0,2,4,6,...)
print(phrase[::2])
# all from 1 to len(phrase)-1, every 2 index (1,3,5,7,...)
print(phrase[1::2])
# reverse
print(phrase[::-1])

print(''.join([x + y for x, y in zip(phrase[::2], phrase[1::2])]))

print("\n---Tip 25---")
data = {1, 1, 1, 1, 2, 3}
mean = sum(data) / len(data)

print("\n---Tip 26---")
SIZE = 3
field = [[''] * SIZE for _ in range(SIZE)]
field[0][0] = 'x'
field[1][0] = 'x'
field[2][0] = 'x'
win = any(row.count('x') == SIZE or row.count('o') == SIZE for row in field) or any(
  row.count('x') == SIZE or row.count('o') == SIZE for row in list(zip(*field)))
print(win)
