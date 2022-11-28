// var mysql = require('mysql');
const mysql = require('mysql2')
var con = mysql.createConnection({
    host: "127.0.0.1",
    user: "root",
    password: "nhuhoa2303",
    database: "demo_nodejs"
});

con.connect(function(err) {
    if (err) throw err;
    console.log("Connected!");
    var sql = "INSERT INTO product (name, price, cost, origin) VALUES " +
        " ('Kẹo mikita', 10000, 50, 'Viet Nam')," +
        "('Strongbow', 20000, 50, 'Trung Quoc')," +
        "('Xúc xích', 10000, 50, 'Viet Nam')," +
        "('Bánh cosi', 50000, 50, 'Viet Nam')";
    con.query(sql, function (err, result) {
        if (err) throw err;
        console.log("1 record inserted");
    });
});
module.exports = con;
