let n = prompt("Número de termos:");
let a = 0;
let b = 1;
let i = 2;
let c;

if (n == 1) {
  document.write(a);
} else {
  document.write(a + ", " + b);
}
while (i < n) {
  i = i + 1;
  c = a + b;
  document.write(", " + c);
  a = b;
  b = c;
}