AIT — Auto de Infração de Trânsito

Atividade avaliativa do curso Métodos Ágeis de Desenvolvimento de Software

Este repositório reúne um software de criação e gestão de AIT (Auto de Infração de Trânsito), desenvolvido como atividade prática para experimentar programação em pares e comparar com o trabalho individual.

🎯 Objetivo

Implementar duas funcionalidades de um software:

Funcionalidade A (individual): implementação realizada sozinho.

Funcionalidade B (em par): implementação realizada em dupla.

Após a implementação, descrever impressões sobre o arranjo produtivo em par e relacionar com a teoria apresentada em aula/slides.

Questão norteadora do artigo: Quando você deve adotar a programação em pares?

📦 Sobre o software

O sistema permite criar e registrar Autos de Infração de Trânsito (AITs), contemplando:

cadastro de agentes de trânsito, condutores, veículos, cidades e bairros;

registro de infrações conforme enquadramento;

preenchimento de informações do AIT (local, data, hora, agente);

geração do AIT para visualização/impressão.

Estrutura do código

builder/ → montagem dos objetos principais do sistema (ex.: AitBuilder).

dao/ → classes de acesso a dados (ex.: AgenteDao, CidadeDao, InfracaoDao).

model/ → entidades do sistema (Agente, Ait, Bairro, Cidade, Infracao).

process/ → processos de negócio (AitPrinter, DadosIniciaisLoader).

main/ → ponto de entrada da aplicação (SistemaAitApp).

🧩 Funcionalidades e arranjo de trabalho
Item	Funcionalidade	Escopo resumido	Arranjo	Observações
A	Cadastro e criação de AIT	Registro de dados (condutor, agente, infração, local)
Individual	Definição de modelo, 
DAOs e validações
B	Emissão/Impressão do AIT	Geração de saída via AitPrinter (ex.: relatório ou impressão)	
Par	Implementado em dupla, alternando Driver/Navigator

🛠️ Como executar
# Clonar o repositório
git clone https://github.com/richfalmeida/programacao-em-pares.git
cd programacao-em-pares

# Compilar
javac -d bin src/**/*.java

# Executar
java -cp bin main.SistemaAitApp
