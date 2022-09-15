// function wrapValue(n) {
// 	let local = n;
// 	const fn = function () {
// 		console.log()
// 		return local
// 	}
// 	return fn
// }

// let wrap1 = wrapValue(1);
// let wrap2 = wrapValue(2);

// console.log(wrap1());
// console.log(wrap2());

// function multiplyBy(x) {
// 	return function (y) {
// 		return x * y
// 	}
// }

// const multiplyBy5 = multiplyBy(5)
// const multiplyBy10 = multiplyBy(10)
// const multiplyBy15 = multiplyBy(15)

// console.log(multiplyBy5(10))
// console.log(multiplyBy10(10))
// console.log(multiplyBy15(10))

// function power(base, exponent) {
// 	if (exponent == 0) {
// 		return 1;
// 	} else {
// 		return base * power(base, exponent - 1);
// 	}
// }
// function power2 (base, exponent) {
// 	let result = 1
// 	for (let i = exponent; i > 0; i--) {
// 		result *= base
// 	}
// 	return result
// }

// console.log("a", power2(10,2 ))
// console.log("a", power(10, 2))


