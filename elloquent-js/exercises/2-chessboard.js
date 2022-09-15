let size = 8
for (let row = 1; row <= size; row++) {
	rowImage = ""
	for (let column = 1; column <= size; column++) {
		if ((column + row) % 2 === 0) {
			rowImage += " "
		} else {
			rowImage += "#"
		}
	}
	console.log(rowImage)
}