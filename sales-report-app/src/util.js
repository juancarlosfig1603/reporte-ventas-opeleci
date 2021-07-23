
const ObtenerAnio = ()=> {
    var options = []
    var anio = (new Date().getFullYear())
    for (var i = 0; i < 3; i++) {
        let _anio = anio - i
        options.push({ value: _anio.toString(), label: _anio.toString() })
    }
    return options
}

export{ObtenerAnio}