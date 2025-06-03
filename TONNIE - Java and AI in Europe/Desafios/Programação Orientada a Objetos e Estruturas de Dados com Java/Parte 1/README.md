# Desafio

Em um processo seletivo, o RH precisa buscar rapidamente os candidatos que possuem uma determinada habilidade. Você deve criar um programa que filtre os candidatos cadastrados com base em uma palavra-chave da habilidade.

## Entrada

A entrada deve receber:

- Uma primeira linha contendo dois valores separados por vírgula:
    - Um número inteiro `N` representando a quantidade de candidatos cadastrados.
    - Uma string representando a **habilidade buscada**.
- As próximas `N` linhas conterão os dados dos candidatos no seguinte formato:
    `Nome-habilidade1,habilidade2,habilidade3...`

A habilidade buscada e todas as habilidades dos candidatos devem ser comparadas **ignorando maiúsculas e minúsculas**.

## Saída

Deverá retornar o nome de todos os candidatos que possuem a habilidade informada, um por linha, na ordem em que foram cadastrados.

Se nenhum candidato possuir a habilidade, exiba a mensagem: “`Nenhum candidato encontrado`”

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table><thead>
  <tr>
    <th><b>Entrada</b></th>
    <th><b>Saída</b></th>
  </tr></thead>
<tbody>
  <tr>
    <td>3,java<br>Ana-java,sql,git<br>Clara-python,css,html<br>Felipe-java,spring,git</td>
    <td>Ana<br>Felipe</td>
  </tr>
  <tr>
    <td>2,excel<br>Bruno-excel,powerpoint<br>Ana-excel,word</td>
    <td>Bruno<br>Ana</td>
  </tr>
  <tr>
    <td>1,python<br>Pedro-java,html,css</td>
    <td>Nenhum candidato encontrado</td>
  </tr>
</tbody>
</table>

**Atenção**: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

