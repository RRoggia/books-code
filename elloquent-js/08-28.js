// # Variaveis
let cincoAoQuadrado = 5 * 5
let nome = "renan"

let cincoNaQuartaPotencia = cincoAoQuadrado * cincoAoQuadrado
console.log(`5 ao cubo ${cincoNaQuartaPotencia}`)

// mudança de valor da variavél
cincoNaQuartaPotencia = 10
console.log(`5 ao cubo ${cincoNaQuartaPotencia}`)

let divida = 100
console.log(`divida é ${divida}`)
divida = divida - 35
console.log(`divida é ${divida}`)

let naoInicializado
console.log(naoInicializado)

const dez = 10
// dez = 11 // erro - não funciona

// # Funções
console.log("log - é uma função")
console.log(`Math.min(2,4) é uma função que retorna o menor valor recebido nos argumentos ${Math.min(2, 4)}`)

// # Controle de fluxo
let num = 2
if (num < 10) {
	console.log("passa aqui dentro se for verdade")
} else if (num < 100) {
	console.log("passa aqui dentro se for verdade e não tiver caido em outras clausulas")
} else {
	console.log("passa aqui dentro se for verdade e não tiver caido em outras clausulas")
}

let number = 0
while (number <= 12) {
	console.log(number)
	number += 2
}

let result = 1
let counter = 0
while (counter < 10) {
	result *= 2
	counter++
}
console.log(result)

let yourName
let times = 0
do {
	times++
	yourName = Math.random() < 0.15 ? "Renan" : ""
} while (!yourName);
console.log(times)
console.log(yourName)

if (true) {
	console.log("1 nivel de identação")
	if (true) {
		console.log("2 niveis de identação")
	}
}

for (let counter = 0; counter <= 12; counter += 2) {
	console.log(counter)
}

result = 0
for (let counter = 0; counter < 10; counter++) {
	result *= 2
}
console.log(result)

for (let current = 20; ; current += 1) {
	if (current % 2 == 0) {
		continue
	}
	if (current % 7 == 0) {
		console.log(current)
		break
	}
}

// syntax sugar
let someValue = 0
console.log(someValue)
someValue++
console.log(`++, ${someValue}`)
someValue--
console.log(`--, ${someValue}`)
someValue++
console.log(`++, ${someValue}`)
someValue += 1
console.log(`+=, ${someValue}`)
someValue -= 1
console.log(`-=, ${someValue}`)
someValue *= 2
console.log(`*=, ${someValue}`)
someValue /= 2
console.log(`/=, ${someValue}`)

// switch
let x = "e"
if (x == "a") {
} else if (x == "b") {
} else if (x == "c") {
} else {
}

switch (x) {
	case "a":
		break;
	case "b":
		break;
	case "c":
		break;
	default:
		break
}


// one liner comment
/*
 multi
 line
 coment
*/