package dvi.oresabovediamondsfabric.common.main.items;

import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class ModOres extends OreBlock {
    public ModOres(Settings settings) {
        super(settings);
    }

    protected int getExperienceWhenMined(Random random) {
        if (this == ModObjects.AMETHYST_ORE) {
            return MathHelper.nextInt(random, 4, 10);
        } else if (this == ModObjects.BLACK_OPAL_ORE) {
            return MathHelper.nextInt(random, 6, 20);
        } else {
            return this == Blocks.NETHER_GOLD_ORE ? MathHelper.nextInt(random, 0, 1) : 0;
        }
    }
}
