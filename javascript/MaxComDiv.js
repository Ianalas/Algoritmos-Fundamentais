let a, b, div, maior;

a = prompt("Digite o 1º numerador: ");
b = prompt("Digite o 2º numerador: ");

if (a > b) {
  maior = a;
} else {
  maior = b;
}
for (let i = 1; i <= maior; i++) {
  if (a % i == 0 && b % i == 0) {
    div = i;
  }
}
document.write("O MDC é: " + div);
