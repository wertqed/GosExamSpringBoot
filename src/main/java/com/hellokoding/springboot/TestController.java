package com.hellokoding.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by VBelov on 29.05.2018.
 */
@Controller
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    TestRepository testRepository;

    @RequestMapping()
    public String getTests(Model model){
        model.addAttribute("listTest", testRepository.getAll());
        return "test";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addTest(Model model,@RequestParam("id") Long id, @RequestParam("name") String name){
        testRepository.insert(new Test(id,name));
        model.addAttribute("listTest", testRepository.getAll());
        return "test";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String updateTest(Model model,@RequestBody Test test){
        testRepository.update(test);
        model.addAttribute("listTest", testRepository.getAll());
        return "test";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String getTest(Model model,@PathVariable("id") Long id){
        testRepository.deleteById(id);
        model.addAttribute("listTest", testRepository.getAll());
        return "test";
    }
}
