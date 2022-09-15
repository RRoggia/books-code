function findSolution(target) {
	function find(current, history) {
		if (current == target) {
			return history;
		} else if (current > target) {
			return null
		} else {
			return find(current + 5, `(${history} + 5)`) ||
				find(current * 3, `(${history} * 3)`)
		}
	}
	return find(1, "1")
}

console.log(findSolution(24));

function zeroPadding(word, number=3) {
	let result = String(word)
	while (result.length < number) {
		result = "0" + result
	}
	return result
}

function printFarmInventory(cows, chickens, boi) {
	console.log(`${zeroPadding(cows)} Cows`);
	console.log(`${zeroPadding(chickens)} Chickens`);
	console.log(`${zeroPadding(boi, 10)} Boi`);
}
printFarmInventory(7, 11, 20);