package com.cherikoff.toikiller.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KillService {

    private List<String> characters;

    private List<String> clans;

    @PostConstruct
    void init() {
        characters = new ArrayList<>();
        clans = new ArrayList<>();
    }

    public String findCharacter(String character) {
        return characters.contains(character) ? "Известный, не бить" : "Трахат";
    }

    public String findClan(String clan) {
        return clans.contains(clan) ? "Известный, не бить" : "Трахат";
    }

    public String addCharacter(String character) {
        characters.add(character);
        return "Добавлен";
    }

    public String addClan(String clan) {
        clans.add(clan);
        return "Добавлен";
    }
}
