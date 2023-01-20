var jugador;
var cpu;

if (jugador == "piedra" && cpu =="piedra")
{
   console.log("empate");
}
   else if
      (jugador == "papel" && cpu == "papel")
      {
         console.log("empate")
      }
   else if
      (jugador == "tijera" && cpu == "tijera")
      {
         console.log("empate")
      }
   else if
      (jugador == "tijeras" && cpu == "papel")
      {
         console.log("ganaste")
      }
   else if
      (jugador == "piedra" && cpu == "tijeras")
      {
         console.log("ganaste")
      }
   else if
      (jugador == "papel" && cpu == "piedra")
      {
         console.log("ganaste")
      }
   else if
      (jugador == "tijeras" && cpu == "papel")
      {
         console.log("ganaste")
      }
      else if
      (jugador == "tijeras" && cpu == "piedra")
      {
         console.log("perdiste")
      }
      else if
      (jugador == "piedra" && cpu == "papel")
      {
         console.log("perdiste")
      }
      else if
      (jugador == "papel" && cpu == "tijeras")
      {
         console.log("perdiste")
      }
   
