for (let i = 1; i <= 100; i++) {
	var result = ""
	if (i % 3 === 0) {
		result += "Fizz"
	}
	if (i % 5 === 0) {
		result += "Buzz"
	}
	console.log(result ? result : i)
	// console.log(result || i) // same as above 
}