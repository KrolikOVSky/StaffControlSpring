package com.staff.staff.controllers;

import com.staff.staff.enums.EnumGetter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddHumanController {


    @GetMapping("/addHuman")
    public String addHuman(Model model) {
        EnumGetter enumGetter = new EnumGetter();
        model.addAttribute("levels", enumGetter.getLevel());
        return "addNewHuman";
    }

}