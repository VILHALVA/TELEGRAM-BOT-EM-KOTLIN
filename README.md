# TELEGRAM BOT EM KOTLIN
🤤ESTE BOT FOI DESENVOLVIDO EM KOTLIN UTILIZANDO A API DO TELEGRAM.

<img src="FOTO.jpg" align="center" width="500"> <br>

## DESCRIÇÃO:
Este bot foi desenvolvido em KOTLIN utilizando a API do Telegram. Ele responde a vários comandos que você pode enviar diretamente para ele em uma conversa privada. É um bot básico, mas personalizável, que pode ser expandido para incluir mais funcionalidades.

## FUNCIONALIDADES:
- **`/start`**: Inicia a conversa com o bot e envia uma mensagem de boas-vindas.
- **`/help`**: Exibe uma lista de comandos disponíveis que o usuário pode utilizar.
- **`/about`**: Fornece uma breve descrição do bot e seu propósito.

## EXECUTANDO O PROJETO:
1. **Obter o token e o ID de proprietário**:
   - Para usar esse bot, você precisa do **Token do bot**, que pode ser gerado pelo [@BotFather](https://t.me/BotFather) no Telegram.
   - Você também precisa do **seu ID de usuário** no Telegram. Para isso, use um bot como [INFO PRIVADO BOT](https://github.com/VILHALVA/INFO-PRIVADO-BOT) ou qualquer outro bot que forneça seu ID.

2. **Configurar o bot**:
   - No arquivo `./CODIGO/config.kt`, você deve substituir as variáveis `BOT_TOKEN` e `BOT_USERNAME` pelos seus valores:
     ```kotlin
     const val BOT_TOKEN = "YOUR_BOT_TOKEN"
     const val BOT_USERNAME = "YOUR_BOT_USERNAME"
     ```

3. **Instale as dependências** 
   - Navegue até o diretório `./CODIGO` e digite o comando:
   ```bash
   gradlew build
   ```

4. **Executar o Bot**:
   - Inicie o bot rodando o comando:
     ```bash
     kotlinc main.kt -include-runtime -d main.jar
     ```
   - O bot estará pronto para interagir com você no Telegram!

5. **Interagindo com o Bot**:
   1. **Iniciar o Bot**:
      - No Telegram, inicie uma conversa com o bot enviando o comando `/start`. Isso fará com que o bot envie uma mensagem de boas-vindas.

   2. **Ver Lista de Comandos**:
      - Envie o comando `/help` para receber uma lista de comandos disponíveis e o que cada um faz.

   3. **Obter Informações sobre o Bot**:
      - Envie o comando `/about` para aprender mais sobre o bot e seu propósito.

## NÃO SABE?
- Entendemos que para manipular arquivos em muitas linguagens e tecnologias relacionadas, é necessário possuir conhecimento nessas áreas. Para auxiliar nesse aprendizado, oferecemos alguns subsidios:
* [VEJA A DOCUMENTAÇÃO](https://core.telegram.org/bots/api)
* [CURSO SUGERIDO](https://github.com/VILHALVA/CURSO-DE-TELEBOT)
* [CURSO DE KOTLIN](https://github.com/VILHALVA/CURSO-DE-KOTLIN)
* [CONFIRA MAIS CURSOS](https://github.com/VILHALVA?tab=repositories&q=+topic:CURSO)

## CREDITOS:
- [PROJETO CRIADO PELO VILHALVA](https://github.com/VILHALVA)

