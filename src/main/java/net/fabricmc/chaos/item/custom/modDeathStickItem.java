package net.fabricmc.chaos.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class modDeathStickItem extends SwordItem {
    public modDeathStickItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffect.byRawId(20), 300, 3), attacker);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffect.byRawId(19), 300, 2), attacker);
        return super.postHit(stack, target, attacker);
    }
}
