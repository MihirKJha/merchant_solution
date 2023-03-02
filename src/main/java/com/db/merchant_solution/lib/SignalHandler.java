package com.db.merchant_solution.lib;

/**
 * This is an up call from our trading system, and we cannot change it.
 */
public interface SignalHandler {
    void handleSignal(int signal);
}