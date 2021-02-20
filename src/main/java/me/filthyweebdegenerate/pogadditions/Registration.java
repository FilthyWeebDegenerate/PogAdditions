package me.filthyweebdegenerate.pogadditions;

import me.filthyweebdegenerate.pogadditions.init.*;
import me.yes_yes.init.*;
import net.minecraftforge.eventbus.api.IEventBus;

public class Registration {
    public static void register(IEventBus bus) {
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        ToolInit.TOOL_ITEMS.register(bus);
        ArmorInit.ARMOR_ITEMS.register(bus);
        FoodInit.FOOD_ITEMS.register(bus);
    }
    public static void registerBep(IEventBus bus) {}

    public static void registerYES(IEventBus bus) {
        ToolInitYES.TOOL_ITEMS.register(bus);
        FoodInitYES.FOOD_ITEMS.register(bus);
        BlockInitYES.BLOCKS.register(bus);
        ItemInitYES.ITEMS.register(bus);
    }
}
