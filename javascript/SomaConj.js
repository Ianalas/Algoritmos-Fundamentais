let n = Number(prompt("Quantidade de números:"));
let numero;
let soma = 0;

for (let index = 0; index < n; index++) {
  numero = parseInt(prompt("Número:"));
  soma += numero;
}
document.write("Soma = " + soma);