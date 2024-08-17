# Descrição

Você foi contratado por uma empresa de telecomunicações para desenvolver um sistema que calcule o consumo total de dados móveis de um cliente durante um mês. O consumo semanal de dados móveis é fornecido como entrada. Além de calcular o total de dados consumidos no mês, o sistema deve fornecer uma média semanal de consumo e identificar a semana de maior consumo.

# Entrada

A entrada do programa é uma string com uma lista de valores representando o consumo semanal de dados em megabytes (MB), separados por vírgulas. Cada valor na lista corresponde ao consumo total de uma semana.

# Saída

A saída do programa deve incluir:

1. O consumo total de dados móveis em MB ao longo do mês.
2. A média semanal de consumo de dados móveis.
3. A semana de maior consumo (considerando o primeiro valor como o da semana 1).

# Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<div class="table_component" role="region" tabindex="0">
<table>
    <thead>
        <tr>
            <th>Entrada</th>
            <th><strong>Saída</strong></th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>2064,4000,2000,3200</td>
            <td>
                <div>Total mensal: 11264 MB</div>
                <div>Media semanal: 2816 MB</div>
                <div>Maior consumo: Semana 2</div>
            </td>
        </tr>
        <tr>
            <td>5000,4880,4600,6000</td>
            <td>
                <div>Total mensal: 20480 MB</div>
                <div>Media semanal: 5120 MB</div>
                <div>Maior consumo: Semana 4</div>
            </td>
        </tr>
        <tr>
            <td>4000,4456,6000,5000</td>
            <td>
                <p>Total mensal: 19456 MB<br>Media semanal: 4864 MB<br>Maior consumo: Semana 3</p>
            </td>
        </tr>
    </tbody>
</table>
</div>
