package lanrhyme.github.registry;

import lanrhyme.github.LanRhymesCasualMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public  static ItemGroup CITRINE = FabricItemGroup.builder()
            .displayName(Text.translatable("itemgroup.lanrhymes-casual-mod.citrine"))
            .icon(() -> new ItemStack(ModItems.CITRINE))
            .entries((context, entries) -> {
                entries.add(ModItems.CITRINE);
            })
            .build();
    public static void registerModItemGroup() {
        LanRhymesCasualMod.LOGGER.debug("Registering mod item group for " + LanRhymesCasualMod.MOD_ID);
    }

}
