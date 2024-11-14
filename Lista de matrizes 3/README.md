# ListaMatriz3
 
1 - Criar um programa que leia os elementos de uma matriz inteira 4 x 4 e:

a) escreva os elementos da diagonal principal;

b) escreva todos os elementos, exceto os elementos da diagonal principal;

2 - Criar uma matriz que pede um valor, e exiba conforme a seguinte tabela.
ex:3
x 0 x
0 x 0
x 0 x

ex: 4
x 0 0 x
0 x x 0
x 0 0 x

3 - Crie um novo aplicativo, que simula a emissão de um relatório simplificado de folha de pagamento. O aplicativo deve utilizar diálogos de entrada de dados para solicitar o nome e o salário de cada funcionário.  O aplicativo deve permitir que você indique o número de funcionários que deseja registrar, desde que este número seja superior a zero. Se este diálogo for cancelado, o aplicativo deve ser encerrado imediatamente.  
Armazene os nomes dos funcionários em um vetor.  
Utilize uma matriz que contenha quatro colunas para armazenar os seguintes dados de cada funcionário: 
Salário bruto 
INSS 
Imposto de Renda 
Salário líquido
O nome e o salário bruto devem ser informados e os descontos devem ser calculados pelo aplicativo.  Se o nome ou o salário bruto não forem válidos, uma mensagem de erro deve ser exibida e o aplicativo deve solicitar novamente o dado.  
As regras para a validação destes dados são as seguintes: 
Nome: deve conter pelo menos 2 caracteres. 
Salário: deve ser um valor igual ou superior a R$ 465,00.
O teto para recolhimento de INSS é de RS 354,07. Esse é o valor máximo que pode ser descontado do funcionário.  Para cada funcionário, o aplicativo deve calcular os valores a serem descontados de seu salário a título de INSS e de Imposto de Renda. 
Para calcular o valor do INSS a ser descontado, utilize a tabela abaixo: 
Salário Alíquota Até R$ 965,67 8,0 
De R$ 965,68 a R$ 1.609,45 9,0 
De R$ 1.609,46 a R$ 3.218,90 11,0
Para calcular o valor do Imposto de Renda, utilize a tabela abaixo. 
Salário Alíquota Até R$ 1.434,00 0,0 
De R$ 1.434,01 a R$ 2.150,00 7,5 
De R$ 2.150,01 a R$ 2.886,00 15,0 
De R$ 2.886,01 a R$ 3.582,00 22,5 
Acima de 3.582,00 27,5
O aplicativo também deve calcular o salário líquido a ser pago a cada funcionário, que representa o valor do salário decrescido dos valores do INSS e do Imposto de Renda.  Quando você cancelar um dos diálogos de entrada de dados, este aplicativo deve exibir uma mensagem contendo o resumo da folha de pagamento.  
Este resumo deve ter o nome e o salário bruto de cada funcionário registrado, os valores do INSS e do Imposto de Renda que serão descontados e o salário líquido a ser pago.  
Ao final deste resumo, devem ser indicadas algumas totalizações: 
A soma do valor de todos os salários brutos 
A soma dos descontos de INSS 
A soma dos descontos de Imposto de Renda 
A soma de todos os salários líquidos
