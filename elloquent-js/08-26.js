console.log("Tipo Numérico")
console.log(13)
console.log(13.0)
console.log(13 + 10)
console.log(13 - 10)
console.log(13 * 10)
console.log(13 / 10)
console.log(13 % 10)

console.log("Tipo - String")
console.log("ola mundo")
console.log("ola 'mundo'")
console.log('ola \"mundo\"') // escapamento
console.log('ola mundo')
console.log(`ola mundo`)
let nome = "renan"
console.log(`ola, ${nome} ! Seja bem vindo`) //<- usar essa forma pra concatenação
console.log("ola, " + nome + " ! Seja bem vindo")

console.log("Tipo - Booleano")
console.log(true)
console.log(false)

console.log("Unary Operators")
console.log(typeof "x")
console.log(typeof 10)
console.log(typeof [])
console.log(typeof Infinity)

console.log("Binary Operators")
console.log(3 > 2)
console.log(2 <= 2)
console.log(1 == 1) // só valor
console.log(1 == "1") // só valor - true
console.log(1 === "1") // só valor - false
console.log(1 === 1) // valor e tipo
console.log(1 !== 1)

console.log(false || false || true) // ou - só precisa de 1 true
console.log(true && true && true) // and - precisa de todos true

console.log("Short Circuiting")
count = 0
function retornTrue() {
	count++
	return true
}
function retornFalse() {
	count++
	return false
}

console.log(retornFalse() || retornTrue() || retornFalse())
console.log(count)

count = 0
console.log(retornFalse() && retornTrue() && retornTrue())
console.log(count)

console.log("Terciary Operators")
console.log(3 > 2 ? 3 : 2)

console.log(typeof null)
console.log(typeof undefined)

let name
if (!name) {
	name = "vinicius"
}
