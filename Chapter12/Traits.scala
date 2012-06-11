// Scala uses traits as a way to encapsulate method and field definitions,
// which can be reused by mixing them into classes.

// A class can have any number of traits.

// Traits are declared just like a class but with the keyword, trait

// The superclass of Philosophical is AnyRef

trait Philosophical {

  def philosophize() {
    println("I consumer memory, therefore I am!")
  }

}

// Traits also define a type.

class Frog extends Philosophical {

}

//  phil, could be any class that has the Philosophical trait.

val phil: Philosophical = new Frog


// if you are using a class that will extend a superclass, you 
// can mix in the trait using the keyword 'with'

class Toad extends Frog with Philosophical {

  // overriding methods is the same as in classes
  override philosophize() {
    println("It ain't easy...")
  }
}


// By extending a trait with a class, you limit the classes
// that can mix in the trait.

trait Pouch extends Marsupial  {
  // The Pouch trait can only belong to the Marsupial class or other
  // classes that inherit from Marsupial.
}