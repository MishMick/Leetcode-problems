//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    var arr = [[1]];
    var result = addUp([], arr[0], numRows);
    if(numRows == 0) return [];
    else if(numRows == 1) return arr;
    else return addUp([[1]], arr[0], numRows);
};

var addUp = function(finalRes, arr,numRows) {
    numRows = numRows - 1;
    if(numRows>0){
    var oldRes = [];
    oldRes.push(arr[0]);
    if(arr.length > 1){
        for(i=1;i<arr.length;i++){
            oldRes.push(arr[i]+arr[i-1]);
        }
    }
    oldRes.push(arr[arr.length-1]);
    finalRes.push(oldRes);
        return addUp(finalRes,oldRes, numRows);
    }else{
        return finalRes;
    }
}

/*
* Runtime: 56 ms, faster than 53.45% of JavaScript online submissions for Pascal's Triangle.
* Memory Usage: 33.9 MB, less than 27.64% of JavaScript online submissions for Pascal's Triangle.
*/