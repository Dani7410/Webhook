package com.example.demo.Controller;

import com.example.demo.Model.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetController {

    @GetMapping("/Hej")
    public String PetHome(Model model){
        Pet Cat = new Pet ("john",10,"Mike");
        model.addAttribute("animal",Cat);
        return"/PetView/pet";
    }


}
