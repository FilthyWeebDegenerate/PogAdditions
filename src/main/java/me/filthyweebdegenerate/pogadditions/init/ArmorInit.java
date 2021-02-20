package me.filthyweebdegenerate.pogadditions.init;

import me.filthyweebdegenerate.pogadditions.ItemGroups;
import me.filthyweebdegenerate.pogadditions.PogAdditions;
import me.filthyweebdegenerate.pogadditions.init.armor.ArmorMaterials;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorInit {
    public static final DeferredRegister<Item> ARMOR_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PogAdditions.MOD_ID);
    
    public static final RegistryObject<ArmorItem> bobuxHelmet = ARMOR_ITEMS.register("bobux_helmet", () -> new ArmorItem(ArmorMaterials.BOBUX, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.pogAdditionsArmor)));
    public static final RegistryObject<ArmorItem> bobuxChestPlate = ARMOR_ITEMS.register("bobux_chest_plate", () -> new ArmorItem(ArmorMaterials.BOBUX, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.pogAdditionsArmor)));
    public static final RegistryObject<ArmorItem> bobuxLeggings = ARMOR_ITEMS.register("bobux_leggings", () -> new ArmorItem(ArmorMaterials.BOBUX, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.pogAdditionsArmor)));
    public static final RegistryObject<ArmorItem> bobuxBoots = ARMOR_ITEMS.register("bobux_boots", () -> new ArmorItem(ArmorMaterials.BOBUX, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.pogAdditionsArmor)));
    public static final RegistryObject<ArmorItem> supremeHelmet = ARMOR_ITEMS.register("supreme_helmet", () -> new ArmorItem(ArmorMaterials.SUPREME, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroups.pogAdditionsArmor)));
    public static final RegistryObject<ArmorItem> supremeChestPlate = ARMOR_ITEMS.register("supreme_chest_plate", () -> new ArmorItem(ArmorMaterials.SUPREME, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroups.pogAdditionsArmor)));
    public static final RegistryObject<ArmorItem> supremeLeggings = ARMOR_ITEMS.register("supreme_leggings", () -> new ArmorItem(ArmorMaterials.SUPREME, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroups.pogAdditionsArmor)));
    public static final RegistryObject<ArmorItem> supremeBoots = ARMOR_ITEMS.register("supreme_boots", () -> new ArmorItem(ArmorMaterials.SUPREME, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroups.pogAdditionsArmor)));
}
