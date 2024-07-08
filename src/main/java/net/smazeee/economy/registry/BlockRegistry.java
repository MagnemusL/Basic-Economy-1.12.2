package net.smazeee.economy.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.smazeee.economy.objects.blocks.CentralBankBlock;

import java.util.ArrayList;
import java.util.List;

public class BlockRegistry {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block CENTRAL_BANK = new CentralBankBlock("central_bank");
}
