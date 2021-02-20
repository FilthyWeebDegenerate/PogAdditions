package me.yes_yes.init;

import me.filthyweebdegenerate.pogadditions.ItemGroups;
import me.filthyweebdegenerate.pogadditions.PogAdditions;
import me.filthyweebdegenerate.pogadditions.tools.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolInitYES {
    public static final DeferredRegister<Item> TOOL_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PogAdditions.MOD_ID);
    
    public static final RegistryObject<Axe> supremeAxe = TOOL_ITEMS.register("supreme_axe", () -> new Axe(Materials.supremeAxe, 4.5f, new Item.Properties().group(ItemGroups.pogAdditionsTools)));
    public static final RegistryObject<Sword> supremeSword = TOOL_ITEMS.register("supreme_sword", () -> new Sword(Materials.supremeSword, 4.5f, new Item.Properties().group(ItemGroups.pogAdditionsTools)));
    public static final RegistryObject<Pickaxe> supremePickaxe = TOOL_ITEMS.register("supreme_pickaxe", () -> new Pickaxe(Materials.supremePickaxe, 4.6f, new Item.Properties().group(ItemGroups.pogAdditionsTools)));
    public static final RegistryObject<Shovel> supremeShovel = TOOL_ITEMS.register("supreme_shovel", () -> new Shovel (Materials.supremeShovel, 4.6f, new Item.Properties().group(ItemGroups.pogAdditionsTools)));


}
