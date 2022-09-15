const isEven = function (n) {
	if (n < 0) {
		return n
	}
	if (n === 0 || n === 1) {
		return !n ? true : false
	}
	return isEven(n - 2)
}

console.log(isEven(50))
console.log(isEven(75))
console.log(isEven(-1))