package me.filthyweebdegenerate.pogadditions.init;

import me.filthyweebdegenerate.pogadditions.ItemGroups;
import me.filthyweebdegenerate.pogadditions.PogAdditions;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PogAdditions.MOD_ID);
    
    public static final RegistryObject<Item> BOBUX = ITEMS.register("bobux", () -> new Item(new Item.Properties().group(ItemGroups.pogAdditionsItems)));
    public static final RegistryObject<Item> SUPREME_DUST = ITEMS.register("supreme_dust", () -> new Item(new Item.Properties().group(ItemGroups.pogAdditionsItems)));
    public static final RegistryObject<Item> SUPREME_ESSENCE = ITEMS.register("supreme_essence", () -> new Item(new Item.Properties().group(ItemGroups.pogAdditionsItems)));
    public static final RegistryObject<Item> SUPERIOR_DUST = ITEMS.register("superior_dust", () -> new Item(new Item.Properties().group(ItemGroups.pogAdditionsItems)));
    public static final RegistryObject<Item> SUPERIOR_ESSENCE = ITEMS.register("superior_essence", () -> new Item(new Item.Properties().group(ItemGroups.pogAdditionsItems)));
}
