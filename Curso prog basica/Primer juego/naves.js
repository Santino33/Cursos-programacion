var micanvas = document.getElementById('aliens');
var papel = micanvas.getContext("2d");

// Objetos del juego
var navecilla = {
  url: "navedefinitiva.png",
  cargaOK: false
  }
var marciano = {
  url: "marciano.png",
  cargaOK: false
}
// Controles de las teclas//
var controles = {
  LEFT: 65,
  RIGHT: 68
};

var bandera = 0
var cantidadnaves = aleatorio(2, 5);
var marcianoX = new Array();
var marcianoY = new Array();
var navex = 180;
var navey = 360;

navecilla.imagen = new Image();
navecilla.imagen.src = navecilla.url;
navecilla.imagen.addEventListener("load", cargarnave);

marciano.imagen = new Image();
marciano.imagen.src = marciano.url;
marciano.imagen.addEventListener("load", cargarmarciano);

document.addEventListener("keydown", moverNave);
document.addEventListener("mouseup", disparo);
// Funciones para cargar imagenes//

function cargarnave(){
  navecilla.cargaOK = true;
  dibujar();
}
var cantidad = aleatorio(3, 6);

function cargarmarciano()
{
  marciano.cargaOK = true;
  dibujar();
  }


//Funciones para dibujar //

function dibujar()
{
  if (marciano.cargaOK && navecilla.cargaOK)
   {
     for (var h = 0; h < cantidad; h++ ){
       if (bandera == 0) {
         marcianoX[h] = aleatorio(0, 8) * 45;
         marcianoY[h] = 360;
       }
       papel.drawImage(marciano.imagen, marcianoX[h], 40);
       }
     if (bandera == 0){
       papel.drawImage(navecilla.imagen, navex, navey);
     }
     bandera = 1;
   }
  }
function moverNave(evento)
{
  var mov = 5
  switch(evento.keyCode)
  {
  case controles.RIGHT:
  papel.clearRect(0, 0, 400, 400);
  dibujar();
  navex =  navex + mov;
  papel.drawImage(navecilla.imagen, navex, navey);

  break;
  case controles.LEFT:
  papel.clearRect(0, 0, 400, 400);
  dibujar();
  navex = navex - mov;
  papel.drawImage(navecilla.imagen, navex, navey);
  break;
  default:
  break;
  }
}

setTimeout(disparar, 500);

disparar("red", navex, navey-30, navex, navey-360, papel)

function disparar(color, xinicial, yinicial, xfinal, yfinal, papel)
{
  papel.beginPath();
  papel.strokeStyle = color;
  papel.lineWidth = 5;
  papel.moveTo(xinicial, yinicial);
  papel.lineTo(xfinal, yfinal);
  papel.stroke();
  papel.closePath();
}

function disparo(evento)
{
  console.log("mouseup");
  var colorin ="red"
  if (evento.keyCode){
 disparar(colorin, navex, navey, navex, navey - 360, papel);
  }
}



function aleatorio(min, max){
  var resultado = Math.floor(Math.random()*(max - min + 1)) + min;
  return resultado;
}
