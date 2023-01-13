var frutas = ["manzana", "platano", "cereza", "fresa"];
console.log(frutas);

var masfrutas = frutas.push("sandia");
//.push sirve para agregar un elemento al array ubicandose en el ultimo lugar//
var quitar = frutas.pop("sandia");

var nuevaLongitud = frutas.unshift("sandia");
//.unshift sirve para agregar un elemento al array ubicandose en el 1 lugar del array//

var posicion = frutas.indexOf("cereza");
//Ayuda a encontrar la posicion en la que se encuentra una variable dentro de un array//

var manzana = frutas.shift("manzana");