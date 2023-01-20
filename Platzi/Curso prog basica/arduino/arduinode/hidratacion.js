var j = require("johnny-five");
var circuito = new j.Board();
var detector, señal;

circuito.on("ready", prender);
 function prender()
 {
  var configuracion = {pin: "A0", freq: 10};
  detector = new j.Sensor(configuracion);

  señal = new j.Led(10);
  detectar();
 }

 function detectar()
 {
   var humedad = detector.value;
   console.log("La humedad de la planta es: " + humedad);

   if (humedad < 400)
   {
     señal.blink(700);
   }
 }
