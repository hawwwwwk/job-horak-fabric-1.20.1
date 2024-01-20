package xyz.ethxn.jobhorak.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.stat.Stat;

public class ModFoodComponents {
    public static final FoodComponent JAPPLE = new FoodComponent.Builder().hunger(7).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 10), 1).build();
}
