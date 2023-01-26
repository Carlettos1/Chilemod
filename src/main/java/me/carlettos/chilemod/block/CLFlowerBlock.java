package me.carlettos.chilemod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class CLFlowerBlock extends FlowerBlock {
    public CLFlowerBlock(StatusEffect se) {
        super(se, 8, Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).offsetType(AbstractBlock.OffsetType.XZ));
    }
    
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos) || floor.isIn(BlockTags.SAND);
    }
    
    public static enum FlowerType {
        AÑAÑUCA_AMARILLA, AÑAÑUCA_ROJA, HUILLE, PATA_DE_GUANACO, SUSPIRO_LILA, SUSPIRO_CELESTE, ONAGRA, MALVILLA, SUNCHU, LIRIO_AMARILLO, OREJA_DE_ZORRO;
        
        public CLFlowerBlock getBlock() {
            return switch (this) {
                case AÑAÑUCA_AMARILLA -> CLBlocks.AÑAÑUCA_AMARILLA;
                case AÑAÑUCA_ROJA -> CLBlocks.AÑAÑUCA_ROJA;
                case HUILLE -> CLBlocks.HUILLE;
                case PATA_DE_GUANACO -> CLBlocks.PATA_DE_GUANACO;
                case SUSPIRO_LILA -> CLBlocks.SUSPIRO_LILA;
                case SUSPIRO_CELESTE -> CLBlocks.SUSPIRO_CELESTE;
                case ONAGRA -> CLBlocks.ONAGRA;
                case MALVILLA -> CLBlocks.MALVILLA;
                case SUNCHU -> CLBlocks.SUNCHU;
                case LIRIO_AMARILLO -> CLBlocks.LIRIO_AMARILLO;
                case OREJA_DE_ZORRO -> CLBlocks.OREJA_DE_ZORRO;
            };
        }
    }
}
