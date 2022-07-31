class Billete
{
  constructor(v, c)
  {
    this.valor = v;
    this.cantidad = c;
    this.imagen = new Image();
    this.imagen.src =
    imagen[this.valor];
  }
  mostrar()
  {
    document.body.appendChild(this.imagen);
  }
}

var dinero_disponible = 5000;
var imagen = []
imagen["100"]="billete100.jpg";
imagen["50"]="billete50.jpg";
imagen["20"]="billete20.png";
imagen["10"]="billete10.jpg";
imagen["5"]="billete5.jpg";

function entregarDinero()
{
  if ( operaciones == 0)
  {


  var t = document.getElementById('dinero');
  dinero = parseInt(t.value);
  for(var bi of caja)
  {
    if(dinero > 0);
    {
      div = Math.floor(dinero / bi.valor);

      if(div > bi.cantidad)
      {
        papeles = bi.cantidad;
      }
      else
      {
        papeles = div;
      }

      entregado.push( new Billete(bi.valor, papeles) );
      dinero = dinero - (bi.valor * papeles);
    }
  }
  if (dinero > 0)
  {
    resultado.innerHTML = "";
    resultado.innerHTML = "No hay plata";
  }
 else
   {
   for(var e of entregado)
   {
     if(e.cantidad > 0)
     {
       resultado.innerHTML = resultado.innerHTML + e.cantidad + " billetes de $" + e.valor + "<br />";
       operaciones = 1;
     }
   }
 }
 }
 else {
   {


     resultado.innerHTML = "";
   }
 }
}


function borrar()
{
 if(operaciones > 0)
 {
   document.getElementById('limpiar')
   resultado.innerHTML = "";
   desocupado =
 }
}


var caja = [];
var entregado = [];


caja.push(new Billete(100, 5,) );
caja.push(new Billete(50, 10,) );
caja.push(new Billete(20, 5,) );
caja.push(new Billete(10, 10,) );
caja.push(new Billete(5, 10,) );
var desocupado = ""
var dinero;
var div = 0;
var papeles= 0;
var operaciones = 0;
var resultado = document.getElementById('resultado');
var n = document.getElementById('limpiar');
var b = document.getElementById('extraer');
console.log(dinero_disponible)
b.addEventListener("click", entregarDinero);
n.addEventListener("click", borrar);
