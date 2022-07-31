var vp = document.getElementById("villaplatzi")
var papel = vp.getContext("2d");

var fondo = {
  url:"villa.png",
  cargaOK: false
};
var cerdo = {
  url: "cerdo.png",
  cargaOK: false
};
var pollo = {
  url: "pollo.png",
  cargaOK: false
};
var vaca = {
  url: "vaca.png",
  cargaOK: false
};


fondo.objeto = new Image();
fondo.objeto.src = fondo.url;
fondo.objeto.addEventListener("load", cargarFondo);

vaca.objeto = new Image();
vaca.objeto.src = vaca.url;
vaca.objeto.addEventListener("load", cargarVaca);

cerdo.objeto = new Image();
cerdo.objeto.src = cerdo.url;
cerdo.objeto.addEventListener("load", cargarCerdo);

pollo.objeto = new Image();
pollo.objeto.src = pollo.url;
pollo.objeto.addEventListener("load", cargarPollo);


function cargarFondo()
{
 fondo.cargaOK = true;
 dibujar();
}

function cargarVaca()
{
 vaca.cargaOK = true;
 dibujar();
}
function cargarCerdo()
{
 cerdo.cargaOK = true;
  dibujar();
}
function cargarPollo()
{
  pollo.cargaOK = true;
  dibujar();
}

function dibujar()
{
  if(fondo.cargaOK)
  {
  papel.drawImage(fondo.objeto, 0, 0);
  }
  if(vaca.cargaOk);
  {
    var cantidad1 = aleatorio (3, 10);
    for (var v = 0; v < cantidad1; v++)
    {
    var x = aleatorio (0, 5);
    var y = aleatorio (0, 5);
    var x = x * 60;
    var y = y * 60;
    papel.drawImage(vaca.objeto, x, y);
  }
  }
  if(cerdo.cargaOK);
  {
    var cantidad2 = aleatorio (3, 10);
    for (var v = 0; v < cantidad2; v++)
    {
    var x = aleatorio (0, 5);
    var y = aleatorio (0, 5);
    var x = x * 60;
    var y = y * 60;
    papel.drawImage(cerdo.objeto, x, y);
  }
  }
  if(pollo.cargaOK);
  {
    var cantidad1 = aleatorio (3, 10);
    for (var v = 0; v < cantidad1; v++)
    {
    var x = aleatorio (0, 5);
    var y = aleatorio (0, 5);
    var x = x * 60;
    var y = y * 60;
    papel.drawImage(pollo.objeto, x, y);
  }
  }
}

function aleatorio(min, maxi)
{
  var resultado;
  resultado = Math.floor(Math.random() * (maxi - min + 1)) + min;
  return resultado;
}
