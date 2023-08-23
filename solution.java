class Solution {

	public int[] solution(int[] arr, int k) {
		int[] newArr = new int[arr.length];

		if (arr.length == 0){
			return arr;
		}
		k = k%arr.length;
		
		for (int i=0; i<arr.length; i++) {
			newArr[i] = arr[(i + (arr.length - k)) % (arr.length)];
		}

		return newArr;
	}
}
