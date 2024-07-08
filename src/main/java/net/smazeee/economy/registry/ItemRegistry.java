package net.smazeee.economy.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.smazeee.economy.BasicEconomy;
import net.smazeee.economy.objects.items.MoneyBase;

import java.util.ArrayList;
import java.util.List;

public class ItemRegistry {
    public static final List<Item> ITEMS = new ArrayList<>();

    /* COINS */
    public static final Item COPPER_COIN = new MoneyBase("copper_coin", false);
    public static final Item COPPER_COIN_STACK = new MoneyBase("copper_coin_stack", true);
    public static final Item IRON_COIN = new MoneyBase("iron_coin", false);
    public static final Item IRON_COIN_STACK = new MoneyBase("iron_coin_stack", true);
    public static final Item GOLD_COIN = new MoneyBase("gold_coin", false);
    public static final Item GOLD_COIN_STACK = new MoneyBase("gold_coin_stack", true);
    public static final Item DIAMOND_COIN = new MoneyBase("diamond_coin", false);
    public static final Item DIAMOND_COIN_STACK = new MoneyBase("diamond_coin_stack", true);

    /* BILLS */
    public static final Item GREEN_BILL = new MoneyBase("green_bill", false);
    public static final Item GREEN_BILL_STACK = new MoneyBase("green_bill_stack", true);
    public static final Item YELLOW_BILL = new MoneyBase("yellow_bill", false);
    public static final Item YELLOW_BILL_STACK = new MoneyBase("yellow_bill_stack", true);
    public static final Item RED_BILL = new MoneyBase("red_bill", false);
    public static final Item RED_BILL_STACK = new MoneyBase("red_bill_stack", true);
    public static final Item PURPLE_BILL = new MoneyBase("purple_bill", false);
    public static final Item PURPLE_BILL_STACK = new MoneyBase("purple_bill_stack", true);
}
