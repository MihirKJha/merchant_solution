package com.db.merchant_solution.executors;

import com.db.merchant_solution.lib.Algo;

/**
 * Implementation class for handling Cancel signal(signal 0)
 */
public class CancelSignal implements SignalExecutor {
    @Override
    public void execute() {
        Algo algo = new Algo();
        algo.cancelTrades();
        algo.doAlgo();
    }
}

