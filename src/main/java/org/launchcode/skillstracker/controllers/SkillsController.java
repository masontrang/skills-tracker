package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String Home() {
        return
                "<html>" +
                        "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                        "<li>Java</li>" +
                        "<li>JavaScript</li>" +
                        "<li>Python</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "Name<br>" +
                "<form action='form' method='post'>" +
                "<input type='text' name='name'>" +
                "<br>My favorite Language<br>" +
                "<select name='first'>" +
                "    <option value=>--Please choose an language--</option>" +
                "    <option value='Java'>Java</option>" +
                "    <option value='JavaScript'>JavaScript</option>" +
                "    <option value='Python'>Python</option>" +
                "</select>" +
                "<br>My second favorite Language<br>" +
                "<select name='second'>" +
                "    <option value=>--Please choose an language--</option>" +
                "    <option value='Java'>Java</option>" +
                "    <option value='JavaScript'>JavaScript</option>" +
                "    <option value='Python'>Python</option>" +
                "</select>" +
                "<br>My third favorite Language<br>" +
                "<select name='third'>" +
                "    <option value=>--Please choose an language--</option>" +
                "    <option value='Java'>Java</option>" +
                "    <option value='JavaScript'>JavaScript</option>" +
                "    <option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String Results(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
        return
                "<html>" +
                        "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<h2>Here are " + name + "'s favorite languages!</h2>" +
                        "<ol>" +
                        "<li>" + first + "</li>" +
                        "<li>" + second + "</li>" +
                        "<li>" + third + "</li>" +
                        "</ol>" +
                        "</body>" +
                        "</html>";
    }

}
