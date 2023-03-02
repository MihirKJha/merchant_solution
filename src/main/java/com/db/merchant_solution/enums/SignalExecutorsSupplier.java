package com.db.merchant_solution.enums;

import com.db.merchant_solution.executors.*;

import java.util.function.Supplier;

/**
 * Enums to map signal to corresponding business logic supplier
 */
public enum SignalExecutorsSupplier implements Supplier<SignalExecutor> {
    CANCEL(CancelSignal::new),
    ONE(OneSignal::new),
    TWO(TwoSignal::new),
    THREE(ThreeSignal::new),
    FOUR(FourSignal::new);

    private final Supplier<SignalExecutor> supplier;

    SignalExecutorsSupplier(Supplier<SignalExecutor> supplier) {
        this.supplier = supplier;
    }

    public static SignalExecutor getSignalExecutor(SignalExecutorsSupplier signalExecutorsSupplier) {
        return signalExecutorsSupplier.get();
    }

    @Override
    public SignalExecutor get() {
        return supplier.get();
    }
}
