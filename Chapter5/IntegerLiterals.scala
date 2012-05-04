// Int, Long, Short, and Byte come in three flavors:
// Decimal, Hexidecimal, and Octal

// If the number begins with a 0x or 0X it is hexidecimal

val hex = 0x5
println("Printing hex: " + hex)

val anotherHex = 0x9
println("Printing anotherHex: " + anotherHex)

// Hex may contain 0 - 9 and a - f

val hexWithLetters = 0xcda01def
println("Printing hexWithLetters: " + hexWithLetters)

// If the number begins with 0, it is octal based and can
// only contain numbers 0 - 7

val octal = 035
println("Printing octal: " + octal)

// If the number begins with a non-zero digit, and it is
// otherwise not decorated, it is a decimal

val decimal = 123
println("Printing decimal: " + decimal)

// If an integer literal ends with an L or l, it is a Long,
// otherwise it is an Int

val long = 123L
println("Printing Long: " + long)

// If an Int literal is assigned to a variable of type Short or Byte
// it is treated as a Short or Byte so long as it is a valid value.

val short: Short = 345
println("Printing Short: " + short)

val byte: Byte = 1
println("Printing Byte: " + byte)