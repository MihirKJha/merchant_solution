package com.db.merchant_solution.service;

import com.db.merchant_solution.lib.Algo;
import com.db.merchant_solution.lib.SignalHandler;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

/**
 * This is your team’s code and should be changed as you see fit.
 */

@Service
@Log4j
public class Application implements SignalHandler {
    public void handleSignal(int signal) {
        Algo algo = new Algo();

        switch (signal) {
            case 1:
                algo.setUp();
                algo.setAlgoParam(1,60);
                algo.performCalc();
                algo.submitToMarket();
                break;

            case 2:
                algo.reverse();
                algo.setAlgoParam(1,80);
                algo.submitToMarket();
                break;

            case 3:
                algo.setAlgoParam(1,90);
                algo.setAlgoParam(2,15);
                algo.performCalc();
                algo.submitToMarket();
                break;

            default:
                algo.cancelTrades();
                break;
        }

        algo.doAlgo();
    }
}


