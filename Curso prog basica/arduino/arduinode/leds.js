var five = require("johnny-five");
var board = new five.Board();

board.on("ready", function(){
  var rojito = new five.Led(9);
  var verdesito = new five.Led(7);
  rojito.blink(50);
  verdesito.blink(1000);
  console.log("ya se hacer arduino");
});
