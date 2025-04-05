NotePoints:

Difference b/w collection and Stream.
Ans: Whenever we need to represent a group of objects as single entity then we use Collection and when we need to perform operation like filtering on the collection then we use Stream.

Difference b/w Filter and Map:

1. Filter in Stream uses Predicate (true/false) value whereas Map uses Funtion to perform operation. 
2. Filter is used when we need to do operation on selected values from a collection whereas Map is used when we have to perfrom operation on each object of collection.

How Comparator works in Sorting of Any Collection:
  Comparator --> compare(obj1,ob2)
    returns -ve iff obj1 has to come before obj2.
    returns +ve iff obj1 has to come after obj2.
    returns 0 iff obj1 & obj2 are equal.
    
Note Point: if we want to make descending order then need to reverse the above condition that it only.

// Descending Order
Ex: (i1,i2) -> ( if(i1<i2) ? +1 : (i1>i2) ? -1:0)

// For String..
# Based on the Albhabetic Order
(s1,s2) -> s1.compareTo(s2) ===> Natural Sorting Order.
(s1,s2) -> s2.compareTo(s1) ===> Reverse of Natural Sorting Order.
(s1,s2) -> -s1.compareTo(s2) ===> Reverse of Natural Sorting Order.

# Based on the lenght of String
(s1,s2) -> {
  int l1 = s1.lenght();
  int l2 = s2.lenght();
  return ( l1<l2 ? -1: l1>l2 ? +1 : s1.compareTo(s2) );
}
