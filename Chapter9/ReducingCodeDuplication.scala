// Original FileMatcher Code.

object FileMatcher {

  private def filesHere = (new java.io.File(".")).listFiles

  // Find files ending in query
  def filesEnding(query: String) = {
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file
  }

  // Find files containing query
  def filesContaining(query: String) = {
    for (file <- filesHere; if file.getName.contains(query))
      yield file
  }

  // Find files by regex
  def filesRegex(query: String) = {
    for (file <- filesHere; if file.getName.matches(query))
      yield file
  }

}

// After refactoring

object FileMatcher {

  private def filesHere = (new java.io.File(".")).listFiles

  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  // Find files ending in query
  def filesEnding(query: String) = {
    filesMatching(query, _.endsWith(_))
  }

  // Find files containing query
  def filesContaining(query: String) = {
    filesMatching(query, _.contains(_))
  }

  // Find files by regex
  def filesRegex(query: String) = {
    filesMatching(query, _.matches(_))
  }
  
}