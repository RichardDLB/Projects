function calcular() {
    let nro1 = parseFloat(document.getElementById("nro1").value)
    let nro2 = parseFloat(document.getElementById("nro2").value)
    resultado = nro2 / (nro1 * nro1)
    resultadoConUnDecimal = resultado.toFixed(1);    

    document.getElementById("resultado").value = resultadoConUnDecimal

    if (resultado <= 18.5) {
        document.getElementById("resultado").value = innerText = "(Bajo peso) Su IMC es " + resultadoConUnDecimal + " lo que indica que su peso esta en la categoría de Bajo peso para adultos de su estatura. "
    }
    if (resultado >= 18.5 && resultado <= 24.5) {
        document.getElementById("resultado").value = innerText = "(Peso saludable) Su IMC es " + resultadoConUnDecimal + " lo que indica que su peso esta en la categoría de Peso saludable para adultos de su estatura."
    }
    if (resultado >= 25.0 && resultado <= 29.9) {
        document.getElementById("resultado").value = innerText = "(Sobre peso) Su IMC es " + resultadoConUnDecimal + " lo que indica que su peso esta en la categoría de Sobrepeso para adultos de su estatura."
    }
    if (resultado >= 30) {
        document.getElementById("resultado").value = innerText = "(Obesidad) Su IMC es " + resultadoConUnDecimal + " lo que indica que su peso esta en la categoría de Obeso para adultos de su estatura. Hable sobre su categoría de IMC con su proveedor de atención médica, ya que puede estar relacionado con su salud y bienestar general."
    }

    
}


