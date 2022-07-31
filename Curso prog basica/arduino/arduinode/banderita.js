var j = require("johnny-five");
var circuito = new j.Board();
var ledsito, motorcito, celda;
var turno = 0

circuito.on("ready", prender);

function prender()
{
  var configuracion = {pin: "A0", freq: 50};
  celda = new j.Sensor(configuracion);

  ledsito = new j.Led(13);
  ledsito.on();

  motorcito = new j.Servo(9);
  motorcito.to(100);
  ondear();
}

function  ondear()
{
  console.log("Luz :" + celda.value);
  var luz = celda.value;

  if (luz > 400)
  {
    if(turno)
    {
    turno = 0
    motorcito.to(170);
    }
    else
    {
      turno = 1;
      motorcito.to(190);
    }
  }
  else
  {
    motorcito.to(90);
  }
  setTimeout(ondear, 1000);
}
