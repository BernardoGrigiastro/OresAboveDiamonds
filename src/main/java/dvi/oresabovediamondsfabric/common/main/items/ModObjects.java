package dvi.oresabovediamondsfabric.common.main.items;

import dvi.oresabovediamondsfabric.common.main.OresAboveDiamondsFabric;
import dvi.oresabovediamondsfabric.common.main.tools.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModObjects {

    public static final Map<Item, Identifier> ITEMS = new LinkedHashMap<>();
    public static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();

    //GEMS

    public static final Item AMETHYST = addObject("amethyst", new Item(group()));
    public static final Item BLACK_OPAL = addObject("black_opal", new Item(group()));

    //TOOLS

    public static final Item AMETHYST_SWORD = addObject("amethyst_sword", new SwordItem(ModMaterials.AMETHYST_MATERIAL, 3, -2.4f, group()));
    public static final Item AMETHYST_AXE = addObject("amethyst_axe", new AmethystAxeItem(ModMaterials.AMETHYST_MATERIAL, 5, -3f, group()));
    public static final Item AMETHYST_PICKAXE = addObject("amethyst_pickaxe", new AmethystPickaxeItem(ModMaterials.AMETHYST_MATERIAL, 1, -2.8f, group()));
    public static final Item AMETHYST_SHOVEL = addObject("amethyst_shovel", new ShovelItem(ModMaterials.AMETHYST_MATERIAL, 2, -3f, group()));
    public static final Item AMETHYST_HOE = addObject("amethyst_hoe", new AmethystHoeItem(ModMaterials.AMETHYST_MATERIAL, -4, 1f, group()));
    public static final Item BLACK_OPAL_SWORD = addObject("black_opal_sword", new SwordItem(ModMaterials.BLACK_OPAL_MATERIAL, 3, -2.4f, group()));
    public static final Item BLACK_OPAL_AXE = addObject("black_opal_axe", new BlackOpalAxeItem(ModMaterials.BLACK_OPAL_MATERIAL, 5, -3f, group()));
    public static final Item BLACK_OPAL_PICKAXE = addObject("black_opal_pickaxe", new BlackOpalPickaxeItem(ModMaterials.BLACK_OPAL_MATERIAL, 1, -2.8f, group()));
    public static final Item BLACK_OPAL_SHOVEL = addObject("black_opal_shovel", new ShovelItem(ModMaterials.BLACK_OPAL_MATERIAL, 2, -3f, group()));
    public static final Item BLACK_OPAL_HOE = addObject("black_opal_hoe", new BlackOpalHoeItem(ModMaterials.BLACK_OPAL_MATERIAL, -5, 2f, group()));
    public static final Item NETHERITE_OPAL_SWORD = addObject("netherite_opal_sword", new SwordItem(ModMaterials.NETHERITE_OPAL_MATERIAL, 3, -2.4f, group()));
    public static final Item NETHERITE_OPAL_AXE = addObject("netherite_opal_axe", new NetheriteOpalAxeItem(ModMaterials.NETHERITE_OPAL_MATERIAL, 5, -3f, group()));
    public static final Item NETHERITE_OPAL_PICKAXE = addObject("netherite_opal_pickaxe", new NetheriteOpalPickaxeItem(ModMaterials.NETHERITE_OPAL_MATERIAL, 1, -2.8f, group()));
    public static final Item NETHERITE_OPAL_SHOVEL = addObject("netherite_opal_shovel", new ShovelItem(ModMaterials.NETHERITE_OPAL_MATERIAL, 2, -3f, group()));
    public static final Item NETHERITE_OPAL_HOE = addObject("netherite_opal_hoe", new NetheriteOpalHoeItem(ModMaterials.NETHERITE_OPAL_MATERIAL, -6, 2f, group()));

    //ARMOR

    public static final Item AMETHYST_HELMET = addObject("amethyst_helmet", new ArmorItem(ModMaterials.AMETHYST_ARMOR, EquipmentSlot.HEAD, group()));
    public static final Item AMETHYST_CHESTPLATE = addObject("amethyst_chestplate", new ArmorItem(ModMaterials.AMETHYST_ARMOR, EquipmentSlot.CHEST, group()));
    public static final Item AMETHYST_LEGGINGS = addObject("amethyst_leggings", new ArmorItem(ModMaterials.AMETHYST_ARMOR, EquipmentSlot.LEGS, group()));
    public static final Item AMETHYST_BOOTS = addObject("amethyst_boots", new ArmorItem(ModMaterials.AMETHYST_ARMOR, EquipmentSlot.FEET, group()));

    public static final Item BLACK_OPAL_HELMET = addObject("black_opal_helmet", new ArmorItem(ModMaterials.BLACK_OPAL_ARMOR, EquipmentSlot.HEAD, group()));
    public static final Item BLACK_OPAL_CHESTPLATE = addObject("black_opal_chestplate", new ArmorItem(ModMaterials.BLACK_OPAL_ARMOR, EquipmentSlot.CHEST, group()));
    public static final Item BLACK_OPAL_LEGGINGS = addObject("black_opal_leggings", new ArmorItem(ModMaterials.BLACK_OPAL_ARMOR, EquipmentSlot.LEGS, group()));
    public static final Item BLACK_OPAL_BOOTS = addObject("black_opal_boots", new ArmorItem(ModMaterials.BLACK_OPAL_ARMOR, EquipmentSlot.FEET, group()));

    public static final Item NETHERITE_OPAL_HELMET = addObject("netherite_opal_helmet", new ArmorItem(ModMaterials.NETHERITE_OPAL_ARMOR, EquipmentSlot.HEAD, group()));
    public static final Item NETHERITE_OPAL_CHESTPLATE = addObject("netherite_opal_chestplate", new ArmorItem(ModMaterials.NETHERITE_OPAL_ARMOR, EquipmentSlot.CHEST, group()));
    public static final Item NETHERITE_OPAL_LEGGINGS = addObject("netherite_opal_leggings", new ArmorItem(ModMaterials.NETHERITE_OPAL_ARMOR, EquipmentSlot.LEGS, group()));
    public static final Item NETHERITE_OPAL_BOOTS = addObject("netherite_opal_boots", new ArmorItem(ModMaterials.NETHERITE_OPAL_ARMOR, EquipmentSlot.FEET, group()));

    //BLOCKS

    public static final Block AMETHYST_ORE = addObject("amethyst_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(20f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block NETHER_AMETHYST_ORE = addObject("nether_amethyst_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(20f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block END_AMETHYST_ORE = addObject("end_amethyst_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(20f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));

    public static final Block BLACK_OPAL_ORE = addObject("black_opal_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 4)));
    public static final Block NETHER_BLACK_OPAL_ORE = addObject("nether_black_opal_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 4)));
    public static final Block END_BLACK_OPAL_ORE = addObject("end_black_opal_ore", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 4)));

    public static final Block AMETHYST_BLOCK = addObject("amethyst_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(50f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block BLACK_OPAL_BLOCK = addObject("black_opal_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(10f).resistance(100f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES, 4)));






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