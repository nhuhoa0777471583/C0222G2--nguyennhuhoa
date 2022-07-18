function fibonaci(index: number): number {

    if (index == 0) {
        return 0;
    }
    if (index == 1) {
        return 1;
    }
    return fibonaci(index - 1) + fibonaci(index - 2);
}

let num: number = 5;
let sum: number = 0;
for (let i = 0; i < num; i++) {
    sum+=fibonaci(i);
    console.log(fibonaci(i))
}
console.log("tổng dãy fibonaci là : "+sum)