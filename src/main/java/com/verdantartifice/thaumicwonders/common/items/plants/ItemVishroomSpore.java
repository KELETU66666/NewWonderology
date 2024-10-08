package com.verdantartifice.thaumicwonders.common.items.plants;

import com.verdantartifice.thaumicwonders.ThaumicWonders;
import com.verdantartifice.thaumicwonders.common.blocks.BlocksTW;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.EnumPlantType;

public class ItemVishroomSpore extends ItemSeeds {
    public ItemVishroomSpore() {
        super(BlocksTW.VISHROOM_CROP, Blocks.GRASS);
        setRegistryName(ThaumicWonders.MODID, "vishroom_spore");
        setTranslationKey(ThaumicWonders.MODID + "." + this.getRegistryName().getPath());
        setCreativeTab(ThaumicWonders.CREATIVE_TAB);
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Cave;
    }
}
