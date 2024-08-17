# Descrição
Desenvolva um sistema para monitorar o consumo mensal de dados móveis de clientes, verificando se excede o limite do plano adquirido. O sistema deve comparar o limite mensal, recebido em gigabytes (GB), com o consumo total de dados acumulado até o momento, fornecido em megabytes (MB). Se o consumo total ultrapassar o limite mensal, o sistema deverá informar ao cliente para adquirir ou renovar o pacote; caso contrário, deve retornar quanto em megabytes (MB) ainda está disponível para uso no mês.

# Entrada
A entrada do programa é fornecida em duas linhas:

A primeira linha contém o limite mensal de dados em gigabytes (GB).
A segunda linha contém o consumo total de dados móveis em megabytes (MB).
Saída
Dever

# Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table>
    <thead>
        <tr>
            <th>Entrada</th>
            <th><strong>Saída</strong></th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <div>10</div>
                <div>11264</div>
            </td>
            <td>Limite de dados excedido. Compre ou renove seu pacote.</td>
        </tr>
        <tr>
            <td>
                <div>25</div>
                <div>20480</div>
            </td>
            <td>Voce ainda possui 5120 MB disponiveis.</td>
        </tr>
        <tr>
            <td>
                <div>20</div>
                <div>19456</div>
            </td>
            <td>Voce ainda possui 1024 MB disponiveis.</td>
        </tr>
    </tbody>
</table>
</div>