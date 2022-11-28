let arr = [4,3,5,1,6,33,11,2];
arr.sort(function ( a, b) {
return b - a;
})
let a = "";
for (let i = 0; i < arr.length; i++) {
    a += arr[i] + " ";
}
console.log(a)

