package me.carlettos.chilemod.biome;

import java.util.ArrayList;

import me.carlettos.chilemod.block.CLBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.MaterialRules.MaterialRule;
import terrablender.api.ParameterUtils.Continentalness;
import terrablender.api.ParameterUtils.Depth;
import terrablender.api.ParameterUtils.Erosion;
import terrablender.api.ParameterUtils.Humidity;
import terrablender.api.ParameterUtils.Temperature;
import terrablender.api.ParameterUtils.Weirdness;

public class Biomes {
    public static final ArrayList<CLBiome> biomes = new ArrayList<>();
    public static final CLBiome DESIERTO_FLORIDO;
    
    static {
        DESIERTO_FLORIDO = new CLBiome(1, "desierto_florido");
        DESIERTO_FLORIDO.getParameterBuilder()
            .temperature(Temperature.HOT)
            .humidity(Humidity.ARID)
            .continentalness(Continentalness.span(Continentalness.MID_INLAND, Continentalness.FAR_INLAND))
            .erosion(Erosion.span(Erosion.EROSION_5, Erosion.EROSION_6))
            .depth(Depth.SURFACE)
            .weirdness(Weirdness.VALLEY);
        DESIERTO_FLORIDO.setRules(
                MaterialRules.condition(MaterialRules.surface(), MaterialRules.sequence(
                            MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR_WITH_SURFACE_DEPTH, from(CLBlocks.BLOOMING_SAND))
                        )));
        
        biomes.add(DESIERTO_FLORIDO);
    }
    
    public static MaterialRule from(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
