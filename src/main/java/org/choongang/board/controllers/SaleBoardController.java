package org.choongang.board.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/sale")
public class SaleBoardController {

    @GetMapping
    public String board(){

        return "sale/sale";
    }

}
