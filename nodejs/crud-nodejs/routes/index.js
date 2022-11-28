const express = require('express');
const router = express.Router();
const dbConnect = require('../database/connect');
/* GET home page. */
router.get('/', function (req, res, next) {
    dbConnect.query('select * from product', function (err, data) {
        if (err) throw  err;
        res.render('index.ejs', {data: data})
        console.log(data[0]);
    })
    res.render('index.ejs', {title: 'Sản phẩm'});
});
// /* GET home page. */
// router.get('/add', function (req, res, next) {
//     res.render('add.ejs', {title: 'Thêm'});
// });
//
// /* GET home page. */
// router.get('/edit', function (req, res, next) {
//     res.render('edit.ejs', {title: 'Xóa'});
// });

module.exports = router;
