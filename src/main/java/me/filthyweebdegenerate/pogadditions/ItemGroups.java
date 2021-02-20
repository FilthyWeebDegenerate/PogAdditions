package me.filthyweebdegenerate.pogadditions;

import me.filthyweebdegenerate.pogadditions.init.ArmorInit;
import me.filthyweebdegenerate.pogadditions.init.ItemInit;
import me.filthyweebdegenerate.pogadditions.init.ToolInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
    public static final ItemGroup pogAdditionsItems = new PogAdditionsItems("pog_additions_items");
    public static final ItemGroup pogAdditionsTools = new PogAdditionsTools("pog_additions_tools");
    public static final ItemGroup pogAdditionsArmor = new PogAdditionsArmor("pog_additions_armor");
    public static final ItemGroup pogAdditionsFood = new PogAdditionsFood("pog_additions_food");

    private static class PogAdditionsItems extends ItemGroup {

        public PogAdditionsItems (String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ItemInit.SUPREME_DUST.get().getDefaultInstance();
        }
    }

    private static class PogAdditionsTools extends ItemGroup {

        public PogAdditionsTools (String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ToolInit.superiorSword.get().getDefaultInstance();
        }
    }

    private static class PogAdditionsArmor extends ItemGroup {

        public PogAdditionsArmor (String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ArmorInit.supremeChestPlate.get().getDefaultInstance();
        }
    }
    
    private static class PogAdditionsFood extends ItemGroup {
        
        public PogAdditionsFood (String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return ItemInit.SUPREME_DUST.get().getDefaultInstance();
        }
    }
}
