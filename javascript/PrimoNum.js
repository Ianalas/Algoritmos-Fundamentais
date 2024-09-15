let cont = 0;

let n = prompt("Digite o número para verificar se é primo: ");
  if( n > 0){
    for(let i = 1; i <= n; i++){
      if(n % i == 0){
        cont = cont + 1;
      }
    }
  }
if(cont == 2){
  document.write(`O número ${n} é primo`);
}else{
  document.write(`O número ${n} NÃO é primo`);
}
