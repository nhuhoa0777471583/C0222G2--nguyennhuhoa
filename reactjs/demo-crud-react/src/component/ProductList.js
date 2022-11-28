import React, {useEffect, useState} from "react";
import Table from 'react-bootstrap/Table';
import Container from "react-bootstrap/Container";
import {Link} from "react-router-dom";
import axios from "axios";

const ProductList = () => {
    const state = {
        name: ''
    }
    const [data, setData] = useState([]);
    const loadData = async () => {
        const response = await axios.get("http://localhost:2000/");
        setData(response.data);
        console.log(response.data)
    }
    useEffect(() => {
        loadData();
    }, []);

    return (
        <div className='home'>
            <Container>
                <div style={{paddingBottom: '20px'}}>
                    <Link to='/add' className='btn btn-success' type='submit'>ADD (+)</Link>
                </div>
                <Table striped bordered hover className='text-center'>
                    <thead>
                    <tr>
                        <th>No.</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Cost</th>
                        <th>Address</th>
                        <th>Category</th>
                        <th colSpan={2}>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    {data.map((item, index) => {
                        return (
                            <tr key={item.id}>
                                <td>{index + 1}</td>
                                <td>{item.name}</td>
                                <td>10000</td>
                                <td>200</td>
                                <td>TQ</td>
                                <td>Bánh</td>
                                <td>
                                    <button type="button" className="btn btn-danger" data-bs-toggle="modal"
                                            data-bs-target="#exampleModal">
                                        Delete
                                    </button>
                                </td>
                                <td><Link to='/edit' className='btn btn-success'>Edit</Link></td>
                            </tr>
                        )
                    })}
                    </tbody>
                </Table>
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
                     aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-body">
                                ...
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                <button type="button" class="btn btn-success">Save</button>
                            </div>
                        </div>
                    </div>
                </div>
            </Container>
        </div>

    )
}
export default ProductList;
