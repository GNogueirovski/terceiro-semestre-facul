var __rest = (this && this.__rest) || function (s, e) {
    var t = {};
    for (var p in s) if (Object.prototype.hasOwnProperty.call(s, p) && e.indexOf(p) < 0)
        t[p] = s[p];
    if (s != null && typeof Object.getOwnPropertySymbols === "function")
        for (var i = 0, p = Object.getOwnPropertySymbols(s); i < p.length; i++) {
            if (e.indexOf(p[i]) < 0 && Object.prototype.propertyIsEnumerable.call(s, p[i]))
                t[p[i]] = s[p[i]];
        }
    return t;
};
var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
// A) Nome da empresa que será acessível por toda a aplicação
var nomeAplicacao = "FIAP";
// B) Variável usada apenas no módulo de pagamento para guardar o total de salários pagos no mês.
var totalSalariosMes = 0.0;
// C) Quantidade de dias de faturamento, normalmente esta informação será fixa e nunca mais alterada
var quantidadeDiasFaturamento = 30;
// D) Todas as notas de um aluno de uma disciplina
var quantidadeNotas = [];
quantidadeNotas[0] = 10.0;
quantidadeNotas[1] = 0;
var nome = quantidadeNotas.nome, notas = __rest(quantidadeNotas, ["nome"]);
console.log.apply(console, __spreadArray(["notas aluno: "], notas, false));
// E) Todos os dados de um carro (placa, chassi, modelo, ano, cor, nome do dono) que foi multado.
// F) O número de ouro da matemática valor 1.61803...
// G) Os nomes dos alunos de uma turma com 10 alunos
// H) Quantidade de pares de tênis de um armário
