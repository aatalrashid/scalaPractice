//

val xs = Array(1, 2, 3, 44)
xs map (x => x * 2)

val s = "Hello World"
s filter (c => c.isUpper)

s exists (c => c.isUpper)
s forall (c => c.isUpper)

val pairs = List(1, 2, 3, 5) zip s
pairs.unzip

s flatMap (c => List('.', c))

xs.sum
xs.product
xs.max


// Write an expression that give all pairs whose sun were prime numbers.
//number n is a number[Int]:
//Prime no. is one only divisable by 1 & itself: n


def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)

val n = 7

// --- Method 1 ----
// using the flatmap |map expressions:
(1 until n) flatMap ( i =>
  (1 until i) map (j => (i, j))) filter ( pair =>
  isPrime(pair._1 + pair._2)
  )


// ----Method 2 -------
//USing a for-expression:

for {
  i <- 1 until n
  j <- 1 until i
    if isPrime (i + j)
}
  yield (i, j)