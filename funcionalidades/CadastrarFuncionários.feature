#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastrar Funcionários
como um usuário da aplicação
eu quero cadastrar funcionários
para que eu possa gerenciar funcionários

Esquema do Cenário: Cadastro de funcionários com sucesso
Dado Acessar a página de cadastro de funcionário
E Informar o nome do funcionário <nome>
E Informar o cpf do funcionário <cpf>
E Informar a matrícula do funcionário <matricula> 
E Informar a data de admissão do funcionário <admissao>
E Selecionar a empresa do funcionário <empresa>
E Selecionar o setor do funcionário <setor>
E Selecionar a função do funcionário <funcao>
Quando Solicitar a realização do cadastro do funcionário
Então Sistema imforma que o funcionário foi cadastrado com sucesso

Exemplos:
| nome        | cpf             | matricula | admissao     | empresa     | setor     | funcao     |
| "Ana Paula" | "123.456.789-00"| "A00001"  | "27/04/2022" | "Empresa A" | "Setor A" | "Função A" |
| "Rui Silva" | "321.654.987-00"| "A00002"  | "26/04/2022" | "Empresa B" | "Setor B" | "Função B" |
| "Max Braga" | "231.546.879-00"| "A00003"  | "27/04/2022" | "Empresa C" | "Setor C" | "Função C" |
