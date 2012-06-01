// 9.2

def containingNeg(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num < 0)
      exists = true
  exists
}

// This method can more precisely be defined by using higher order
// functions (functions that take other functions as arguments)

def containingNeg(nums: List[Int]) = nums.exists(_ < 0)

def containsOdd(nums: List[Int]): Boolean = {
  var exists = false
  for (num <- nums)
    if (num % 2 != 0)
      exists = true
  exists
}

// Again, using higher level functions we could rewrite this as:

def containsOdd(nums: List[Int]) = nums.exists( _ % 2 != 0)