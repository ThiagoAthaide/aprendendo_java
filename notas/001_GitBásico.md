# Git

## O que é?
O Git é uma ferramenta utilizada para compartilhar e versionar código. É de extrema importancia no processo de desenvolvimento de software pois evita que quando varios desenvolvedores trabalhem num codigo, ele quebre ou se perca.

## Comando básicos

### Configurando o Git
```bash
# Identifica o seu nome e o seu email para o Git na sua maquina
git config --global user.name "Thiago Athaide" 
git config --global user.email thiaguinho_gostosinho@hotmail.com
```

### Inicializando um Repositório
```bash
# Inicializa uma pasta qualquer como um repositório do git
git initi
```

### Adicionando itens de uma pasta ao repositorio
```bash
# Adiciona tudo que estiver na pasta atual ao repositório
git add .
```

### Enviar seus arquivos para um repositório online
```bash
# Diz para este repositório, onde ele vai ficar na WEB (qual vai ser o endereço dele na WEB)
git remote add origin https://github.com/ThiagoAtraide/aprendendo_java.git
```

### Fechar um pacote de arquivos para serem enviados
```bash
# Fecha um pacote de arquivos e deixa eles prontos pro envio, deixando uma mensagem de identificaçao
git commit -m "Meu primeiro commit" 
```

### Mandar tudo para a WEB (repositorio online)
```bash
# O Git push, pega tudo que foi comitado e manda pra WEB
git push origin master
```

### Pegar um repositorio que ja existe pra minha maquina
```bash
# Clona um repositorio existente para sua maquina
git clone https://github.com/ThiagoAthaide/aprendendo_java.git
```

### Atualizar o meu repositorio com as ultimas atualizações que outras pessoas colocaram
```bash
# Dentro de um repositorio ja existente, pega tudo que tem de novo na WEB e puxa para sua maquina
git pull
```