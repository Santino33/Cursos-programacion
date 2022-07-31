var teclas = {
   UP: 38,
   DOWN: 40,
   LEFT: 37,
   RIGHT:39
};

console.log(teclas);

document.addEventListener("keyup", dibujarTeclado);
var cuadrito = document.getElementById("area_de_dibujo");
var papel = cuadrito.getContext("2d");
var x = 100;
var y = 100;

dibujarLinea("red", x-1, y-1, x+1, y+1, papel);

function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal, lienzo)
{
  lienzo.beginPath();
  lienzo.strokeStyle = color;
  lienzo.lineWidth = 3;
  lienzo.moveTo(xinicial, yinicial);
  lienzo.lineTo(xfinal, yfinal);
  lienzo.stroke();
  lienzo.closePath();
}
function dibujarTeclado(evento)
{
  console.log("tecla oprimida");
  var colorcito = "blue"
  var movimiento = 10
  switch(evento.keyCode)
  {
    case teclas.DOWN:
     dibujarLinea(colorcito, x, y, x, y + movimiento, papel);
     y = y + movimiento;
    break;
    case teclas.UP:
    dibujarLinea(colorcito, x, y, x, y - movimiento, papel);
    y = y - movimiento;
    break;
    case teclas.LEFT:
    dibujarLinea(colorcito, x, y, x - movimiento, y, papel);
    x = x - movimiento;
    break;
    case teclas.RIGHT:
    dibujarLinea(colorcito, x, y, x + movimiento, y, papel);
    x = x + movimiento;
    break;
  }
}

var cantidad = aleatorio(2, 10);
function saludos(){
for (var l = 0; l < cantidad; l++)
  console.log("Hola, mi nombre es" );
  }

function perro(){
  cont
}
setTimeout(saludos, 4000);

function aleatorio(min, max){
  var resultado = Math.floor(Math.random()*(max - min + 1)) + min;
  return resultado;
}
function contador(){
	var contador = document.getElementById("contador");
	contador.value = cont;
	cont++;
}
setInterval('contador()',1000);
