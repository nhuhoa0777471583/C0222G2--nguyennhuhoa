const express = require('express');
let router = express.Router();
const APIController = require('../controller/restController')

const initAPIRoute = (app) => {
    router.get('/', APIController.displayListProduct);
    router.get('/:id', APIController.findById);
    router.post('/add', APIController.addProduct);
    router.put('/update/', APIController.updateProduct);
    router.delete('/delete/:id', APIController.deleteProduct);

    return app.use('/api', router)
}

module.exports = initAPIRoute;
