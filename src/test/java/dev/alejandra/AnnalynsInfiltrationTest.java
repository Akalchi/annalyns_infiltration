package dev.alejandra;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AnnalynsInfiltrationTest {
    
    @Test
   public void testCanFastAttack_WhenKnightAwake_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canFastAttack(true), is(false));
   }

   @Test
   public void testCanFastAttack_WhenKnightAsleep_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canFastAttack(false), is(true));
   }

   @Test
   public void testCanSpy_WhenAllAwake_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canSpy(true, true, true), is(true));
   }

   @Test
   public void testCanSpy_WhenAllAsleep_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canSpy(false, false, false), is(false));
   }

   @Test
   public void testCanSpy_WhenOnlyKnightAwake_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canSpy(true, false, false), is(true));
   }

   @Test
   public void testCanSpy_WhenOnlyArcherAwake_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canSpy(false, true, false), is(true));
   }

   @Test
   public void testCanSpy_WhenOnlyPrisonerAwake_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canSpy(false, false, true), is(true));
   }

   @Test
   public void testCanSignalPrisoner_WhenArcherAwakeAndPrisonerAwake_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canSignalPrisoner(true, true), is(false));
   }

   @Test
   public void testCanSignalPrisoner_WhenArcherAsleepAndPrisonerAwake_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canSignalPrisoner(false, true), is(true));
   }

   @Test
   public void testCanSignalPrisoner_WhenArcherAsleepAndPrisonerAsleep_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canSignalPrisoner(false, false), is(false));
   }

   @Test
   public void testCanFreePrisoner_WhenDogPresentAndArcherAsleep_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canFreePrisoner(false, false, false, true), is(true));
   }

   @Test
   public void testCanFreePrisoner_WhenDogPresentAndArcherAwake_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canFreePrisoner(false, true, false, true), is(false));
   }

   @Test
   public void testCanFreePrisoner_WhenNoDog_PrisonerAwake_KnightAndArcherAsleep_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canFreePrisoner(false, false, true, false), is(true));
   }

   @Test
   public void testCanFreePrisoner_WhenNoDog_PrisonerAwake_KnightAwake_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canFreePrisoner(true, false, true, false), is(false));
   }

   @Test
   public void testCanFreePrisoner_WhenNoDog_PrisonerAwake_ArcherAwake_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canFreePrisoner(false, true, true, false), is(false));
   }

   @Test
   public void testCanFreePrisoner_WhenNoDog_PrisonerAsleep_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canFreePrisoner(false, false, false, false), is(false));
   }

   @Test
   public void testCanFreePrisoner_WhenDogAndPrisonerAwakeAndArcherAsleep_ReturnsTrue() {
       assertThat(AnnalynsInfiltration.canFreePrisoner(false, false, true, true), is(true));
   }

   @Test
   public void testCanFreePrisoner_WhenDogAndPrisonerAwakeAndArcherAwake_ReturnsFalse() {
       assertThat(AnnalynsInfiltration.canFreePrisoner(false, true, true, true), is(false));
   }


}
