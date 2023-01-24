// console.log("#Duplicating Objects")

// function anotherFunction() { }

// var anotherObject = {
//   c: true
// }

// var anotherArray = []

// var myObject = {
//   a: 2,
//   b: anotherObject,
//   c: anotherArray,
//   d: anotherFunction
// }

// anotherArray.push(anotherObject, myObject)

// var newObj = Object.assign({}, myObject)
// console.log(newObj.b === anotherObject)

// console.log(Object.getOwnPropertyDescriptor(myObject, "a"))

// var myObject = {}
// Object.defineProperty(myObject, "a", {
//   value: 2,
//   writable: true,
//   configurable: true,
//   enumerable: true
// })

// Object.defineProperty(myObject, "a", {
//   value: 2,
//   writable: false,
//   configurable: true,
//   enumerable: true
// })

// console.log("writeable won't allow to change value")
// myObject.a = 3
// console.log(myObject.a)

// console.log("configurable won't allow to change property descriptor neither to delete the property")

// Object.defineProperty(myObject, "a", {
//   value: 2,
//   writable: true,
//   configurable: false,
//   enumerable: true
// })

// console.log(myObject.a)				// 2
// delete myObject.a
// console.log(myObject.a) //didn't deleted the property

// console.log("enumerable won't show the property in a for...in")
// Object.defineProperty(myObject, "b", {
//   value: 10,
//   enumerable: false
// })
// for (i in myObject) {
//   console.log(i)
// }

// var myObject = {
//   get a() {
//     return 2
//   }
// }

// Object.defineProperty( myObject, "b", {
//   get: function(){
//     return this.a *2
//   },
//   enumerable: true
// })
// console.log(myObject.a, myObject.b)

// var myObject = {
//   get a() {
//     return this._a_
//   },
//   set a(val) {
//     this._a_ = val * 2
//   }
// }
// myObject.a = 10
// console.log(myObject.a)

// console.log("a" in myObject)
// console.log("b" in myObject)

// console.log(myObject.hasOwnProperty("a")) //don't consult the prototype chain
// console.log(myObject.hasOwnProperty("b")) //don't consult the prototype chain

// var myArray = [1,2,3]
// var it = myArray[Symbol.iterator]()
// console.log(it.next())
// console.log(it.next())
// console.log(it.next())
// console.log(it.next())

var myObject = {
	a: 2,
	b: 3
}

Object.defineProperty( myObject, Symbol.iterator, {
	enumerable: false,
	writable: false,
	configurable: true,
	value: function() {
		var o = this
		var idx = 0
		var ks = Object.keys( o )
		return {
			next: function() {
				return {
					value: o[ks[idx++]],
					done: (idx > ks.length)
				}
			}
		}
	}
} )

var it = myObject[Symbol.iterator]();
it.next()
it.next()
it.next()

for (var v of myObject) {
	console.log( v );
}
