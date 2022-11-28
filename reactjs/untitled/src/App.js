
import { Routes, Route, Link } from 'react-router-dom';

import './App.css';
import HomePage from './component/Home'
import NewPage from './component/New'
import ContractPage from './component/Contract'
import New from "./component/New";

function App() {
    return (

        <div className="App">
            <nav className="navbar navbar-expand-lg navbar-light bg-light">
                <div className="container-fluid">
                    <div className="collapse navbar-collapse" id="navbarNav">
                        <ul className="navbar-nav">
                            <li className="nav-item">
                                <Link className="nav-link active" aria-current="page" href="/">Home</Link>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="/new">New</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="/contract">Contract</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

           <Routes>
               <Route path="/" element={<HomePage />}/>
               <Route path="/new" element={<NewPage />}/>
               <Route path="/contract" element={<ContractPage />}/>
           </Routes>
        </div>
    );
}

export default App;
