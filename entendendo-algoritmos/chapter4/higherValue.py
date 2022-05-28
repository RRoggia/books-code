def higherValue( values ):
  if( len(values) == 1 ):
    return values[0]

  higher = values[0] if values[0] > values[1] else values[1]
  return higherValue([ higher, *values[2:]])

print( higherValue( [ 10, 30, 501, 3321 ] ))
print( higherValue( [ 999999,10, 30, 3321,501,31,10,20,11,111 ] ))