package com.db.merchant_solution.executors;

import com.db.merchant_solution.lib.Algo;

/**
 * Implementation class for handling signal 1
 */
public class OneSignal implements SignalExecutor {
    @Override
    public void execute() {
        Algo algo = new Algo();
        algo.setUp();
        algo.setAlgoParam(1,60);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }
}

