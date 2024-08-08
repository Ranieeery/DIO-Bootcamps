## Descrição
Implemente um programa que verifique se houve queda de conexão em um dia. A queda de conexão é definida como qualquer velocidade registrada igual a 0 Mbps. O sistema deve ler os registros de velocidade de conexão, processar os dados e determinar se ocorreu queda de conexão durante o dia.

## Entrada
A entrada deve receber uma lista de valores inteiros representando a velocidade de conexão em Mbps separados por vírgulas.

## Saída
Deverá retornar "Queda de Conexao" se houver pelo menos uma velocidade registrada igual a 0 Mbps, e "Sem Quedas" caso contrário.

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

|Entrada	|Saída|
|-----|--------|
|130,50,0,90,130,136	|Queda de Conexao|
|120,130,125,125,120,130	|Sem Quedas|
|110,125,80,0,105,125	|Queda de Conexao|