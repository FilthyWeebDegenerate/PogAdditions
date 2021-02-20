package me.filthyweebdegenerate.pogadditions.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;

public class Pickaxe extends PickaxeItem{

    public Pickaxe(IItemTier material, float speed) {
        super(material, 1, speed, new Properties().group(ItemGroup.TOOLS).addToolType(ToolType.PICKAXE, material.getHarvestLevel()));
    }
    public Pickaxe(IItemTier material, float speed, Properties properties) {
        super(material, 1, speed, properties.addToolType(ToolType.PICKAXE, material.getHarvestLevel()));
    }
}