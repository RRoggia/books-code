const countChar = function (word, letter) {
	let count = 0;
	for (let i = 0; i < word.length; i++) {
		if (word[i].toLowerCase() === letter.toLowerCase()) {
			count++
		}
	}
	return count
}

const countBs = function (word) {
	return countChar(word, "B")
}

console.log(countBs("BBC"))
console.log(countChar("BBC", "c"))
console.log(countChar("BBC", "d"))