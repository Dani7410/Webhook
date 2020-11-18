package com.example.demo.Controller;

import com.example.demo.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /* Når vi benytter en route vil metoden under blive kaldt hvor vi injecter et model objekt
    For at bruge vores Attribute skal vi så benytte os af objektet,
    Så vi tilføjer String attributen til vores objekt ved brug af model.addattribute*/
    //dermed bliver Modelen delt med viewet
    @GetMapping("/")
    public String Home(Model model){
        Person bob = new Person("Daniel", "joketovic");
        model.addAttribute("Person",bob);
        return "Index";
    }

}
