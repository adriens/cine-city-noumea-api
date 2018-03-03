/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.cine.city.noumea.api;

import com.github.adriens.cine.city.noumea.sdk.CinemaContact;
import com.github.adriens.cine.city.noumea.sdk.Film;
import com.github.adriens.cine.city.noumea.sdk.FilmsWrapper;
import java.io.IOException;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salad74
 */
@RestController
public class FilmsController {
    
    @RequestMapping("/today")
    public ArrayList<Film> today() throws IOException {
        FilmsWrapper wrapper = new FilmsWrapper();
        return wrapper.getFilmsDuJour();
    }
    
    @RequestMapping("/bests")
    public ArrayList<Film> bests() throws IOException {
        FilmsWrapper wrapper = new FilmsWrapper();
        return wrapper.getTop20();
    }
    @RequestMapping("/worsts")
    public ArrayList<Film> worsts() throws IOException {
        FilmsWrapper wrapper = new FilmsWrapper();
        return wrapper.getWorst20();
    }
    
    @RequestMapping("/contact")
    public CinemaContact contact() throws IOException {
        CinemaContact contact = new CinemaContact();
        return contact;
    }
    
}
