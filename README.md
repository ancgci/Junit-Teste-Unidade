# JUnit - Teste de Unidade

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=%20CONCLUIDO&color=GREEN&style=for-the-badge)

## Apresentação



O teste de unidade é uma prática conhecida por testar a menor parte de um sistema em desenvolvimento. O framework JUnit é uma ferramenta amplamente utilizada para realizar testes de software.

O teste de unidade é uma etapa importante no processo de desenvolvimento de software, pois permite verificar e validar funções, classes e métodos criados anteriormente. Um exemplo prático do uso do JUnit pode ser encontrado neste repositório de [Teste de Unidade](https://github.com/ancgci/Junit-Teste-Unidade), que tem um enfoque educacional.

Nesse exemplo, utilizamos um modelo de programa disponibilizado publicamente por [Claudio Neves](https://github.com/claudioneves1981/junit-gradle-empty), fazendo algumas modificações e adições no código Java. Também reutilizamos alguns testes descritos pelo mesmo autor.

O objetivo principal não é criar um programa em Java, mas sim testar as classes utilizando o framework JUnit.

## IDE utilizada

Optamos pelo uso da IDE do Visual Code para trabalharmos a codificação. 

## Linguagem

- Java

## Vamos Começar

Para utilizamos o Junit é necessário configurar as depenências , assim acesse o site:

- https://mvnrepository.com/search?q=junit 

- Selecione a opção "JUnit Jupiter Engine" 

![1](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/Junit1.png)

- Optamos pela versão mais recente no momento a 5.10.0; 

![2](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/Junit2.png)

- Chegando na tela da versão escolhida visualize "Gladle" e copie todo o código;

![3](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/Junit3.png)

- Volte para o IDE com o qual você está usando e abra o aquivo "build.gradle" e cole o código dentro de Dependências e salve.

![4](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/Junit4.png)

## Testes

Dentro de um projeto de sistema Java é importante que haja uma separação dentro de "source" entre a pasta main(que terão os códigos do programa em desenvolvido) e a pasta de testes. 

![5](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/main-teste.png)

## Testando a Classe Pessoa

Como já dizemos anteriormente testamos a menor parte do código que seria uma função, metodo ou classe. 
Na Classe pessoa temos os metodos conforme imagem abaixo (ex: getNome e getNascimento). 

Assim testamos alguns métodos que podem ser visto no arguivo "PessoaTest.java" conforme figura abaixo. Fica notória o inicio do código em @Test que compõe a sintaxe de cada caso de teste. 

![6](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/ClassePessoa.png)

No primeiro caso de teste temos "validarCalculodeIdade" onde conforme código Pesso.Java o Antonio é criado com data de nascimento em 01/01/2020. Então é utilizado o método do Junit assertEquals onde se espera 3 da idade da pessoa Antonio.

![7](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/TestePessoa.png)

Execução particular do primeiro caso de teste "validarCalculodeIdade" com sucesso:

![8](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/TestePessoa2.png)

Constam outros casos casos testes inclusos do arquivo  "PessoaTest.java" com outros métodos. 

## Testando a Classe MessageUtil

Aqui o metodo "assertEquals" confirma que a mensagem gerada com base na Classe citada é a mesma que fora construida

![9](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/ClasseMensagem.png)

Arquivo "MessageTest.java" :

![10](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/TesteMensagem.png)

Execução particular do caso de teste "validarCalculodeIdade" com sucesso:

![11](https://github.com/ancgci/Junit-Teste-Unidade/blob/main/img/TesteMensagem2.png)

## Feedback

Não citamos aqui toda a complexidade do framework Junit sugiro o site [Tutorialspoint](https://www.tutorialspoint.com/junit/e)  para maiores aprofundamentos. 

Caso queira nos corrigir em algum apontamento fique a vontade de nos enviar mensagem no telegram (@acgjr)





