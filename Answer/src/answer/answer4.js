/**
 *
 * 
 * 因為這種內包funnction無法暫存數值，
 * 所以當要輸出時，都會輸出最後執行的數值，
 * 因為前面都數值都被覆蓋了
 * 
 */

function createArrayOfFunctions(y) {
	var arr = [];
	for (let i = 0; i < y; i++) {
		arr[i] = function(x) {
			return x + i;
		}
	}
	return arr;
}