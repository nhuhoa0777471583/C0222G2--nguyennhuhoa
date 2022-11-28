import './App.css';
import Header from "./component/Header";
import {Outlet} from "react-router-dom";

function App() {
    return (
        <div className="App">
            <div className='app-head'>
                <Header/>
            </div>
            <div className='app-body'>
                <Outlet/>
            </div>


        </div>

    );
}

export default App;
