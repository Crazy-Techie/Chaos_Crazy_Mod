package net.fabricmc.chaos.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class modSiphonStickItem extends SwordItem {
    public modSiphonStickItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffect.byRawId(20), 300, 3), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffect.byRawId(10), 300, 3), attacker);
        return super.postHit(stack, target, attacker);
    }
}
