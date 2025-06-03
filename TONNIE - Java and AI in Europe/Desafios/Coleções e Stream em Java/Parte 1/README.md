# Desafio

Você deve criar um programa que recebe uma lista de horários de reuniões agendadas durante o dia, cada uma representada por uma string no formato "`HH:mm`". Seu programa deve identificar e listar os horários únicos, ordenados do mais cedo ao mais tarde, ignorando horários repetidos.

Além disso, imprima quantos horários únicos foram informados.

## Entrada

A primeira linha contém um número N, representando a quantidade de horários. Nas próximas N linhas, cada linha contém um horário no formato "`HH:mm`".

- Um número inteiro N (quantidade de horários).
- N linhas contendo um horário no formato "`HH:mm`".

## Saída

Imprima os horários únicos ordenados, um por linha, e ao final uma linha com:
`Total de horarios unicos: X`, onde X é a quantidade de horários únicos.

**Atenção**: Os "horarios unicos" são os horários diferentes, ou seja, cada horário aparece uma única vez na listagem, mesmo que tenham sido informados múltiplas vezes na entrada. Dessa forma, a saída apresenta os horários distintos organizados do mais cedo ao mais tarde, eliminando duplicatas da entrada.

## Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table><thead>
  <tr>
    <th><b>Entrada</b></th>
    <th><b>Saída</b></th>
  </tr></thead>
<tbody>
  <tr>
    <td>3<br>15:00<br>12:00<br>15:00</td>
    <td>12:00<br>15:00<br>Total de horarios unicos: 2</td>
  </tr>
  <tr>
    <td>4<br>11:30<br>09:00<br>11:30<br>09:00</td>
    <td>09:00<br>11:30<br>Total de horarios unicos: 2</td>
  </tr>
  <tr>
    <td>5<br>08:00<br>08:00<br>08:00<br>09:00<br>10:00</td>
    <td>08:00<br>09:00<br>10:00<br>Total de horarios unicos: 3</td>
  </tr>
</tbody>
</table>

**Atenção**: É extremamente importante que as entradas e saídas sejam exatamente iguais às descritas na descrição do desafio de código.

