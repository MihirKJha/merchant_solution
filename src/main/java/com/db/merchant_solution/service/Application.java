package com.db.merchant_solution.service;

import com.db.merchant_solution.enums.Numbers;
import com.db.merchant_solution.enums.SignalExecutorsSupplier;
import com.db.merchant_solution.lib.Algo;
import com.db.merchant_solution.lib.SignalHandler;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * This is your team’s code and should be changed as you see fit.
 *
 * Application service class to execute main business logic for processing the
 * signals *
 */
@Service
@Log4j
public class Application implements SignalHandler {
    public void handleSignal(int signal) {

        Objects.requireNonNull(signal, "Signal can not be null");

        Algo algo = new Algo();

        log.info("Inside handleSignal method of flow");

        Numbers numbers = Numbers.get(signal);

        SignalExecutorsSupplier.getSignalExecutor(SignalExecutorsSupplier.valueOf(numbers.name()));
    }
}
