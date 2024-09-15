let n = prompt("Número de notas");
n = Number(n);
let nota;
let contagem = 0;

for (let i = 0; i < n; i++) {
  nota = prompt("Nota do aluno:");
  if (nota >= 50) {
    contagem++;
  }
}
document.write("Número de aprovações: "+ contagem);