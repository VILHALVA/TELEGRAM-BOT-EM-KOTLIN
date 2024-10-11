import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.exceptions.TelegramApiException
import org.telegram.telegrambots.extensions.bots.commandbot.TelegramCommandBot
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException
import org.telegram.telegrambots.meta.api.objects.Update
import org.telegram.telegrambots.meta.api.objects.Message
import org.telegram.telegrambots.bots.DefaultBotOptions
import org.telegram.telegrambots.meta.api.objects.User
import java.io.File
import java.util.*

fun main() {
    val bot = MyTelegramBot()
    try {
        val botsApi = TelegramBotsApi()
        botsApi.registerBot(bot)
    } catch (e: TelegramApiRequestException) {
        e.printStackTrace()
    }
}

class MyTelegramBot : TelegramLongPollingBot() {

    private val token: String = Config.BOT_TOKEN 
    private val username: String = Config.BOT_USERNAME

    override fun getBotToken(): String {
        return token
    }

    override fun getBotUsername(): String {
        return username
    }

    override fun onUpdateReceived(update: Update) {
        if (update.hasMessage() && update.message.hasText()) {
            val message: Message = update.message
            processMessage(message)
        }
    }

    private fun processMessage(message: Message) {
        val chatId = message.chatId
        val text = message.text

        when (text) {
            "/start" -> sendMessage(chatId, "Olá, ${message.from.firstName}! Bem-vindo ao bot. Aqui estão os comandos disponíveis:\n\n/start - Ver a saudação e os comandos disponíveis\n/help - Exibe uma mensagem de ajuda\n/about - Informações sobre o bot")
            "/help" -> sendMessage(chatId, "Para usar o bot, você pode utilizar os seguintes comandos:\n/start - Exibe uma saudação e lista de comandos\n/help - Exibe esta mensagem de ajuda\n/about - Informações sobre o bot")
            "/about" -> sendMessage(chatId, "Este é um bot básico usando a API do Telegram.")
            else -> sendMessage(chatId, "Comando não reconhecido. Use /help para ver os comandos disponíveis.")
        }
    }

    private fun sendMessage(chatId: Long, text: String) {
        val message = SendMessage()
        message.chatId = chatId.toString()
        message.text = text

        try {
            execute(message) 
        } catch (e: TelegramApiException) {
            e.printStackTrace()
        }
    }
}
