package me.yes_yes.init;

import me.filthyweebdegenerate.pogadditions.PogAdditions;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInitYES {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PogAdditions.MOD_ID);

    //goto ItemInitYES.java
    public static final RegistryObject<Block> Example = BLOCKS.register("example",
            () -> new Block(AbstractBlock.Properties
                    .create(Material.IRON, MaterialColor.BLACK)
                    .hardnessAndResistance(15f, 30f)
                    .harvestTool(ToolType.PICKAXE)
                    .setRequiresTool()
                    .sound(SoundType.BASALT)));
}
