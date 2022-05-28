from math import log

def binary_search( list, element ):
  half_position = int( (len(list) - 1) / 2 )
  half = list[ half_position ]

  if half == element:
    return half
  else:
    if len( list ) == 1:
      return None
    if half < element:
      return binary_search( list[ half_position + 1 : len(list) ], element )
    else:
      return binary_search( list[0 : half_position ], element )

assert binary_search( [1,2,3,4,5, 6], 999 ) == None, 'found None'
assert binary_search( [1,2,3,4,5, 6], 2 ) == 2, 'found 1 even'
assert binary_search( [1,2,3,4,5, 6, 7 ], 7 ) == 7, 'found 7 odd'

assert binary_search( [1,2,3,4,5, 3040, 10000, 10002,10005,10000123,231312331231 ], 10002 ) == 10002, 'found 7 odd'
assert binary_search( [1,2,3,4,5, 3040, 10000, 10002,10005,10000123,231312331231 ], 1 ) == 1, 'found 7 odd'
