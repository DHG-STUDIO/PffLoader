package com.ptk671.pffloader.api.block;

public class CompatiblePffBlockSetting {

    public static PffBlock of(PffBlockSettings pffItemSettings)
    {
        PffBlock pffBlock = pffItemSettings.build();
        return  pffBlock;
    }
}
