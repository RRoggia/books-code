class Person {
  static hello( name: String) : String {
    return `Hello ${ name }`
  }
}

console.log( Person.hello( 'Renan' ) )
