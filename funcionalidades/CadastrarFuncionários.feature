#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastrar Funcion�rios
como um usu�rio da aplica��o
eu quero cadastrar funcion�rios
para que eu possa gerenciar funcion�rios

Esquema do Cen�rio: Cadastro de funcion�rios com sucesso
Dado Acessar a p�gina de cadastro de funcion�rio
E Informar o nome do funcion�rio <nome>
E Informar o cpf do funcion�rio <cpf>
E Informar a matr�cula do funcion�rio <matricula> 
E Informar a data de admiss�o do funcion�rio <admissao>
E Selecionar a empresa do funcion�rio <empresa>
E Selecionar o setor do funcion�rio <setor>
E Selecionar a fun��o do funcion�rio <funcao>
Quando Solicitar a realiza��o do cadastro do funcion�rio
Ent�o Sistema imforma que o funcion�rio foi cadastrado com sucesso

Exemplos:
| nome        | cpf             | matricula | admissao     | empresa     | setor     | funcao     |
| "Ana Paula" | "123.456.789-00"| "A00001"  | "27/04/2022" | "Empresa A" | "Setor A" | "Fun��o A" |
| "Rui Silva" | "321.654.987-00"| "A00002"  | "26/04/2022" | "Empresa B" | "Setor B" | "Fun��o B" |
| "Max Braga" | "231.546.879-00"| "A00003"  | "27/04/2022" | "Empresa C" | "Setor C" | "Fun��o C" |
