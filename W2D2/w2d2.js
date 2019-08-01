function reverseArray(accptedArray){
       var newArray = [];

    for (var i = accptedArray.length-1; i >= 0; i--){
      newArray.push(accptedArray[i])
    } 
    return newArray;
}
const input = [1,2,3];
const reveresed = reverseArray(input);
console.log("the input", input);
console.log("the reverse", reveresed);


function reverseArrayInPlace(accptedArray){
    return accptedArray.reverse();
}
const newInput = [4,5,6];
const reversedInplace = reverseArrayInPlace(newInput);
console.log("the input is also reversed", newInput);
console.log("the output is reversed", reversedInplace);

function deepEqual (obj1, obj2) {
	for (var p in obj1) {
		if (obj1.hasOwnProperty(p) !== obj2.hasOwnProperty(p)) return false;
 
		switch (typeof (obj1[p])) {
			case 'object':
				if (!deepEqual(obj1[p], obj2[p])) return false;
				break;
			case 'function':
				if (typeof (obj2[p]) == 'undefined' || (p != 'compare' && obj1[p].toString() != obj2[p].toString())) return false;
				break;
			default:
				if (obj1[p] != obj2[p]) return false;
		}
	}
 
	for (var p in obj2) {
		if (typeof (obj1[p]) == 'undefined') return false;
	}
	return true;
}

let obj = {here: {is: "an"}, object: 2};
console.log(deepEqual(obj, obj));
console.log(deepEqual(obj, {here: 1, object: 2}));
console.log(deepEqual(obj, {here: {is: "an"}, object: 2}));
