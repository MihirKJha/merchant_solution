package com.db.merchant_solution.controller;

import com.db.merchant_solution.service.Application;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api("Rest controller for handling trading signals")
@RestController
public class SignalController {


    private final Application application;

    public SignalController(Application application) {
        this.application = application;
    }

    @ApiOperation("API to process signal")
    @GetMapping("/trades/{signal}")
    public void handleTradesBooking(@PathVariable("signal") String signal) {
        application.handleSignal(Integer.parseInt(signal));
    }
}