package dvi.oresabovediamondsfabric.common.main;

import dvi.oresabovediamondsfabric.common.main.config.OADConfig;
import dvi.oresabovediamondsfabric.common.main.items.ModObjects;
import dvi.oresabovediamondsfabric.common.main.world.OreGeneration;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class OresAboveDiamondsFabric implements ModInitializer {

    public static final String MOD_ID = "oresabovediamondsfabric";

    public static OADConfig config;

    private static final Identifier MINESHAFT_CHEST_LOOT_TABLE_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier BASTION_TREASURE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BURIED_TREASURE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID_LOOT_TABLE_ID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier END_CITY_LOOT_TABLE_ID = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier TEMPLE_CHEST_LOOT_TABLE_ID = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier NETHER_BRIDGE_LOOT_TABLE_ID = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier SHIPWRECK_LOOT_TABLE_ID = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier TOOLSMITH_CHEST_LOOT_TABLE_ID = new Identifier("minecraft", "chests/village/village_toolsmith");
    private static final Identifier WEAPONSMITH_CHEST_LOOT_TABLE_ID = new Identifier("minecraft", "chests/village/village_weaponsmith");

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "oresabovediamonds"),
            () -> new ItemStack(ModObjects.AMETHYST));

    @Override
    public void onInitialize() {
        AutoConfig.register(OADConfig.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(OADConfig.class).getConfig();

        ModObjects.init();
        OreGeneration.init();

//        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
//            if (MINESHAFT_CHEST_LOOT_TABLE_ID.equals(id)) {
//                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
//                        .rolls(ConstantLootNumberProvider.create(1))
//                        .with(ItemEntry.builder());
//
//                table.pool(poolBuilder);
//            }
//        });
    }
}