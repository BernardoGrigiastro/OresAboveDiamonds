package dvi.oresabovediamondsfabric.common.main.items;

import dvi.oresabovediamondsfabric.common.main.OresAboveDiamondsFabric;
import dvi.oresabovediamondsfabric.common.main.lists.AmethystArmorMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.fabric.impl.registry.sync.FabricRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.LongStream;

public class ModObjects {

    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();
    public static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();

    public static final ArmorMaterial AMETHYST_ARMOR_MATERIAL = new AmethystArmorMaterial();

    public static final Block AMETHYST_BLOCK = addObject("amethyst_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block AMETHYST_ORE = addObject("amethyst_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(20f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block NETHER_AMETHYST_ORE = addObject("nether_amethyst_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(20f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block END_AMETHYST_ORE = addObject("end_amethyst_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(20f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));

    //public static final Item AMETHYST_HELMET = addObject("amethyst_helmet", new AmethystArmor(A))

    public static final Block BLACK_OPAL_BLOCK = addObject("black_opal_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(25f).resistance(100f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block BLACK_OPAL_ORE = addObject("black_opal_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(25f).resistance(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block NETHER_BLACK_OPAL_ORE = addObject("nether_black_opal_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(25f).resistance(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block END_BLACK_OPAL_ORE = addObject("end_black_opal_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(25f).resistance(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));


    public static final Item AMETHYST = addObject("amethyst", new Item(group()));
    public static final Item AMETHYST_PICKAXE = addObject("amethyst_pickaxe", new Item(group()));
    public static final Item BLACK_OPAL = addObject("black_opal", new Item(group()));
    public static final Item BLACK_OPAL_PICKAXE = addObject("black_opal_pickaxe", new Item(group()));



    private static <T extends Item> T addObject(String name, T item) {
        ITEMS.put(item, new Identifier(OresAboveDiamondsFabric.MOD_ID, name));
        return item;
    }

    private static <T extends Block> T addObject(String name, T block) {
        BLOCKS.put(block, new Identifier(OresAboveDiamondsFabric.MOD_ID, name));
        ITEMS.put(new BlockItem(block, group()), BLOCKS.get(block));
        return block;
    }

    private static <T extends Block> T addRareObject(String name, T block, Rarity rarity) {
        BLOCKS.put(block, new Identifier(OresAboveDiamondsFabric.MOD_ID, name));
        ITEMS.put(new BlockItem(block, group().rarity(rarity)), BLOCKS.get(block));
        return block;
    }

    private static Item.Settings group() {
        return new Item.Settings().group(OresAboveDiamondsFabric.ITEM_GROUP);
    }


    public static void init() {
        ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
        BLOCKS.keySet().forEach(block -> Registry.register(Registry.BLOCK, BLOCKS.get(block), block));
    }
}