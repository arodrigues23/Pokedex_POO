# Pokedex_POO

## Descrição das Funcionalidades : 
O sistema simula uma Pokédex eletrônica digital no terminal, permitindo gerenciar uma lista de Pokémon cadastrados sem a necessidade de um banco de dados externo (os dados ficam armazenados temporariamente na memória RAM durante a execução).

O programa conta com um menu interativo controlado por laços de repetição e estruturado em pacotes orientados a objetos:

Adicionar Pokémon (Create): Permite registrar um novo Pokémon informando seus atributos principais (nome, nível, tipo, altura, peso e ataque principal). Conta com validação de limite máximo de espaço no vetor.

Listar Pokémon (Read): Exibe na tela todos os Pokémon atualmente cadastrados na Pokédex, numerados sequencialmente com seus respectivos atributos detalhados.

Atualizar Pokémon (Update): Localiza um Pokémon cadastrado com base no seu número na lista e permite modificar todos os seus dados internos.

Deletar / Liberar Pokémon (Delete): Remove um registro da Pokédex através do seu número de índice, deslocando automaticamente os registros restantes para evitar falhas de espaçamento no vetor.

Menu Contínuo (Laço de Repetição): O programa roda em um loop contínuo (while), exibindo o menu interativo repetidamente até que o usuário decida encerrar digitando o comando de saída (0).

## Como Executar o Projeto (Passo a Passo Simples) : 
Certifique-se de que os seus arquivos estão divididos corretamente em pastas conforme a declaração de pacotes (package pokemon;):

Abra o terminal (Prompt de Comando ou PowerShell no Windows, ou Terminal no Linux/macOS) na pasta raiz do seu projeto e execute o comando de compilação apontando para a classe principal:   
javac Main.java pokemon/Pokemon.java pokemon/EstruturaArray.java

Após compilar com sucesso, execute o programa através do comando:

java Main

O menu interativo da Pokédex aparecerá no terminal e você poderá navegar pelas opções digitando os números correspondentes (1 a 4) ou 0 para sair.
