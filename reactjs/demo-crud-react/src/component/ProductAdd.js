import Form from 'react-bootstrap/Form'
import Button from "react-bootstrap/Button";
import Container from "react-bootstrap/Container";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import { Link } from "react-router-dom";

const ProductAdd = () => {
    return (
        <Container style={{width: "70%"}}>
            <div>
                <h2>Add Product</h2>
            </div>
            <Form>
                <Form.Group className="mb-3" controlId="formGroup">
                    <Form.Label>Name</Form.Label>
                    <Form.Control type="text" placeholder="Enter name"/>
                </Form.Group>
                <Row className="mb-3">
                    <Form.Group as={Col} controlId="formGroup1">
                        <Form.Label>Cost</Form.Label>
                        <Form.Control type="text" placeholder="Enter cost"/>
                    </Form.Group>
                    <Form.Group as={Col} controlId="formGroup2">
                        <Form.Label>Price</Form.Label>
                        <Form.Control type="text" placeholder="Enter  price"/>
                    </Form.Group>
                </Row>
                <Row className="mb-3">
                    <Form.Group as={Col} className="mb-3" controlId="formGroup4">
                        <Form.Label>Origin</Form.Label>
                        <Form.Control type="text" placeholder="Enter origin"/>
                    </Form.Group>
                    <Form.Group as={Col} controlId="formGroup5">
                        <Form.Label>Category</Form.Label>
                        <Form.Select defaultValue="Choose...">
                            <option>Choose...</option>
                            <option>...</option>
                        </Form.Select>
                    </Form.Group>
                </Row>
                <Button style={{marginRight: '20px',}} variant="primary" type="submit">
                    Submit
                </Button>

                <Link to='/' className='btn btn-secondary' type="submit">
                    Back
                </Link>
            </Form>
        </Container>
    )
}
export default ProductAdd;
