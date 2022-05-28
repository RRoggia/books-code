def soma( array ):
  if not array:
    return 0
  return array[0] + soma( array[1:] )

print( soma( [ 10, 30, 501, 3321 ] ))