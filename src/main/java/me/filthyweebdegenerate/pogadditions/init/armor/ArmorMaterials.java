package me.filthyweebdegenerate.pogadditions.init.armor;

import me.filthyweebdegenerate.pogadditions.PogAdditions;
import me.filthyweebdegenerate.pogadditions.init.ItemInit;
import me.yes_yes.init.ItemInitYES;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ArmorMaterials implements IArmorMaterial {


    BOBUX("bobux", 300, new int[] {42, 42, 400, 42}, 1, null, 72132.0f, 42.0f, () -> Ingredient.fromItems(ItemInit.BOBUX.get())),
    SUPREME("supreme", 433, new int[] {69, 69, 420, 69}, 1, null, 7834526783452.0f, 69.0f, () -> Ingredient.fromItems(ItemInit.SUPREME_ESSENCE.get())),
    SUPERIOR("superior", 456353465, new int[] {420, 42069, 42069, 420}, 1, null, 43563457834254523.0f, 420696942.0f, () -> Ingredient.fromItems(ItemInit.SUPREME_ESSENCE.get()))
    ;

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairMaterialLazy;

    private ArmorMaterials(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, float knockbackResistanceIn, Supplier<Ingredient> repairMaterialSupplier) {
        this.name = PogAdditions.MOD_ID + ":" + nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountArrayIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.knockbackResistance = knockbackResistanceIn;
        this.repairMaterialLazy = Lazy.concurrentOf(repairMaterialSupplier);
    }


    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterialLazy.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
