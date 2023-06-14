package com.cherikoff.toikiller.controller;

import com.cherikoff.toikiller.service.KillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class KillController {
    @Autowired
    private KillService killService;

    @GetMapping("/")
    public String get(Model model) {
        return "kill";
    }

    @PostMapping("/getCharacter")
    public String getCharacter(@PathVariable String character, Model model){
        model.addAttribute("act", killService.findCharacter(character));
        return "kill";
    }

    @PostMapping("/getClan")
    public String getClan(@RequestParam String clan, Model model){
        model.addAttribute("act", killService.findClan(clan));
        return "kill";
    }

    @PostMapping("/addCharacter")
    public String addCharacter(@RequestParam String character){
        killService.addCharacter(character);
        return "kill";
    }

    @PostMapping("/addClan")
    public String addClan(@RequestParam String clan){
        killService.addClan(clan);
        return "kill";
    }
}
