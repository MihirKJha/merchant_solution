package com.db.merchant_solution.enums;

import com.db.merchant_solution.executors.*;

import java.util.function.Supplier;

public enum SignalExecutorsSupplier implements Supplier<SignalExecutor> {
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
