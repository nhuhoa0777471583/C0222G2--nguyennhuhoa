const add = (function () {
    let count = 0;
    return function () {
        count += 1;
        return count
    }
})();

x = add();
console.log(x)
