package me.filthyweebdegenerate.pogadditions.tools;

import java.util.function.Supplier;

import me.filthyweebdegenerate.pogadditions.init.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public class Materials {
    public static final IItemTier supremeSword = new ToolMaterial(0, 420, 6942046.0f, 545.0f, 1, () -> Ingredient.fromItems(ItemInit.SUPREME_ESSENCE.get()));
    public static final IItemTier supremePickaxe = new ToolMaterial(69420, 42050, 875366.0f, 8.0f, 1, () -> Ingredient.fromItems(ItemInit.SUPREME_ESSENCE.get()));
    public static final IItemTier supremeAxe = new ToolMaterial(6942, 42040, 874767994.0f, 8.0f, 1, () -> Ingredient.fromItems(ItemInit.SUPREME_ESSENCE.get()));
    public static final IItemTier supremeShovel = new ToolMaterial(1, 42069, 546.0f, 69.0f, 1, () -> Ingredient.fromItems(ItemInit.SUPREME_ESSENCE.get()));

    public static final IItemTier superiorSword = new ToolMaterial(0, 6942069, 6942069.0f, 69694204206969.0f, 1, () -> Ingredient.fromItems(ItemInit.SUPREME_ESSENCE.get()));

    private static class ToolMaterial implements IItemTier {
        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repair;

        public ToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> supplier) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = (float)attackDamage;
            this.enchantability = enchantability;
            this.repair = new LazyValue<Ingredient>(supplier);
        }

        @Override
        public int getMaxUses() {
            return maxUses;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repair.getValue();
        }
    }
}
