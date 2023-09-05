package fr.cakihorse;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {

    public static final String token = "";
    public static void main(String[] args) {
        JDA jda = JDABuilder.createDefault(token).setActivity(Activity.playing("WhatTheMeme !?")).build();
    }
}