package es.dws.JVBt03e02.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.dws.JVBt03e02.model.Palmares;
import es.dws.JVBt03e02.service.PalmaresService;
import lombok.AllArgsConstructor;

/**
 * MainController
 */
@Controller
@AllArgsConstructor
public class MainController {

    private final PalmaresService palmaresService;

    // @GetMapping({"/", "/home"})
    // public String home(@RequestParam(name = "user", required = false) String user, Model model) {
    //     final String message = user == null || user.isBlank() 
    //         ? null
    //         : "Bienvenido " + user;

    @GetMapping({"/", "/home"})
    public String home(@RequestParam(name = "user") Optional<String> user, Model model) {
        final String message = user.map(u -> "Bienvenido " + u).orElse(null);
        model.addAttribute("user", message);
        model.addAttribute("year", LocalDate.now().getYear());
        return "indexView";
    }

    @GetMapping("/palmares")
    public String palmares(Model model) {
        List<Palmares> palmares = palmaresService.getPalmares();

        model.addAttribute("palmares", palmares);
        model.addAttribute("year", LocalDate.now().getYear());
        return "palmaresView";
    }

    @GetMapping("/galeria")
    public String showGallery(Model model) {
        model.addAttribute("year", LocalDate.now().getYear());
        return "photoGalleryView";
    }

    @GetMapping("/enlaces")
    public String showLinks(Model model) {
        model.addAttribute("year", LocalDate.now().getYear());
        return "linksView";
    }
}
