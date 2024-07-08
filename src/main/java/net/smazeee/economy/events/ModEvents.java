package net.smazeee.economy.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod.EventBusSubscriber
public class ModEvents {
    @SubscribeEvent
    public static void onPlayerLogIn(PlayerEvent.PlayerLoggedInEvent event) {
        EntityPlayer player = event.player;
        player.sendMessage(new TextComponentString("To increase the ID, shift-right click with a coin, or a bill."));
        player.sendMessage(new TextComponentString("The ID can be shown when hovering over the item."));
        player.sendMessage(new TextComponentString("If hovering over a stack of a coin, or a bill, you will be able to see information about what a stack does."));
        player.sendMessage(new TextComponentString("-----------------------------------------------------"));
        player.sendMessage(new TextComponentString("Textures: Seentro, Superjulek, Smazeee."));
        player.sendMessage(new TextComponentString("Models: Superjulek."));
        player.sendMessage(new TextComponentString("Code: Smazeee."));
    }
}
