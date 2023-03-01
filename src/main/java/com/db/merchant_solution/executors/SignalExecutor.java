package com.db.merchant_solution.executors;

/**
 * This is an upcall from our trading system, and we cannot change it.
 */
public interface SignalExecutor {
    void execute();
}