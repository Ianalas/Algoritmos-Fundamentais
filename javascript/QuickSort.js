let n = prompt("Digite o tamanho do vetor: ");
const vetor = [];

for(let i = 0; i < n; i++){
  let num = prompt("Digite o valor da "+ i + "º pos.");
  num = parseInt(num)
  vetor.push(num)
}

for (let j = 0; j < n - 1; j++) { //Simulando a recursividade
  for (let i = 0; i < n - 1 - j; i++) {
    if (vetor[i] > vetor[i + 1]) {
      let aux = vetor[i];
      vetor[i] = vetor[i + 1];
      vetor[i + 1] = aux;
    }
  }
}
console.log(vetor)