package com.db.merchant_solution.controller;

import com.db.merchant_solution.service.Application;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api("Rest controller for handling trading signals")
@RestController
@RequestMapping(value = "/trades",
        produces = MediaType.APPLICATION_JSON_VALUE,
        consumes = MediaType.APPLICATION_JSON_VALUE)
public class SignalController {

    @Autowired
    private Application application;

    @ApiOperation("API to process signal")
    @GetMapping("/{signal}")
    public void handleTradesBooking(@PathVariable("signal") int signal) {
        application.handleSignal(signal);
    }

}