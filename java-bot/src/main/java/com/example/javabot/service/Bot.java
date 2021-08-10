package com.example.javabot.service;

import org.checkerframework.checker.units.qual.K;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

@Component
public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "recipe_by_leetovetz_bot";
    }

    @Override
    public String getBotToken() {
        return "1875394128:AAEpSWZaQsuTN5MpsAU-qGlkD2LptcdBkOs";
    }

    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        System.out.println("Your message has been received. Thank you. " + message.getText());
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Hi. I got your message. This one: " + message.getText());
        sendMessage.setChatId(String.valueOf(message.getChatId()));

        if (message.getText().equals("/start")) {
            String text = "Hi. \nPress the button and choose your own menu.)) \nBon appetit. \n";
            sendMessage.enableMarkdown(true);
            ReplyKeyboardMarkup keyboardMarkup = getMenuKeyboard();
            sendMessage.setReplyMarkup(keyboardMarkup);
            sendMessage.setText(text);

            }

        if (message.getText().equals("Breakfast")) {
            String menu = "Breakfast menu. \n";
            menu = menu + "1. Oatmeal with raspberry jam.\n";
            menu = menu + "2. Cottage cheese with a banana.\n";
            menu = menu + "3. Sausage sandwich and sweet tea.\n";
            sendMessage.setText(menu);
        }

        if (message.getText().equals("Dinner")) {
            String menu = "Dinner menu. \n";
            menu = menu + "1. Borscht with sour cream.\n";
            menu = menu + "2. Fish soup.\n";
            menu = menu + "3. Chicken breast with salad.\n";
            sendMessage.setText(menu);
        }

        if (message.getText().equals("Lunch")) {
            String menu = "Lunch menu. \n";
            menu = menu + "1. Big ripe watermelon.\n";
            menu = menu + "2. Peaches and raspberries.\n";
            menu = menu + "3. Banana and ice cream.\n";
            sendMessage.setText(menu);
        }

        if (message.getText().equals("Supper")) {
            String menu = "Supper menu. \n";
            menu = menu + "1. Fried potatoes with chicken.\n";
            menu = menu + "2. Red fish and salad.\n";
            menu = menu + "3. Okroshka.\n";
            sendMessage.setText(menu);
        }

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private ReplyKeyboardMarkup getMenuKeyboard() {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add("Breakfast");
        keyboardRow.add("Dinner");
        KeyboardRow keyboardButtons = new KeyboardRow();
        keyboardButtons.add("Lunch");
        keyboardButtons.add("Supper");
        keyboardRows.add(keyboardRow);
        keyboardRows.add(keyboardButtons);
        replyKeyboardMarkup.setKeyboard(keyboardRows);
        return replyKeyboardMarkup;


    }
}
