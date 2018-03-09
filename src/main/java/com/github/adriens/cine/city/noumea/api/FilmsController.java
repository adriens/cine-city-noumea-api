/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.adriens.cine.city.noumea.api;

import com.github.adriens.cine.city.noumea.sdk.CinemaContact;
import com.github.adriens.cine.city.noumea.sdk.Film;
import com.github.adriens.cine.city.noumea.sdk.FilmDetails;
import com.github.adriens.cine.city.noumea.sdk.FilmsWrapper;
import java.io.IOException;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author salad74
 */
@RestController
public class FilmsController {

    final static Logger logger = LoggerFactory.getLogger(FilmsController.class);

    public FilmsController(){
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(java.util.logging.Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http").setLevel(java.util.logging.Level.OFF);        
    
    }
    @RequestMapping(
            value = {"/", "/today"})
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
        return wrapper.getWorsts20();
    }

    @RequestMapping("/contact")
    public CinemaContact contact() throws IOException {
        CinemaContact contact = new CinemaContact();
        return contact;
    }

    @RequestMapping(value = "/film/{filmid}")
    public FilmDetails filmDetails(
            @PathVariable("filmid") int filmid) throws IOException {
        //CinemaContact contact = new CinemaContact();
        logger.info("Got movie id : <" + filmid + ">");
        FilmsWrapper wrap = new FilmsWrapper();
        return wrap.getDetailsOfFilm(filmid);
    }
}
