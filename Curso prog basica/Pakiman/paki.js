var imagenes = [];
imagenes["Cauchin"] = "vaca.png";
imagenes["Pokacho"] = "pollo.png";
imagenes["Tocinauro"] = "cerdo.png";

class Pakiman
{
  constructor(nombre, v, a)
  {
    this.imagen = new Image()
    this.vida = v;
    this.ataque = a;
    this.nombre = nombre;
    this.tipo = "tierra";

    this.imagen.src =imagenes[this.nombre];
  }
  hablar()
  {
    alert(this.nombre);
  }
  mostrar()
  {
    document.body.appendChild(this.imagen);
    document.write("<h2>");
    document.write("<strong>" + this.nombre + "</strong> <br />");
    document.write("Vida: " + this.vida + "<br />");
    document.write("Ataque: " + this.ataque);
    document.write("</h2>");
  }
}

var coleccion = [];
coleccion.push(new Pakiman ("Cauchin", 100, 30));
coleccion.push(new Pakiman ("Pokacho", 80, 50));
coleccion.push(new Pakiman ("Tocinauro", 120, 40));

for(var gamora of coleccion)
{
  gamora.mostrar();
}

for(var x in coleccion[0])
console.log(x);
