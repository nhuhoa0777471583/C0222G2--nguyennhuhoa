"use strict";
function fibonaci(index) {
    if (index == 0) {
        return 0;
    }
    if (index == 1) {
        return 1;
    }
    return fibonaci(index - 1) + fibonaci(index - 2);
}
var num = 5;
var sum = 0;
for (var i = 0; i < num; i++) {
    sum += fibonaci(i);
    console.log(fibonaci(i));
}
console.log("tổng dãy fibonaci là : " + sum);
