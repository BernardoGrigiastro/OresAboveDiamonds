package dvi.oresabovediamondsfabric.common.main.config;

import dvi.oresabovediamondsfabric.common.main.OresAboveDiamondsFabric;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = OresAboveDiamondsFabric.MOD_ID)
public class OADConfig implements ConfigData{

    public Ores ORES = new Ores();
    public Gear GEAR = new Gear();

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

        @Comment("If nether_ores is enabled, the spawn chance per chunk in the nether will be the chances set for amethyst_chance and black_opal_chance times this multiplier. The final rarity of each ore vein cannot be more common than diamonds. The default value tries to imitate the rarity in the overworld. Default = 1.35.")
        public double nether_chance_multiplier = 1.35;
        @Comment("If end_ores is enabled, the spawn chance per chunk in the end will be the chances set for amethyst_chance and black_opal_chance times this multiplier. The default value tries to imitate the rarity in the overworld. Default = 1.0")
        public double end_chance_multiplier = 1.0;
        @Comment("If nether_ores is enabled, multiplies the max vein size of nether ores. Rounds to the nearest integer. Final max vein size cannot exceed 64 for stability reasons. Default = 1.0")
        public double nether_vein_multiplier = 1.0;
        public double end_vein_multiplier = 1.0;
    }

    @Config(name="Gear")
    public static class Gear implements ConfigData{
        @Comment("Toughness for the Amethyst Armor Set. Toughness reduces the armor penetration of high damaging attacks. Default = 3")
        public int amethyst_armor_toughness = 3;
        @Comment("Toughness for the Black Opal Armor Set. Default = 4")
        public int black_opal_armor_toughness = 4;
        @Comment("Toughness for the Netherite Opal Armor Set. Default = 5")
        public int netherite_opal_armor_toughness = 5;

        @Comment("Knockback resistance for the Amethyst Armor Set. Knockback resistance reduces the amount of knockback the player takes. Default = 0")
        public int amethyst_armor_knockback_resistance = 0;
        @Comment("Knockback resistance for the Black Opal Armor Set. Default = 0")
        public int black_opal_armor_knockback_resistance = 0;
        @Comment("Knockback resistance for the Netherite Opal Armor Set. Default = 1")
        public int netherite_opal_armor_knockback_resistance = 1;

        @Comment("Base Durability for the Amethyst Armor Set. For reference, Diamond Armor has 33 base durability. Set to 0 for infinite durability. Default = 132")
        public int amethyst_armor_durability = 132;
        @Comment("Base Durability for the Black Opal Armor Set. Set 0 for infinite durability. Default = 0")
        public int black_opal_armor_durability = 0;
        @Comment("Base Durability for the Black Opal Armor Set. Set 0 for infinite durability. Default = 0")
        public int netherite_opal_armor_durability = 0;

        @Comment("Amethyst Helmet Armor Value. Indicates how many half-armor points the indicated armor will give. Default = 3")
        public int amethyst_helmet_armor = 3;
        @Comment("Amethyst Chestplate Armor Value. Default = 8")
        public int amethyst_chestplate_armor = 8;
        @Comment("Amethyst Leggings Armor Value. Default = 7")
        public int amethyst_leggings_armor = 7;
        @Comment("Amethyst Boots Armor Value. Default = 3")
        public int amethyst_boots_armor = 3;

        @Comment("Black Opal Helmet Armor Value. Default = 3")
        public int black_opal_helmet_armor = 3;
        @Comment("Black Opal Chestplate Armor Value. Default = 9")
        public int black_opal_chestplate_armor = 9;
        @Comment("Black Opal Leggings Armor Value. Default = 7")
        public int black_opal_leggings_armor = 7;
        @Comment("Black Opal Boots Armor Value. Default = 3")
        public int black_opal_boots_armor = 3;

        @Comment("Netherite Opal Helmet Armor Value. Default = 3")
        public int netherite_opal_helmet_armor = 3;
        @Comment("Netherite Opal Chestplate Armor Value. Default = 9")
        public int netherite_opal_chestplate_armor = 9;
        @Comment("Netherite Opal Leggings Armor Value. Default = 7")
        public int netherite_opal_leggings_armor = 7;
        @Comment("Netherite Opal Boots Armor Value. Default = 3")
        public int netherite_opal_boots_armor = 3;

        @Comment("Base Attack Damage of the Amethyst Tool Set. For reference, the Diamond Tool Set has 3 base attack damage. Default = 4")
        public int amethyst_attack_damage = 4;
        @Comment("Efficiency of the Amethyst Tool Set. For reference, the Diamond Tool Set has 8 efficiency. Default = 12")
        public int amethyst_efficiency = 12;
        @Comment("Durability of the Amethyst Tool Set. For reference, the Diamond Tool Set has 1561 durability. Set to 0 for infinite durability. Default = 4500")
        public int amethyst_durability = 4500;

        @Comment("Base Attack Damage of the Black Opal Tool Set. Default = 5")
        public int black_opal_attack_damage = 5;
        @Comment("Efficiency of the Black Opal Tool Set. Default = 16")
        public int black_opal_efficiency = 16;
        @Comment("Durability of the Black Opal Tool Set. Set to 0 for infinite durability. Default = 0")
        public int black_opal_durability = 0;

        @Comment("Base Attack Damage of the Netherite Opal Tool Set. Default = 5")
        public int netherite_opal_attack_damage = 5;
        @Comment("Efficiency of the Netherite Opal Tool Set. Default = 16")
        public int netherite_opal_efficiency = 16;
        @Comment("Durability of the Netherite Opal Tool Set. Set to 0 for infinite durability. Default = 0")
        public int netherite_opal_durability = 0;

        @Comment("Amethyst Enchantability. A higher value makes it easier to obtain higher level enchantments for less experience. For reference, diamonds have an enchantability of 10 and gold has an enchantability of 25. Default = 35")
        public int amethyst_enchantability = 35;
        @Comment("Black Opal Enchantability. Default = 15")
        public int black_opal_enchantability = 15;
        @Comment("Netherite Opal Enchantability. Default = 20")
        public int netherite_opal_enchantability = 20;
    }

    @Comment("(Clients only) Sync your config to the server upon joining? (Will still require a Minecraft restart after joining)")
    public Boolean enable_server_config_sync = true;
    @Comment("(Servers only) Sends a packet that attempts to sync the client config file to the server?")
    public Boolean send_config_sync_packet = true;

    @Comment("Wherever diamonds can naturally generate in chests, black opal and amethyst can too at a reduced rate! Default = true")
    public Boolean chest_loot = true;
}
