package com.example.madspildgui.controller;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String frontPage(){
        return "frontPage";
    }

    @GetMapping("/tipsOgTricks")
    public String tips() {
        return "tipsOgTricks";
    }
    @GetMapping("/links")
    public String links(){
        return "nyttigeLinks";
    }

    @GetMapping("/quiz")
    public String quiz(){
        return "quiz";
    }

    @GetMapping("/mereInfo")
    public String mereInfo(){
        return "mereInfo";
    }

    @GetMapping("/samarbejdsPartnere")
    public String samarbejdsPartnere(){
        return "samarbejdsPartnere";
    }
}
