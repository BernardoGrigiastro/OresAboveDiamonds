package dvi.oresabovediamondsfabric.common.main;

import dvi.oresabovediamondsfabric.common.main.config.OADConfig;
import dvi.oresabovediamondsfabric.common.main.items.ModObjects;
import dvi.oresabovediamondsfabric.common.main.world.OreGeneration;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.Toml4jConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class OresAboveDiamondsFabric implements ModInitializer {

    public static final String MOD_ID = "oresabovediamondsfabric";

    public static OADConfig config;

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "oresabovediamonds"),
            () -> new ItemStack(Blocks.COBBLESTONE));

    @Override
    public void onInitialize() {
        AutoConfig.register(OADConfig.class, GsonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(OADConfig.class).getConfig();

        ModObjects.init();
        OreGeneration.init();
    }
}