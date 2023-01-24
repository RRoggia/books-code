print("\n---Tip 33---")

print(type([0]))
print(type({0}))
print(type((0))) # expects tupla but it's int
print(type((0,))) # add a comma and it works
tuple=0,
print(type(tuple))

print("\n---Tip 34---")
print(r'\n' + '\n' + r'\n', len('\v'), len(r'\v'))

print('\n' + r'\\.' + '\n') # mix raw and cooked string