package net.ronan.mccourse.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHOCOLATE_PIE = new FoodComponent.Builder().hunger(8).saturationModifier(4.8f).build();
    public static final FoodComponent BERRY_PIE = new FoodComponent.Builder().hunger(9).saturationModifier(4.8f).build();
    public static final FoodComponent GOLDEN_SWEET_BERRIES = new FoodComponent.Builder().snack().hunger(4).saturationModifier(0.9f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 80, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000, 1), 1.0f).build();
    public static final FoodComponent Chocolate_Milk = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1), 1.0f).build();
    public static final FoodComponent Banana = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent Blue_Berries = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent Corn = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent Frog_Legs = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3f).meat().build();
    public static final FoodComponent Cooked_Frog_Legs = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();
}