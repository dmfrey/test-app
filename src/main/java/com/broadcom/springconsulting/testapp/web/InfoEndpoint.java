package com.broadcom.springconsulting.testapp.web;

import com.broadcom.springconsulting.testapp.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/info" )
public class InfoEndpoint {

    private final TimeService timeService;

    public InfoEndpoint( final TimeService timeService ) {
        this.timeService = timeService;
    }

    @GetMapping( "/time" )
    public String time() {

        var ts = this.timeService.getCurrentTime();

        return ts.toString();
    }

}