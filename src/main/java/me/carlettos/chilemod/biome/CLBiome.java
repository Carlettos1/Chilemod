package me.carlettos.chilemod.biome;

import java.util.function.Consumer;

import com.mojang.datafixers.util.Pair;

import me.carlettos.chilemod.ChileMod;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil.NoiseHypercube;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.MaterialRules.MaterialRule;
import terrablender.api.ParameterUtils.ParameterPointListBuilder;
import terrablender.api.Region;
import terrablender.api.RegionType;

public class CLBiome {
    private MaterialRule rules;
    private ParameterPointListBuilder ppbuilder = new ParameterPointListBuilder();
    private final RegistryKey<Biome> biomeKey;
    private final int weight;
    
    public CLBiome(int weight, String path) {
        this.weight = weight;
        this.biomeKey = RegistryKey.of(RegistryKeys.BIOME, ChileMod.id(path));
    }
    
    public ParameterPointListBuilder getParameterBuilder() {
        return this.ppbuilder;
    }
    
    public RegistryKey<Biome> getKey(){
        return this.biomeKey;
    }
    
    public MaterialRule getRules() {
        return MaterialRules.condition(MaterialRules.biome(this.getKey()), this.rules);
    }
    
    public void setRules(MaterialRule rules) {
        this.rules = rules;
    }
    
    public Region getRegion(int id) {
        return new Region(ChileMod.id(RegionType.OVERWORLD.name().toLowerCase() + "_" + id), RegionType.OVERWORLD, weight) {
            @Override
            public void addBiomes(Registry<Biome> registry,
                    Consumer<Pair<NoiseHypercube, RegistryKey<Biome>>> mapper) {
                CLBiome.this.getParameterBuilder().build().forEach(c -> mapper.accept(Pair.of(c, CLBiome.this.getKey())));
            }
        };
    }
}
