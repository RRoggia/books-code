// Functions
const square = function (x) {
	console.log(x)
	return x * x
}

console.log(square(2))

const makeNoise = function () {
	console.log("Pling!")
}

const power = function (base, expoent) {
	let result = 1
	for (let count = 0; count < expoent; count++) {
		result *= base
	}
	return result
}

console.log(power(5, 3))

// Scope
let x = 10
if (true) {
	let y = 20
	var z = 30
	console.log(x + y + z)
}

// console.log(x + y + z) // throws exception
console.log(x + z)

const halve = function (n) {
	return n / 2
}

let n = 10
console.log(halve(100))

console.log(n)

// escopo externo não pode acessar o escopo interno
// escopo interno tem acesso ao escopo externo
//escopo global
const hummus = function (factor) { // hummus
	const ingredient = function (amount, unit, name) { // ingredient
		let ingredientAmount = amount * factor;
		if (ingredientAmount > 1) {
			unit += "s";
		}
		console.log(`${ingredientAmount} ${unit} ${name}`);
	}

	ingredient(1, "can", "chickpeas");
	ingredient(0.25, "cup", "tahini");
	ingredient(0.25, "cup", "lemon juice");
	ingredient(1, "clove", "garlic");
	ingredient(2, "tablespoon", "olive oil");
	ingredient(0.5, "teaspoon", "cumin");
}

hummus(2)

