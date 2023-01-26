package me.carlettos.chilemod.block;

import me.carlettos.chilemod.block.CLFlowerBlock.FlowerType;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SandBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class BloomingSand extends SandBlock {
    public BloomingSand() {
        super(0xDBD3A0, Settings.of(Material.AGGREGATE, MapColor.PALE_YELLOW).strength(0.5f).sounds(BlockSoundGroup.SAND).ticksRandomly());
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.hasRain(pos.up())) {
            this.bloom(state, world, pos, random);
        }
    }
    
    public void bloom(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextFloat() > 0.3f) {
            return;
        }
        if (state.getBlock().equals(CLBlocks.BLOOMING_SAND)) {
            world.setBlockState(pos, CLBlocks.BLOOMING_SAND_STAGE_1.getDefaultState());
        } else if (state.getBlock().equals(CLBlocks.BLOOMING_SAND_STAGE_1)) {
            world.setBlockState(pos, CLBlocks.BLOOMING_SAND_STAGE_2.getDefaultState());
        } else { // asume stage 2
            world.setBlockState(pos.up(), FlowerType.values()[random.nextInt(FlowerType.values().length)].getBlock().getDefaultState());
        }
    }
}
