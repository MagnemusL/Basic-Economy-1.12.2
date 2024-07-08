package net.smazeee.economy.objects.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.smazeee.economy.BasicEconomy;

import javax.annotation.Nullable;
import java.util.List;

import static net.smazeee.economy.registry.ItemRegistry.ITEMS;

public class MoneyBase extends Item {
    public boolean isStack = false;
    public MoneyBase(String name, boolean isStack) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(BasicEconomy.BASIC_ECONOMY);

        this.isStack = isStack;

        ITEMS.add(this);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        NBTTagCompound nbt = stack.getTagCompound();
        if (nbt == null) nbt = new NBTTagCompound();
        stack.setTagCompound(nbt);
        tooltip.add("Current ID: " + nbt.getInteger("id"));
        if (isStack)
            tooltip.add(2, "A stack is the equivalent of 8 of the original item.");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            ItemStack stack = playerIn.getHeldItem(handIn);
            NBTTagCompound nbt = stack.getTagCompound();
            if (playerIn.isSneaking()) {
                nbt.setInteger("id", nbt.getInteger("id") + 1);
                playerIn.sendMessage(new TextComponentString("ID: " + nbt.getInteger("id")));
            }
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }
}