import React, { useCallback } from 'react';
import './Login.css'
import { ApiPathBase } from '../../configuration.json'
import logo from './Logo.jpg';
import {
    BrowserRouter as Router,
    Link,
    Route,
    withRouter,
    useHistory
} from "react-router-dom";
import Main from '../Main/Main'

export default function Login(props) {
    var usuario = ""
    var clave = ""
    function onChangeUsuario(e) {
        usuario = e.target.value
    }

    function onChangeClave(e) {
        clave = e.target.value
    }
    async function validarUsuario() {
        const data = await fetch(`${ApiPathBase}/Ventas/Usuario/Valida/${usuario},${clave}`)
        const dataJSON = await data.json()
        console.log(dataJSON);

        if (dataJSON.length > 0) {
            window.location.replace("http://localhost:3000/Main");
        } else {
            alert('Usuario no válido')
        }
    }

    return <div>
        <Router>
            <Route exact path="/" render={() => {
                return <div className="contenedor card-cantainer">
                    <div className="card">
                        <img src={logo} className="img-card-login">
                        </img>
                        <div className="form-login">
                            <div className="title">Acceso</div>
                            <input type="text" placeholder="Usuario" className="input-form" onChange={onChangeUsuario}></input>
                            <input type="password" placeholder="Clave" className="input-form" onChange={onChangeClave}></input>
                            <input type="button" value="Ingresar" onClick={validarUsuario} className="button-form"></input>
                        </div>
                    </div>
                </div>
            }}>
            </Route>
            <Route path="/main" component={Main}></Route>
        </Router>
    </div>
}


