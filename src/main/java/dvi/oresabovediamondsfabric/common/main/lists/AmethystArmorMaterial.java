package dvi.oresabovediamondsfabric.common.main.lists;

import dvi.oresabovediamondsfabric.common.main.OresAboveDiamondsFabric;
import dvi.oresabovediamondsfabric.common.main.items.ModObjects;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class AmethystArmorMaterial implements ArmorMaterial {

    private static int durabilityMultiplier = OresAboveDiamondsFabric.config.amethyst_durability;
    private static int enchantability = OresAboveDiamondsFabric.config.amethyst_enchantability;
    private static float toughness = OresAboveDiamondsFabric.config.amethyst_armor_toughness;
    private static float knockback = OresAboveDiamondsFabric.config.amethyst_armor_knockback_resistance;

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNT = new int[]{6, 9, 11, 6};

    @Override
    public int getDurability(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getEntitySlotId()] * durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot)
    {
        return PROTECTION_AMOUNT[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability()
    {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModObjects.AMETHYST);
    }

    @Override
    public String getName()
    {
        return "gobber2";
    }

    @Override
    public float getToughness()
    {
        return toughness;
    }

    @Override
    public float getKnockbackResistance()
    {
        return knockback;
    }
}
