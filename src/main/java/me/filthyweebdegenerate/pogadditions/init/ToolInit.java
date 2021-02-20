package me.filthyweebdegenerate.pogadditions.init;

import me.filthyweebdegenerate.pogadditions.ItemGroups;
import me.filthyweebdegenerate.pogadditions.PogAdditions;
import me.filthyweebdegenerate.pogadditions.tools.Materials;
import me.filthyweebdegenerate.pogadditions.tools.Sword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolInit {
    public static final DeferredRegister<Item> TOOL_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PogAdditions.MOD_ID);

    public static final RegistryObject<Sword> superiorSword = TOOL_ITEMS.register("superior_sword", () -> new Sword(Materials.superiorSword, 69.0f, new Item.Properties().group(ItemGroups.pogAdditionsTools)));
}
