// let launchMissiles = function () {
// 	missileSystem.launch("now");
// }
// if (safeMode) {
// 	launchMissiles = function () {/* do nothing */ }
// }

// Declaration notation
function revString(word) {
	console.log(word)
}

// Arrow functions
// const revString = () => {
// }

// // no params no return
// () => {
// 	console.log("vini")
// }

// // no params with return
// () => {
// 	return true
// }
// () => true;

// // one param
// (elemento) => { console.log(elemento) }
// elemento => { console.log(elemento) }

// (elemento) => elemento
// elemento => elemento;

// (elemento) => {
// 	return elemento
// }
// elemento => {
// 	return elemento
// }

// // more than 1 param
// (elemento1, elemento2) => {
// 	console.log(elemento1, elemento2)
// }
// (elemento1, elemento2) => elemento;

// (elemento1, elemento2) => {
// 	return elemento
// }

// const revString = () => {
// 	console.log(word)
// }
// revString("renan")

// The call stack
function greet(who) {
  console.log("Hello " + who);
}
greet("Harry");
console.log("Bye");

function chicken() {
	return egg();
}
let egg = function () {
	return chicken();
}
console.log(chicken() + " came first.");

// Optional Arguments

function revString(word = "padrao") {
	console.log(word)
}
revString()
revString("renan", 2)

function minus(a, b) {
  if (b === undefined) return -a;
  else return a - b;
}
console.log(minus(10))
console.log(minus(10,20))
console.log("a", "b", "c")

// Closure

// Recursion

// Growing functions

// Functions and side effects
