package net.fabricmc.chaos.item;

import net.fabricmc.chaos.ChaosCrazyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import java.rmi.registry.Registry;

public class ModItems {

    public static final Item Monk_Stick = registerdItem("monk_stick", new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerdItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChaosCrazyMod.MOD_ID, name), item)
    }

    public static void registeredItems(){
        ChaosCrazyMod.LOGGER.info("Registering Mod Items for" + ChaosCrazyMod.MOD_ID);
    }
}
