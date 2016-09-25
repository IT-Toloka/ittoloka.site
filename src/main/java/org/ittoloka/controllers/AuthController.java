package org.ittoloka.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SeVlad on 25.09.2016.
 */
@Controller
public class AuthController {

    @RequestMapping("/admin")
    String admin(){
        return "admin";
    }

}
