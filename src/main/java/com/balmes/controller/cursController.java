package com.balmes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.balmes.service.cursService;

@Controller
@RequestMapping("/")
public class cursController {

    @Autowired
    private cursService cursService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showview()
    {

        ModelAndView mv = new ModelAndView();
        mv.addObject("cursos",cursService.list() );
        mv.setViewName("cursos.jsp");
        return mv;
    }

}
