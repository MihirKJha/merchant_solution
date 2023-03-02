package com.db.merchant_solution.executors;

import com.db.merchant_solution.lib.Algo;

/**
 * Implementation class for handling signal 3
 */
public class ThreeSignal implements SignalExecutor {
    @Override
    public void execute() {
        Algo algo = new Algo();
        algo.setAlgoParam(1,90);
        algo.setAlgoParam(2,15);
        algo.performCalc();
        algo.submitToMarket();
        algo.doAlgo();
    }
}

