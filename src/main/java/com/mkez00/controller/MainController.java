package com.mkez00.controller;

import com.mkez00.helper.ApplicationHelper;
import com.mkez00.model.Pill;
import com.mkez00.service.PillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michaelkezele on 2017-10-30.
 */
@RestController
public class MainController {

    @Autowired
    PillService pillService;

    @RequestMapping(method = RequestMethod.GET ,produces = "application/json")
    public Pill main(){
        return pillService.getPill();
    }
}
