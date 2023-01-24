// "use strict"

console.log("#Default Binding")
console.log("##this's call site is the global scope")
// function foo() {
//   console.log(this.a)
// }
// module.exports = a = 2
// foo()

console.log("##use strict don't allow access to the global scope ")
// function foo() {
//   "use strict";
//   console.log(this)
//   console.log(this.a)
// }
// module.exports = a = 2
// foo()

console.log("##if the call site has strict mode - it doesn't matter for the foo function")
// function foo() {
// 	console.log( this.a );
// }

// module.exports = a = 2;

// (function(){
// 	"use strict";

// 	foo(); // 2
// })();

console.log("#Implicit Binding")
// function foo(){
//   console.log(this.a)
// }

// var obj = {
//   a:2,
//   foo
// }

// obj.foo()

console.log("##Implicit Lost")
// function foo() {
//   console.log(this.a)
// }

// var obj = {
//   a: 2,
//   foo
// }

// var bar = obj.foo

// module.exports = a = "oops, global"

// bar()

console.log("### callback example")
// function foo() {
//   console.log(this.a)
// }

// function doFoo(fn) {
//   fn()
// }

// var obj = {
//   a: 2,
//   foo
// }

// module.exports = a = 2

// doFoo(obj.foo)

console.log("#Explicit Bind")
// function foo() {
//   console.log(this.a)
// }

// var obj = {
//   a:2
// }

// var bar = function() {
//   return foo.call(obj) // explicit bind
// }

// bar() //2
// setTimeout( bar, 100)//2
// bar.call({}) //2

console.log("## Pass through")
// function foo(arg) {
//   console.log(this.a)
//   return this.a + arg
// }

// var obj = {
//   a: 2
// }

// var bar = function (arg) {
//   return foo.call(obj, arg) // explicit bind
// }

// console.log(bar(3))
// console.log(bar.call({},3))
console.log("## Bind function")
// function foo(arg) {
//   console.log(this.a)
//   return this.a + arg
// }

// var obj = {
//   a: 2
// }
// function bind(fn, obj) {
//   return function(){
//     return fn.apply(obj, arguments) // Array-like object accessible inside function
//   }
// }

// var bar = bind(foo, obj)

// console.log(bar(3))
// console.log(bar.call({},3))
console.log("## Comes with es6")
// function foo(arg) {
//   console.log(this.a)
//   return this.a + arg
// }
// var obj = {
//   a: 2
// }

// var bar = foo.bind(obj)
// console.log(bar(3))

console.log("## built in hard binding")
// function foo(el) {
//   console.log(el, this.id);
// }

// var obj = {
//   id: "awesome"
// };

// [1, 2, 3].forEach(foo, obj); 

console.log("#new binding")
// function foo(a) {
//   this.a = a
// }

// var bar = new foo(2)
// console.log(bar.a)


console.log("#binding precedence")
console.log("##implicit vs explicit")
// function foo() {
//   console.log(this.a)
// }

// var objA ={
//   a:4,
//   foo
// }

// var objB ={
//   a:2,
//   foo
// }

// objA.foo()
// objB.foo()

// objA.foo.call(objB)
// objB.foo.call(objA)
// console.log("explicit wins")

console.log("##implicit vs new")
// function foo(something) {
//   this.a = something
// }

// var obj1 = {
//   foo
// }
// var obj2 = {}

// obj1.foo(2)
// console.log(obj1.a)

// obj1.foo.call(obj2, 4)
// console.log(obj1.a)
// console.log(obj2.a)

// var bar = new obj1.foo(6)
// console.log(bar.a)
// console.log(obj1.a)

console.log("##explicit vs new")
// function foo(something) {
//   this.a = something
// }
// var obj1 = {}
// var bar = foo.bind(obj1)
// bar(2)
// console.log(obj1.a)

// var baz = new bar(3)
// console.log(obj1.a)
// console.log(baz.a)


function foo2(a) {
  this.a = a
  this.getName = function () {
    return this.a
  }
}

const b = new foo2(2)
const obj = {
  a: 4
}

console.log(b.getName())
console.log(b.getName())

// function foo(p1,p2) {
// 	this.val = p1 + p2;
// }

// // using `null` here because we don't care about
// // the `this` hard-binding in this scenario, and
// // it will be overridden by the `new` call anyway!
// var bar = foo.bind( null, "p1", "p3" );

// var baz = new bar( "p2" );

// console.log(baz.val); // p1p2

