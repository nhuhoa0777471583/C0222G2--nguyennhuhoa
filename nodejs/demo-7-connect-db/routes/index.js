const express = require('express');
const router = express.Router();
const dbConnect = require('../database/connect')
const url = require('url');

/* GET home page. */
router.get('/', (req, res, next) => {
    dbConnect.query('select * from product where is_deleted = 0', (err, data) => {
        if (err) res.render('error', {message: err.message, status: '', error: err.message});
        res.render('index', {productList: data});
    });
})

router.get('/add', (req, res) => {
    res.render('add')
})
router.post('/add', (req, res) => {
    dbConnect.query(` insert into product (name, price, cost, address) value ( '${req.body.name}','${req.body.price}','${req.body.cost}','${req.body.address}')  `, (err, result) => {
        if (err) res.render('error', {message: err.message, status: '', error: err.message});
        // console.log(req.body)
        res.redirect('/')
    })
})

// xóa
router.get('/delete/:id', (req, res) => {
    dbConnect.query(
        `UPDATE product set is_deleted = 1 WHERE id = ${req.params.id} `, (err, result) => {
            if (err) throw err;
            res.redirect('/')
        }
    );
})
router.get('/edit/:id', (req, res) => {
    var data = dbConnect.query(`select * from product where id =${req.params.id}`, (err, result) => {
        if (err) res.render('error', {message: err.message, status: '', error: err.message});
        data = {
            id: result[0].id,
            name: result[0].name,
            price: result[0].price,
            cost: result[0].cost,
            address: result[0].address,

        }
        res.render('edit', {data})
    })
})

router.post('/update', (req, res) => {
    dbConnect.query(`UPDATE product SET name = '${req.body.name}', price= '${req.body.price}', cost = '${req.body.cost}', address = '${req.body.address}' where id =${req.body.id} `, (err, result) => {
        if (err) res.render('error', {message: err.message, status: '', error: err.message});
        res.redirect('/');
    })
})


router.get('/search', function (req, res) {
    var nameSearch = req.query.nameSearch;
    dbConnect.query(`select * from product`, (err, result) => {
        if (err) res.render('error', {message: err.message, status: '', error: err.message});
        var data = result.filter(function (item) {
            return item.name.indexOf(nameSearch) !== -1
        });
        console.log(nameSearch)
        res.render('index', {productList: data});
    })

})


module.exports = router;
