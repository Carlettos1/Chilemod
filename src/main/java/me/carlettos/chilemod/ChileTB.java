package me.carlettos.chilemod;

import me.carlettos.chilemod.biome.Biomes;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.SurfaceRuleManager.RuleCategory;
import terrablender.api.TerraBlenderApi;

public class ChileTB implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        for (int i = 0; i < Biomes.biomes.size(); i++) {
            Regions.register(Biomes.biomes.get(i).getRegion(i));
            SurfaceRuleManager.addSurfaceRules(RuleCategory.OVERWORLD, ChileMod.ID, Biomes.biomes.get(i).getRules());
        }
    }
}
