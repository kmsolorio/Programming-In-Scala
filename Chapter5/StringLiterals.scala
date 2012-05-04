// String literals are wrapped in double quotes "", single quotes '' are
// used for Characters.
val string = "This is a string literal"

// Scala uses triple quotes, """, to wrap raw strings.  This syntax allows
// you to avoid using a lot of escape characters

val stringWithoutEscapes = """If this weren't using the raw stings.  I would have to escape the ' with an \"""
println(stringWithoutEscapes)