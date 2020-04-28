//#include <algorithm>
//#include <iostream>
//
//void selectionSort(long array[], int length, int count[]) {
//	// Step through each element of the array
//	for (int startIndex = 0; startIndex < length; ++startIndex) {
//		// smallestIndex is the index of the smallest element we've encountered so far.
//		int smallestIndex = startIndex;
//
//		// Look for smallest element remaining in the array (starting at startIndex+1)
//		for (int currentIndex = startIndex + 1; currentIndex < length;
//				++currentIndex) {
//			// If the current element is smaller than our previously found smallest
//			if (array[currentIndex] < array[smallestIndex]) {
//				// This is the new smallest number for this iteration
//				smallestIndex = currentIndex; count[0]++;
//			}
//		}
//
//		// Swap our start element with our smallest element
//		std::swap(array[startIndex], array[smallestIndex]);
//	}
//
//}
//
//int main() {
//	const int length = 5;
//	long array[length] = { 1, 1, 0, 1, 0 };
//	int s[1]; s[0]=0;
//	selectionSort(array, length, s);
//	std::cout << s[0] << std::endl;
//
//	// Now print our sorted array as proof it works
//	for (int index = 0; index < length; ++index)
//		std::cout << array[index] << ' ';
//
//	return 0;
//}
