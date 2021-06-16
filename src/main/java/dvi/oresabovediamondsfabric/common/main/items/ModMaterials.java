package dvi.oresabovediamondsfabric.common.main.items;

import dvi.oresabovediamondsfabric.common.main.OresAboveDiamondsFabric;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ModMaterials {

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};

    public static final ToolMaterial AMETHYST_MATERIAL = new ToolMaterial() {
        @Override
        public int getDurability() {
            return OresAboveDiamondsFabric.config.GEAR.amethyst_durability;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return OresAboveDiamondsFabric.config.GEAR.amethyst_efficiency;
        }

        @Override
        public float getAttackDamage() {
            return OresAboveDiamondsFabric.config.GEAR.amethyst_attack_damage;
        }

        @Override
        public int getMiningLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return OresAboveDiamondsFabric.config.GEAR.amethyst_enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModObjects.AMETHYST);
        }
    };

    public static final ToolMaterial BLACK_OPAL_MATERIAL = new ToolMaterial() {
        @Override
        public int getDurability() {
            return OresAboveDiamondsFabric.config.GEAR.black_opal_durability;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return OresAboveDiamondsFabric.config.GEAR.black_opal_efficiency;
        }

        @Override
        public float getAttackDamage() {
            return OresAboveDiamondsFabric.config.GEAR.black_opal_attack_damage;
        }

        @Override
        public int getMiningLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return OresAboveDiamondsFabric.config.GEAR.black_opal_enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModObjects.BLACK_OPAL);
        }
    };

    public static final ToolMaterial NETHERITE_OPAL_MATERIAL = new ToolMaterial() {
        @Override
        public int getDurability() {
            return OresAboveDiamondsFabric.config.GEAR.netherite_opal_durability;
        }

        @Override
        public float getMiningSpeedMultiplier() {
            return OresAboveDiamondsFabric.config.GEAR.netherite_opal_efficiency;
        }

        @Override
        public float getAttackDamage() {
            return OresAboveDiamondsFabric.config.GEAR.netherite_opal_attack_damage;
        }

        @Override
        public int getMiningLevel() {
            return 4;
        }

        @Override
        public int getEnchantability() {
            return OresAboveDiamondsFabric.config.GEAR.netherite_opal_enchantability;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }
    };

    private static final int [] PROTECTION = new int[] {3, 6, 8, 3};

    public static final ArmorMaterial AMETHYST_ARMOR = new ArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getEntitySlotId()] * OresAboveDiamondsFabric.config.GEAR.amethyst_armor_durability;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return PROTECTION[slot.getEntitySlotId()] + 1;
        }

        @Override
        public int getEnchantability() {
            return OresAboveDiamondsFabric.config.GEAR.amethyst_enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModObjects.AMETHYST);
        }

        @Override
        public String getName() {
            return "amethyst";
        }

        @Override
        public float getToughness() {
            return OresAboveDiamondsFabric.config.GEAR.amethyst_armor_toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return OresAboveDiamondsFabric.config.GEAR.amethyst_armor_knockback_resistance;
        }
    };

    public static final ArmorMaterial BLACK_OPAL_ARMOR = new ArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getEntitySlotId()] * OresAboveDiamondsFabric.config.GEAR.black_opal_armor_durability;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return PROTECTION[slot.getEntitySlotId()] + 2;
        }

        @Override
        public int getEnchantability() {
            return OresAboveDiamondsFabric.config.GEAR.black_opal_enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(ModObjects.BLACK_OPAL);
        }

        @Override
        public String getName() {
            return "black_opal";
        }

        @Override
        public float getToughness() {
            return OresAboveDiamondsFabric.config.GEAR.black_opal_armor_toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return OresAboveDiamondsFabric.config.GEAR.black_opal_armor_knockback_resistance;
        }
    };

    public static final ArmorMaterial NETHERITE_OPAL_ARMOR = new ArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getEntitySlotId()] * OresAboveDiamondsFabric.config.GEAR.netherite_opal_armor_durability;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return PROTECTION[slot.getEntitySlotId()] + 3;
        }

        @Override
        public int getEnchantability() {
            return OresAboveDiamondsFabric.config.GEAR.netherite_opal_enchantability;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return null;
        }

        @Override
        public String getName() {
            return "netherite_opal";
        }

        @Override
        public float getToughness() {
            return OresAboveDiamondsFabric.config.GEAR.netherite_opal_armor_toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return OresAboveDiamondsFabric.config.GEAR.netherite_opal_armor_knockback_resistance;
        }
    };
}
