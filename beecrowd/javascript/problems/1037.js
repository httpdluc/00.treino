const valor = parseFloat(lines[0])

const verificar = (valor) => {
    if (valor >= 0 && valor <= 25){
        return "Intervalo [0,25]"
    }else if (valor > 25 && valor <= 50){
        return "Intervalo (25,50]"
    }else if (valor > 50 && valor <= 75){
        return "Intervalo (50,75]"
    }else if (valor > 75 && valor <= 100){
        return "Intervalo (75,100]"
    }else {
        return "Fora de intervalo"
    }

    
}
const res = verificar(valor)
    console.log(res)