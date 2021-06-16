package dvi.oresabovediamondsfabric.common.main.config;

import dvi.oresabovediamondsfabric.common.main.OresAboveDiamondsFabric;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = OresAboveDiamondsFabric.MOD_ID)
public class OADConfig implements ConfigData{

    public Ores ORES = new Ores();

    @Config(name="Ores")
    public static class Ores implements ConfigData
    {
        @Comment("Chance for an Amethyst Ore vein to spawn in a chunk. 1 = As common as diamonds, 2 = Half as common as diamonds etc. Default = 3")
        public int amethyst_times_rarer = 3;
        @Comment("Chance for a Black Opal Ore vein to spawn in a chunk. Default = 9")
        public int black_opal_times_rarer = 9;
        @Comment("Maximum vein size for an Amethyst Ore vein. For reference, diamonds have a max vein size of 8. Default = 7")
        public int amethyst_max_vein_size = 7;
        @Comment("Maximum vein size for an Black Opal Ore vein. Default = 6")
        public int black_opal_max_vein_size = 6;

        @Comment("Maximum spawn height size for an Amethyst ore vein. Default = 16")
        public int amethyst_max_spawn_height_overworld = 16;
        @Comment("Maximum spawn height size for a Black Opal ore vein. Default = 16")
        public int black_opal_max_spawn_height_overworld = 16;

        @Comment("Maximum spawn height size for an Amethyst ore vein for the nether. Default = 128")
        public int amethyst_max_spawn_height_nether = 128;
        @Comment("Maximum spawn height size for a Black Opal ore vein for the nether. Default = 128")
        public int black_opal_max_spawn_height_nether = 128;
        @Comment("Maximum spawn height size for an Amethyst ore vein for the end. Default = 75")
        public int amethyst_max_spawn_height_end = 75;
        @Comment("Maximum spawn height size for a Black Opal ore vein for the end. Default = 75")
        public int black_opal_max_spawn_height_end = 75;

        @Comment("Spawn amethysts in the overworld? Default = true")
        public Boolean spawn_amethyst_overworld = true;
        @Comment("Spawn black opals in the overworld? Default = true")
        public Boolean spawn_black_opal_overworld = true;
        @Comment("Spawn amethysts in the nether? Default = false")
        public Boolean spawn_amethyst_nether = false;
        @Comment("Spawn black opals in the nether? Default = false")
        public Boolean spawn_black_opal_nether = false;
        @Comment("Spawn amethysts in the end? Default = false")
        public Boolean spawn_amethyst_end = false;
        @Comment("Spawn black opals in the end? Default = false")
        public Boolean spawn_black_opal_end = false;
    }

    public int amethyst_armor_toughness;
    public int black_opal_armor_toughness;
    public int netherite_opal_armor_toughness;

    public int amethyst_armor_knockback_resistance;
    public int black_opal_armor_knockback_resistance;
    public int netherite_opal_armor_knockback_resistance;

    public int amethyst_armor_durability;
    public int black_opal_armor_durability;
    public int netherite_opal_armor_durability;

    public int amethyst_helmet_armor;
    public int amethyst_chestplate_armor;
    public int amethyst_leggings_armor;
    public int amethyst_boots_armor;

    public int black_opal_helmet_armor;
    public int black_opal_chestplate_armor;
    public int black_opal_leggings_armor;
    public int black_opal_boots_armor;

    public int netherite_opal_helmet_armor;
    public int netherite_opal_chestplate_armor;
    public int netherite_opal_leggings_armor;
    public int netherite_opal_boots_armor;

    public int amethyst_attack_damage;
    public int amethyst_efficiency;
    public int amethyst_durability;

    public int black_opal_attack_damage;
    public int black_opal_efficiency;
    public int black_opal_durability;

    public int netherite_opal_attack_damage;
    public int netherite_opal_efficiency;
    public int netherite_opal_durability;

    public int amethyst_enchantability;
    public int black_opal_enchantability;
    public int netherite_opal_enchantability;

    public int nether_chance_multiplier;
    public int end_chance_multiplier;
    public int nether_vein_multiplier;
    public int end_vein_multiplier;

    public int enable_server_config_sync;
    public int send_config_sync_packet;



    //public  int overworld_ores;
    //public  int nether_ores;
    //public  int end_ores;
    public int old_combat_mechanics;
    public int ores_above_netherite;
    public int chest_loot;
}
