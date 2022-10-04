const express = require('express');
const router = express.Router();
const url = require('url');
var product = [
    {id: 1, name: 'cake', price: "25000", origin: 'VN'},
    {id: 2, name: 'beer', price: "30000", origin: 'TQ'},
    {id: 3, name: 'milk', price: "5000", origin: 'VN'}
];
// hien thi
router.get('/', function (req, res, result) {
    req.setEncoding('utf-8');
    res.render('index.ejs', {
        product: product,
    });
});
//chuyen qua trang add
router.get('/add', function (req, res) {
    res.render('add.ejs')
})

// them moi
router.post('/add', function (req, res) {
    var arrayProduct = req.body;
    product.push(arrayProduct)
    console.log(product)
    req.setEncoding('utf-8');
    res.redirect('/')
})

//xoa

router.get('/delete/:id', function (req, res,) {
    var pathFile = url.parse(req.url, true)
    var id = (pathFile.path);
    var idDelete = id.substring(8)
    console.log(idDelete)
    for (let i = 0; i < product.length; i++) {
        if (product[i].id == idDelete) {
            product.splice(i, 1)
            return res.redirect('/');
        }
    }
})


router.get('/edit/:id', function (req, res, result) {
    const pathFile = url.parse(req.url, true);
    const id = (pathFile.path);
    const idEdit = id.substring(6);
    console.log(idEdit)
    for (let i = 0; i < product.length; i++) {
        if (product[i].id == idEdit) {
            var productEdit = product[i];
        }
    }
    console.log(productEdit)
    res.render('edit.ejs', {productEdit})
})

// update
router.post('/update', function (req, res) {
    const arrayProduct = req.body;
    console.log(arrayProduct);
    product.forEach((element, index) => {
        if (element.id == arrayProduct.id) {
            product[index] = arrayProduct;
        }
    })
    res.redirect('/')
})

module.exports = router;
