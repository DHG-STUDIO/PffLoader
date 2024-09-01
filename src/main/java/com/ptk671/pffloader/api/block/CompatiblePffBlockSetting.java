package com.ptk671.pffloader.api.block;

public class CompatiblePffBlockSetting {

    public static PffBlock of(PffBlockSettings pffBlockSettings)
    {
        PffBlock pffBlock = new PffBlock(pffBlockSettings);
        return pffBlock;
    }

}
