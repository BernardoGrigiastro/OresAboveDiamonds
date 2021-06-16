package dvi.oresabovediamondsfabric.common.main.world;

import dvi.oresabovediamondsfabric.common.main.OresAboveDiamondsFabric;
import dvi.oresabovediamondsfabric.common.main.items.ModObjects;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class OreGeneration {

    private static final Map<ConfiguredFeature<?, ?>, Identifier> CONFIGURED_FEATURES = new LinkedHashMap<>();

    public static final ConfiguredFeature<?, ?> AMETHYST_ORE = createConfiguredFeature("amethyst_ore", Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModObjects.AMETHYST_ORE.getDefaultState(), OresAboveDiamondsFabric.config.ORES.amethyst_max_vein_size)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(OresAboveDiamondsFabric.config.ORES.amethyst_max_spawn_height_overworld))))).spreadHorizontally().applyChance(OresAboveDiamondsFabric.config.ORES.amethyst_times_rarer));
    public static final ConfiguredFeature<?, ?> BLACK_OPAL_ORE = createConfiguredFeature("black_opal_ore", Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModObjects.BLACK_OPAL_ORE.getDefaultState(), OresAboveDiamondsFabric.config.ORES.amethyst_max_vein_size)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(OresAboveDiamondsFabric.config.ORES.black_opal_max_spawn_height_overworld))))).spreadHorizontally().applyChance(OresAboveDiamondsFabric.config.ORES.black_opal_times_rarer));

    public static final ConfiguredFeature<?, ?> AMETHYST_ORE_NETHER = createConfiguredFeature("nether_amethyst_ore", Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER, ModObjects.NETHER_AMETHYST_ORE.getDefaultState(), (int) (OresAboveDiamondsFabric.config.ORES.amethyst_max_vein_size * OresAboveDiamondsFabric.config.ORES.nether_vein_multiplier)))).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(OresAboveDiamondsFabric.config.ORES.amethyst_max_spawn_height_nether))))).spreadHorizontally().applyChance(OresAboveDiamondsFabric.config.ORES.amethyst_times_rarer);
    public static final ConfiguredFeature<?, ?> BLACK_OPAL_ORE_NETHER = createConfiguredFeature("nether_black_opal_ore", Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_NETHER, ModObjects.NETHER_BLACK_OPAL_ORE.getDefaultState(), (int) (OresAboveDiamondsFabric.config.ORES.black_opal_max_vein_size * OresAboveDiamondsFabric.config.ORES.nether_vein_multiplier)))).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(OresAboveDiamondsFabric.config.ORES.black_opal_max_spawn_height_nether))))).spreadHorizontally().applyChance(OresAboveDiamondsFabric.config.ORES.black_opal_times_rarer);

    public static final ConfiguredFeature<?, ?> AMETHYST_ORE_END = createConfiguredFeature("end_amethyst_ore", Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), ModObjects.END_AMETHYST_ORE.getDefaultState(), (int) (OresAboveDiamondsFabric.config.ORES.amethyst_max_vein_size * OresAboveDiamondsFabric.config.ORES.end_vein_multiplier))).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(OresAboveDiamondsFabric.config.ORES.amethyst_max_spawn_height_end))))).spreadHorizontally().applyChance(OresAboveDiamondsFabric.config.ORES.amethyst_times_rarer));
    public static final ConfiguredFeature<?, ?> BLACK_OPAL_ORE_END = createConfiguredFeature("end_black_opal_ore", Feature.ORE.configure(new OreFeatureConfig(new BlockMatchRuleTest(Blocks.END_STONE), ModObjects.END_BLACK_OPAL_ORE.getDefaultState(), (int) (OresAboveDiamondsFabric.config.ORES.black_opal_max_vein_size * OresAboveDiamondsFabric.config.ORES.end_vein_multiplier))).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(OresAboveDiamondsFabric.config.ORES.black_opal_max_spawn_height_end))))).spreadHorizontally().applyChance(OresAboveDiamondsFabric.config.ORES.black_opal_times_rarer));

    private static <T extends FeatureConfig> ConfiguredFeature<T, ?> createConfiguredFeature(String name, ConfiguredFeature<T, ?> configuredFeature) {
        CONFIGURED_FEATURES.put(configuredFeature, new Identifier(OresAboveDiamondsFabric.MOD_ID, name));
        return configuredFeature;
    }

    public static int randomValue(int rand) {
        Random random = new Random();

        return random.nextInt(rand) + 1;
    }

    public static void init()
    {
        CONFIGURED_FEATURES.keySet().forEach(configuredFeature -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, CONFIGURED_FEATURES.get(configuredFeature), configuredFeature));

        if(OresAboveDiamondsFabric.config.ORES.spawn_amethyst_overworld){
            RegistryKey<ConfiguredFeature<?,?>> AMETHYST_GEN = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresAboveDiamondsFabric.MOD_ID,"amethyst_ore"));
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, AMETHYST_GEN);
        }

        if(OresAboveDiamondsFabric.config.ORES.spawn_black_opal_overworld)
        {
            RegistryKey<ConfiguredFeature<?,?>> BLACK_OPAL_GEN = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresAboveDiamondsFabric.MOD_ID,"black_opal_ore"));
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, BLACK_OPAL_GEN);
        }
        if(OresAboveDiamondsFabric.config.ORES.spawn_amethyst_nether)
        {
            RegistryKey<ConfiguredFeature<?,?>> AMETHYST_GEN_NETHER = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresAboveDiamondsFabric.MOD_ID,"nether_amethyst_ore"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, AMETHYST_GEN_NETHER);
        }
        if(OresAboveDiamondsFabric.config.ORES.spawn_black_opal_nether)
        {
            RegistryKey<ConfiguredFeature<?,?>> BLACK_OPAL_GEN_NETHER = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresAboveDiamondsFabric.MOD_ID,"nether_black_opal_ore"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, BLACK_OPAL_GEN_NETHER);
        }
        if(OresAboveDiamondsFabric.config.ORES.spawn_amethyst_end)
        {
            RegistryKey<ConfiguredFeature<?,?>> AMETHYST_GEN_END = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresAboveDiamondsFabric.MOD_ID,"end_amethyst_ore"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, AMETHYST_GEN_END);
        }
        if(OresAboveDiamondsFabric.config.ORES.spawn_black_opal_end)
        {
            RegistryKey<ConfiguredFeature<?,?>> BLACK_OPAL_GEN_END = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresAboveDiamondsFabric.MOD_ID,"end_black_opal_ore"));
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, BLACK_OPAL_GEN_END);
        }
    }
}