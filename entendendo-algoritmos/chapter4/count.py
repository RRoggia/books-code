def count( list ):
  return 1 + count( list[1:] ) if list else 0

print( count( [ 10, 30, 501, 3321 ] ))