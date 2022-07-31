var numeros = 100;
var divisible = false;
// Significa que: quiero que el valor inicial sea
// 1 y que ese ciclo se repita hasta que i sea igual
// o menor a 100//
for (var i = 1; i <= 100; i++)
{
  if (esDivisible(i, 3))
  {
    document.write("Fizz");
  }

  if(esDivisible(i, 5))
  {
    document.write("Buzz");
  }

  if(!esDivisible(i, 3) && !esDivisible(i, 5))
  {
  document.write(i);
  }
  document.write("<br />")
}

function esDivisible(num, divisor)
{
  if(num % divisor == 0)
  {
    return true;
  }
  else
  {
    return false;
  }
}
