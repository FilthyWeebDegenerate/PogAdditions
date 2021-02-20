package me.yes_yes.init;

import me.filthyweebdegenerate.pogadditions.PogAdditions;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodInitYES {
    public static final DeferredRegister<Item> FOOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PogAdditions.MOD_ID);

    public static final RegistryObject<Item> example = FOOD_ITEMS.register("example",
            () -> new Item(new Item.Properties()
                    .food(new Food.Builder()
                            .effect(() -> new EffectInstance(Effects.HASTE, 12000, 255), 1.0f)
                            .effect(() -> new EffectInstance(Effects.ABSORPTION, 2000000000, 255), 1.0f)
                            .fastToEat()
                            .setAlwaysEdible()
                            .meat()
                            .hunger(69)
                            .saturation(69.0f)
                            .build())));
}
