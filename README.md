1.reverse an array 
  The reverseArray function takes an array as a parameter.
  It initializes two pointers, start and end, at the beginning and end of the array, respectively.
  Inside a while loop, it swaps the elements at the start and end indices and then increments start and decrements end.
  This process continues until start is less than end. When start becomes greater than or equal to end, the array is reversed.
  After calling the reverseArray function, the array will be reversed in place. You can then print the reversed array using       
  Arrays.toString(array).


2.maxSubarray
changes
3.containsDuplicate:
  create hashset to assign each value a hash;
  then check for num in array nums{:
  if inset.conatins(num):
  return true;
  inset.add(num);
  }
  return false;
