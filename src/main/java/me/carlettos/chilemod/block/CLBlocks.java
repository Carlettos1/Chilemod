package me.carlettos.chilemod.block;

import me.carlettos.chilemod.ChileMod;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class CLBlocks {
    public static final Block BLOOMING_SAND = new BloomingSand();
    public static final Block BLOOMING_SAND_STAGE_1 = new BloomingSand();
    public static final Block BLOOMING_SAND_STAGE_2 = new BloomingSand();
    public static final CLFlowerBlock AÑAÑUCA_AMARILLA = new CLFlowerBlock(StatusEffects.GLOWING);
    public static final CLFlowerBlock AÑAÑUCA_ROJA = new CLFlowerBlock(StatusEffects.REGENERATION);
    public static final CLFlowerBlock HUILLE = new CLFlowerBlock(StatusEffects.LEVITATION);
    public static final CLFlowerBlock PATA_DE_GUANACO = new CLFlowerBlock(StatusEffects.SPEED);
    public static final CLFlowerBlock SUSPIRO_LILA = new CLFlowerBlock(StatusEffects.REGENERATION);
    public static final CLFlowerBlock SUSPIRO_CELESTE = new CLFlowerBlock(StatusEffects.WATER_BREATHING);
    public static final CLFlowerBlock ONAGRA = new CLFlowerBlock(StatusEffects.GLOWING);
    public static final CLFlowerBlock MALVILLA = new CLFlowerBlock(StatusEffects.SLOW_FALLING);
    public static final CLFlowerBlock SUNCHU = new CLFlowerBlock(StatusEffects.STRENGTH);
    public static final CLFlowerBlock LIRIO_AMARILLO = new CLFlowerBlock(StatusEffects.SATURATION);
    public static final CLFlowerBlock OREJA_DE_ZORRO = new CLFlowerBlock(StatusEffects.BAD_OMEN);
    
    public static final void register() {
        block(BLOOMING_SAND, "BLOOMING_SAND");
        block(BLOOMING_SAND_STAGE_1, "BLOOMING_SAND_STAGE_1");
        block(BLOOMING_SAND_STAGE_2, "BLOOMING_SAND_STAGE_2");
        
        block(AÑAÑUCA_AMARILLA, "AnAnUCA_AMARILLA");
        block(AÑAÑUCA_ROJA, "AnAnUCA_ROJA");
        block(HUILLE, "HUILLE");
        block(PATA_DE_GUANACO, "PATA_DE_GUANACO");
        block(SUSPIRO_LILA, "SUSPIRO_LILA");
        block(SUSPIRO_CELESTE, "SUSPIRO_CELESTE");
        block(ONAGRA, "ONAGRA");
        block(MALVILLA, "MALVILLA");
        block(SUNCHU, "SUNCHU");
        block(LIRIO_AMARILLO, "LIRIO_AMARILLO");
        block(OREJA_DE_ZORRO, "OREJA_DE_ZORRO");
    }
    
    private static final void block(Block block, String name) {
        Registry.register(Registries.BLOCK, ChileMod.id(name.toLowerCase()), block);
    }
}
