package net.lincforr.fabricmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.lincforr.fabricmod.FabricMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(FabricMod.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));

    public static final ItemGroup RANDOM = FabricItemGroupBuilder.build(
            new Identifier(FabricMod.MOD_ID, "random"), () -> new ItemStack(ModItems.EIGHT_BALL));
}
