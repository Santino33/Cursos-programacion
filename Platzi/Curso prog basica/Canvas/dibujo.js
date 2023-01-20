var texto = document.getElementById("texto_lineas");
var boton = document.getElementById("botoncito");
boton.addEventListener("click", dibujoPorClick);

var d = document.getElementById("dibujito");
var ancho = d.width;
var lienzo = d.getContext("2d");
document.write("Asi queda tu dibujo");


function dibujoPorClick()
{
  var xxx = parseInt(texto.value);
  var lineas = xxx;
  var l = 0;
  var yi, xf;
  var espacio = ancho / lineas;

  while(l < lineas)
  {
    yi = espacio * l;
    xf = espacio * (l + 1);
    dibujarLinea("#f4a261", 0, yi, xf, 499);
    console.log("linea" + 1);
    l++; //Significa lo mismo que l = l + 1//

  }
  dibujarLinea("#f4a261", 1, ancho - 1, 1, 1)
  dibujarLinea("#f4a261", 1, ancho - 1, ancho - 1, ancho - 1)
  function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal)
  {
    lienzo.beginPath();
    lienzo.strokeStyle = color;
    lienzo.moveTo(xinicial, yinicial);
    lienzo.lineTo(xfinal, yfinal);
    lienzo.stroke();
    lienzo.closePath();
  }
  for(l=0; l < lineas; l++)
  {
    yi = espacio * l;
    xf = espacio * (l + 1);
   dibujarLinea("#f4a261", xf, 0, ancho - 1, yi);
   console.log("linea" + 1);
  }
  console.log(texto);
}
