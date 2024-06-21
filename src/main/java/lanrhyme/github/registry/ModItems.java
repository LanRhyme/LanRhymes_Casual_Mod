package lanrhyme.github.registry;

import lanrhyme.github.LanRhymesCasualMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()));
    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup>... itemGroups) {
        Item regItem = Registry.register(Registries.ITEM, new Identifier(LanRhymesCasualMod.MOD_ID, name), item);
        for (RegistryKey<ItemGroup> itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(regItem));
        }
        return regItem;
    }
    public static  void registerModItems() {
        LanRhymesCasualMod.LOGGER.debug("Registering mod items for" + LanRhymesCasualMod.MOD_ID);;
    }

    private static class FabricItemSettings extends Item.Settings {
    }
}
