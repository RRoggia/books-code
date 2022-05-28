def sortDescending( arrayToSort ):
  _arrayToSort = arrayToSort.copy()
  sortedArray = []

  for i in range(len( _arrayToSort )):
    higher = None

    for element in _arrayToSort:
      if higher == None:
        higher = element

      if element > higher:
        higher = element

    _arrayToSort.remove( higher )
    sortedArray.append( higher )

  return sortedArray

def sortDescending2( arrayToSort ):
  sortedArray = arrayToSort.copy()

  for i in range(len( sortedArray )):
    higherIndex = None

    for j in range(i, len(sortedArray)):
      element = sortedArray[ j ]
      if higherIndex == None:
        higherIndex = i

      if element > sortedArray[ higherIndex ]:
        higherIndex = j
    
    tmp = sortedArray[ i ]
    sortedArray[ i ] = sortedArray[ higherIndex ]
    sortedArray[ higherIndex ] = tmp
  
  return sortedArray

arrayToSort = [ 25, 92, 3 ,7 ,45, 11, 9 ]

assert sortDescending( arrayToSort ) == [ 92, 45, 25, 11, 9, 7, 3 ], 'Didn\'t sort correctly'
assert sortDescending2( arrayToSort ) == [ 92, 45, 25, 11, 9, 7, 3 ], 'Didn\'t sort correctly'
