package ru.student.cw2022.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.student.cw2022.entity.Action;
import ru.student.cw2022.entity.Film;
import ru.student.cw2022.repository.ActionRepository;
import ru.student.cw2022.repository.FilmRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;



@Controller
@Slf4j
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;
    private Action action;
    private ActionRepository actionRepository;

    @GetMapping("/list")
        public ModelAndView  getAllFilms () {
        ModelAndView mav = new ModelAndView("list-films");
          mav.addObject("films", filmRepository.findAll());
         return mav;
    }


    @GetMapping("/addFilmForm")
    public ModelAndView addFilmForm(){

        ModelAndView mav = new ModelAndView("add-film-form");
        Film film = new Film();
        mav.addObject("film",film);
        return mav;
    }

    @PostMapping ("/saveFilm")
    public String saveFilm (@ModelAttribute Film film){
        filmRepository.save(film);
        return "redirect:/list";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm (@RequestParam Long filmId){
        ModelAndView mav = new ModelAndView("add-film-form");
        Optional <Film> optionalFilm = filmRepository.findById(filmId);
        Film film = new Film();
        if(optionalFilm.isPresent()){
            film=optionalFilm.get();
        }
        mav.addObject("film",film);
        return mav;
    }

    @GetMapping("/deleteFilm")
    public String deleteFilm (@RequestParam Long filmId){
        filmRepository.deleteById(filmId);
        return "redirect:/list";
    }
}
