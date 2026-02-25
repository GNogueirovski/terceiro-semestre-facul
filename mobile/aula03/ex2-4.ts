// A) Nome da empresa que será acessível por toda a aplicação
var nomeAplicacao : string = "FIAP";

// B) Variável usada apenas no módulo de pagamento para guardar o total de salários pagos no mês.
let totalSalariosMes : number = 0.0;

// C) Quantidade de dias de faturamento, normalmente esta informação será fixa e nunca mais alterada
const quantidadeDiasFaturamento : number = 30;

// D) Todas as notas de um aluno de uma disciplina
const quantidadeNotas : number[] = [];
quantidadeNotas [0] = 10.0;
quantidadeNotas [1] = 0;

const {nome, ...notas} = quantidadeNotas
console.log("notas aluno: ", ...notas);



// E) Todos os dados de um carro (placa, chassi, modelo, ano, cor, nome do dono) que foi multado.
interface Carro {
    placa: string;
    chassi : string;
    modelo : string;
    ano : number;
    cor : string;
    nomeDono? : string;
}
const carro : Carro = {placa: "XXX-1114", chassi: "2XK2E23O2KJ32", modelo: "Jetta", ano: 2025, cor: "prata"}

// F) O número de ouro da matemática valor 1.61803...
const numeroOuro : number = 1.61803;

// G) Os nomes dos alunos de uma turma com 10 alunos
const nomeAlunos : string[] = ["João", "Martha"]


// H) Quantidade de pares de tênis de um armário
let qtdParesTenis : number = 5;