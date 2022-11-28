import React from 'react';
import ReactDOM from 'react-dom';

let classforh1 = 'h1tag';

function Hello(props) {
    return <h1 className={classforh1}>{props.msg}</h1>;
}
const Hello_comp = <Hello msg="Hello, from Guru99 Tutorials!" />;
export default Hello_comp;
