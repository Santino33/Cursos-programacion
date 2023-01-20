var jugador = prompt("Cual escoges?: piedra, papel o tijera");

var opciones = ["piedra", "papel", "tijera"];
var cpu = opciones[Math.floor(Math.random() * 3)];

switch (true){
    case (jugador === cpu):
        console.log("empate");
        break;
    case (jugador = "papel" && cpu = "tijera"):
            console.log("La CPU gana");
        break;
    case (jugador = "tijera" && cpu = "piedra"):
            console.log("La CPU gana");
        break;
    case (jugador = "piedra" && cpu = "papel"):
        console.log("La CPU gana");
        break;
    case (jugador && cpu):
        console.log("empate");
        break;
    case (jugador && cpu):
        console.log("empate");
        break;
}
    
