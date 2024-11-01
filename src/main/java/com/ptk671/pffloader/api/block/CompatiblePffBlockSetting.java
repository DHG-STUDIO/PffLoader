package com.ptk671.pffloader.api.block;

public class CompatiblePffBlockSetting {
private PffBlockSettings getBlockSettings;

    public static PffBlock of(PffBlockSettings pffItemSettings)
    {
        PffBlock pffBlock = pffItemSettings.build();
        return  pffBlock;
    }
}
