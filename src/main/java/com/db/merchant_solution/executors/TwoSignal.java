package com.db.merchant_solution.executors;

import com.db.merchant_solution.lib.Algo;

/**
 * Implementation class for handling signal 2
 */
public class TwoSignal implements SignalExecutor {
    @Override
    public void execute() {
        Algo algo = new Algo();
        algo.reverse();
        algo.setAlgoParam(1,80);
        algo.submitToMarket();
        algo.doAlgo();
    }
}

