package com.ptk671.pffloader.api.item;


import java.util.Optional;

public interface  IPffItem {
    default Optional<PffItemSettings> getOptionalSettings() {
        return Optional.ofNullable(getSettings());
    }

    PffItemSettings getSettings();
}
