# Desafio

Um recrutador atribui uma pontuação técnica para cada candidato em um processo seletivo. Você deve criar um programa que classifica os candidatos da maior para a menor pontuação e exibe seus nomes nessa ordem.

## Entrada

A entrada deve receber:

- Um número inteiro `N` representando o número de candidatos.
- Para cada candidato: o nome e a pontuação técnica (inteiro de 0 a 100), separados por vírgula.

## Saída

Deverá retornar os nomes dos candidatos, ordenados da maior para a menor pontuação, um por linha. Se dois candidatos tiverem a mesma pontuação, o nome deve aparecer em ordem alfabética.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table><thead>
  <tr>
    <th><b>Entrada</b></th>
    <th><b>Saída</b></th>
  </tr></thead>
<tbody>
  <tr>
    <td>3<br>Ana,85<br>Bruno,90<br>Clara,75</td>
    <td>Bruno<br>Ana<br>Clara</td>
  </tr>
  <tr>
    <td>2<br>Pedro,95<br>Julia,95</td>
    <td>Julia<br>Pedro</td>
  </tr>
  <tr>
    <td>1<br>Mario,60</td>
    <td>Mario</td>
  </tr>
</tbody>
</table>

**Atenção**: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.