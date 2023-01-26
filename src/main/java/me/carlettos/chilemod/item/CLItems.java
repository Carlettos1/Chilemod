package me.carlettos.chilemod.item;

import me.carlettos.chilemod.ChileMod;
import me.carlettos.chilemod.block.CLBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class CLItems {
    public static final BlockItem BLOOMING_SAND = new BlockItem(CLBlocks.BLOOMING_SAND, new Settings());
    public static final BlockItem BLOOMING_SAND_STAGE_1 = new BlockItem(CLBlocks.BLOOMING_SAND_STAGE_1, new Settings());
    public static final BlockItem BLOOMING_SAND_STAGE_2 = new BlockItem(CLBlocks.BLOOMING_SAND_STAGE_2, new Settings());
    public static final BlockItem AÑAÑUCA_AMARILLA = new BlockItem(CLBlocks.AÑAÑUCA_AMARILLA, new Settings());
    public static final BlockItem AÑAÑUCA_ROJA = new BlockItem(CLBlocks.AÑAÑUCA_ROJA, new Settings());
    public static final BlockItem HUILLE = new BlockItem(CLBlocks.HUILLE, new Settings());
    public static final BlockItem PATA_DE_GUANACO = new BlockItem(CLBlocks.PATA_DE_GUANACO, new Settings());
    public static final BlockItem SUSPIRO_LILA = new BlockItem(CLBlocks.SUSPIRO_LILA, new Settings());
    public static final BlockItem SUSPIRO_CELESTE = new BlockItem(CLBlocks.SUSPIRO_CELESTE, new Settings());
    public static final BlockItem ONAGRA = new BlockItem(CLBlocks.ONAGRA, new Settings());
    public static final BlockItem MALVILLA = new BlockItem(CLBlocks.MALVILLA, new Settings());
    public static final BlockItem SUNCHU = new BlockItem(CLBlocks.SUNCHU, new Settings());
    public static final BlockItem LIRIO_AMARILLO = new BlockItem(CLBlocks.LIRIO_AMARILLO, new Settings());
    public static final BlockItem OREJA_DE_ZORRO = new BlockItem(CLBlocks.OREJA_DE_ZORRO, new Settings());
    
    public static final void register() {
        item(BLOOMING_SAND, "BLOOMING_SAND");
        item(BLOOMING_SAND_STAGE_1, "BLOOMING_SAND_STAGE_1");
        item(BLOOMING_SAND_STAGE_2, "BLOOMING_SAND_STAGE_2");
        
        item(AÑAÑUCA_AMARILLA, "AnAnUCA_AMARILLA");
        item(AÑAÑUCA_ROJA, "AnAnUCA_ROJA");
        item(HUILLE, "HUILLE");
        item(PATA_DE_GUANACO, "PATA_DE_GUANACO");
        item(SUSPIRO_LILA, "SUSPIRO_LILA");
        item(SUSPIRO_CELESTE, "SUSPIRO_CELESTE");
        item(ONAGRA, "ONAGRA");
        item(MALVILLA, "MALVILLA");
        item(SUNCHU, "SUNCHU");
        item(LIRIO_AMARILLO, "LIRIO_AMARILLO");
        item(OREJA_DE_ZORRO, "OREJA_DE_ZORRO");
    }
    
    private static final void item(Item item, String name) {
        Registry.register(Registries.ITEM, ChileMod.id(name.toLowerCase()), item);
    }
}
