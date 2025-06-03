# Desafio

Você deve criar um programa que receba uma lista de tarefas a serem feitas durante o dia. Cada tarefa possui um nome e uma prioridade (número inteiro). Ordene as tarefas pela prioridade crescente e imprima a lista organizada.

## Entrada

A entrada receberá um número N, representando a quantidade de tarefas, seguido de N linhas, cada uma contendo o nome da tarefa e a prioridade separados por vírgula.

- Um número inteiro N (quantidade de tarefas).
- N linhas contendo "nome da tarefa,prioridade".

## Saída

Deverá retornar a lista de tarefas ordenada pela prioridade em ordem crescente, uma por linha, no formato: `tarefa - prioridade`.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table><thead>
  <tr>
    <th><b>Entrada</b></th>
    <th><b>Saída</b></th>
  </tr></thead>
<tbody>
  <tr>
    <td>3<br>Estudar Java, 1<br>Estudar Java, 1<br>Pausa Cafe, 2</td>
    <td>Estudar Java - 1<br>Pausa Cafe - 2<br>Reuniao Tech - 3</td>
  </tr>
  <tr>
    <td>4<br>Enviar Emails, 2<br>Almoco, 3<br>Validar Codigos,1<br>Exercicios, 4</td>
    <td>Validar Codigos - 1<br>Enviar Emails - 2<br>Almoco - 3<br>Exercicios - 4</td>
  </tr>
  <tr>
    <td>2<br>Comprar Livros, 2<br>Ler, 1</td>
    <td>Ler - 1<br>Comprar Livros - 2</td>
  </tr>
</tbody>
</table>

**Atenção**: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

