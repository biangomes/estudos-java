// URL de referencia : https://exercism.org/tracks/java/exercises/annalyns-infiltration

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake || archerIsAwake) && prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (!prisonerIsAwake && archerIsAwake);
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (prisonerIsAwake && petDogIsPresent && knightIsAwake && archerIsAwake);
    }
}
