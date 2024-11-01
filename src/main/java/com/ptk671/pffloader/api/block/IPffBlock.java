package com.ptk671.pffloader.api.block;

import java.util.Optional;

public interface IPffBlock {
    default Optional<PffBlockSettings> getOptionalSettings() {
        return Optional.ofNullable(getBlockSettings());
    }

    PffBlockSettings getBlockSettings();
}
