package com.erdframework.erdweb.controller;


import com.erdframework.erdweb.dao.po.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author Shao Zhen Jun
 * @created 2018-05-28-12:46
 **/
@Controller
//@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home page";
    }

    @RequestMapping(value = "/")
    public String index(Model model){
        Person single = new Person("aa", 11);
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("zhangsan", 11);
        Person p2 = new Person("lisi", 22);
        Person p3 = new Person("wangwu", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    @RequestMapping("/feature")
    public String feature(Model model){
        return "feature/feature";
    }

    @RequestMapping("/service")
    public String service(Model model){
        return "service/service";
    }

    @RequestMapping("/price")
    public String price(Model model){
        return "price/price";
    }

    @RequestMapping("/coop")
    public String coop(Model model){
        return "coop/coop";
    }

    @RequestMapping("/about")
    public String about(Model model){
        return "about/about";
    }

}
