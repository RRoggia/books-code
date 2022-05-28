def quicksort( items ):
  if len(items) < 2:
    return items
  
  higher = []
  lower = []
  pivot = items[0]
  
  for x in items[1:]:
    if x > pivot:
      higher.append(x)
    
    if x <= pivot:
      lower.append(x)
  
  return [ *quicksort(lower), pivot, *quicksort(higher) ]

print(quicksort( [3,5,2,1,4]))
print(quicksort( [3,5,2,1,4,101,2,33,1,1]))