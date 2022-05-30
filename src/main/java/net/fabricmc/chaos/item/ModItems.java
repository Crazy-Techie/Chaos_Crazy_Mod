package net.fabricmc.chaos.item;

import net.fabricmc.chaos.ChaosMonkMod;
import net.fabricmc.chaos.item.custom.modDeathStickItem;
import net.fabricmc.chaos.item.custom.modSiphonStickItem;
import net.fabricmc.chaos.item.custom.modToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item Siphon_Monk_Stick = registeredItem("siphon_monk_stick",
            new modSiphonStickItem(modToolMaterials.MONK, 2, 1f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item Death_Monk_Stick = registeredItem("death_monk_stick",
            new modDeathStickItem(modToolMaterials.MONK, 0, 2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registeredItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChaosMonkMod.MOD_ID, name), item);
    }

    public static void registeredItems(){
        ChaosMonkMod.LOGGER.info("Registering Mod Items for" + ChaosMonkMod.MOD_ID);
    }
}
