def String checkArray(int[] intArray) {
	ArrayChecker checker = new ArrayChecker();

	if(checker.isSymetrical(intArray)) {
		return intArray.toString() + " -> isSymetrical(true)";
	} else {
		return intArray.toString() + " -> isSymetrical(false)" + ", reversed: " + checker.reverse(intArray).toString();
	}
}


println(checkArray((int[]) [1, 2, 3, 2, 1]));
println(checkArray((int[]) [7, 2, 4, 3, 1]));
println(checkArray((int[]) [2, 2, 4, 4, 2, 2]));
println(checkArray((int[]) [1, 2]));