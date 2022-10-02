package com.hydratereminder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HydrateReminderPersonalityType
{
    SIMPLE("Simple"),
    FUN("Fun"),
    CARING("Caring"),
    ROMANTIC("Romantic"),
    POLITE("Polite"),
    PIRATE("Pirate");


    private final String personalityType;

    /**
     * <p>Get the personality type as a String
     * </p>
     * @return personality type
     * @since 2.0.0
     */
    @Override
    public String toString()
    {
        return getPersonalityType();
    }
}
