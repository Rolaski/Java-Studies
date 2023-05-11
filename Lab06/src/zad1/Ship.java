package zad1;

import javax.swing.*;

public class Ship implements Swim
{
    @Override
   public void swimming()
   {
       System.out.println("Ours ship is swimming, Captain!");
   }
   @Override
   public void sinking()
   {
       System.out.println("CAPTAIN! OURS SHIP IS SINKING");
   }
}
