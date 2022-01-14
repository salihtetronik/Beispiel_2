package daks.tests.teilnehmer;

import daks.pages.TeilnehmerPage;
import daks.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeilnehmerRufnummerTest {

    TeilnehmerPage teilnehmer =new TeilnehmerPage();


    // In die Rufnummernfelder können 0,1,2,3,4,5,6,7,8,9, *,# eingegeben werden.
    @Test
    public void teilnehmerRufnummerTest1(){

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
       // ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
       // ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("1234567890*#");
        ReusableMethods.getVisibilityOfWait(teilnehmer.sichernButton);
        //  Erwartetes  Ergebnis True(sichernButton soll aktive sein), Aktueles Ergebnis auch true
        Assert.assertTrue(teilnehmer.sichernButton.isEnabled());
    }



    //  "/" : Obwohl gültiger Wert in der Anforderungliste, tatsächlich ungültiger Wert. Wahrscheinlich ist das ein Bug.
    @Test
    public void teilnehmerRufnummerTest2(){

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
       // ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
       // ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("/");
        //  Erwartetes  Ergebnis ist True(sichernButton soll aktive sein), Aktueles Ergebnis False. Test ist erfolglos
        Assert.assertTrue(teilnehmer.sichernButton.isEnabled());
    }


    //  "-" : Obwohl gültiger Wert in der Anforderungliste, tatsächlich ungültiger Wert
    @Test
    public void teilnehmerRufnummerTest3(){

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
        //ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
       // ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("-");
        //  Erwartetes  Ergebnis True(sichernButton soll aktive sein), Aktueles Ergebnis False.
        Assert.assertTrue(teilnehmer.sichernButton.isEnabled());
    }


    //  "+" : Obwohl gültiger Wert in der Anforderungliste, tatsächlich ungültiger Wert
    @Test
    public void teilnehmerRufnummerTest4(){

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
       // ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
       // ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("+");
        //  Erwartetes  Ergebnis True(sichernButton soll aktive sein), Aktueles Ergebnis False.
        Assert.assertTrue(teilnehmer.sichernButton.isEnabled());
    }


    //  " " : Obwohl gültiger Wert in der Anforderungliste, tatsächlich ungültiger Wert
    @Test
    public void teilnehmerRufnummerTest5(){

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
      //  ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
      //  ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys(" ");
        //  Erwartetes  Ergebnis True(sichernButton soll aktive sein), Aktueles Ergebnis False.
        Assert.assertTrue(teilnehmer.sichernButton.isEnabled());
    }




    // " % " ==> Obwohl ungültiger Wert in der Anforderungliste, tatsächlich gültiger Wert. Wahrscheinlich ist das ein Bug.
    @Test
    public void teilnehmerRufnummerTest6(){

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
       // ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
       // ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("%");
        //  Erwartetes  Ergebnis False(sichernButton soll deaktive sein), aber Aktueles Ergebnis  ist True.
        Assert.assertFalse(teilnehmer.sichernButton.isEnabled());
    }



    // " %1 " ==> Obwohl ungültiger Wert in der Anforderungliste, tatsächlich gültiger Wert. Wahrscheinlich ist das ein Bug.
    @Test
    public void teilnehmerRufnummerTest7() {

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
       // ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
       // ReusableMethods.waitForPageToLoad(10);
       // ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("%1");
        ReusableMethods.getVisibilityOfWait(teilnehmer.sichernButton);
        //  Erwartetes  Ergebnis False(sichernButton soll deaktive sein), aber Aktueles Ergebnis  ist True.
        Assert.assertFalse(teilnehmer.sichernButton.isEnabled());

    }



    // " %12 " ==> Obwohl ungültiger Wert in der Anforderungliste, tatsächlich ungültiger Wert.
    @Test
    public void teilnehmerRufnummerTest8() {

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
      //  ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
      //  ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("%12");
        ReusableMethods.getVisibilityOfWait(teilnehmer.sichernButton);
        //  Erwartetes  Ergebnis False(sichernButton soll deaktive sein), Aktueles Ergebnis auch False. Test ist erfolgreich
        Assert.assertFalse(teilnehmer.sichernButton.isEnabled());

    }




    // In die Rufnummernfelder können *,0,1,2,3,4,#, 5,6,7,8,9 eingegeben werden.
    @Test
    public void teilnehmerRufnummerTest9() {

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
       // ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
       // ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("*456#67890");
        ReusableMethods.getVisibilityOfWait(teilnehmer.sichernButton);
        //  Erwartetes  Ergebnis True(sichernButton soll aktive sein), Aktueles Ergebnis auch true. Test ist Erfolgreich
        Assert.assertTrue(teilnehmer.sichernButton.isEnabled());
    }




    // In die Rufnummernfelder können 0,1,2,3,4,5,6,7,8,9, *,# eingegeben werden.
    @Test
    public void teilnehmerRufnummerTest10() {

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
      //  ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
       // ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("Abcd");
        ReusableMethods.getVisibilityOfWait(teilnehmer.sichernButton);

        //  Erwartetes  Ergebnis False(sichernButton soll deaktive sein), Aktueles Ergebnis auch False. Test ist erfolgreich
        Assert.assertFalse(teilnehmer.sichernButton.isEnabled());
    }




    // In die Rufnummernfelder können 0,1,2,3,4,5,6,7,8,9, *,# eingegeben werden.
    @Test
    public void teilnehmerRufnummerTest11() {

        ReusableMethods.getLogin();
        ReusableMethods.getVisibilityOfWait(teilnehmer.teilnehmerButton).click();
        ReusableMethods.sleep(4000);
       // ReusableMethods.getVisibilityOfWait(teilnehmer.richtungstaste).click();
      //  ReusableMethods.scrollToElement(teilnehmer.tabelleRufnummer197);
        ReusableMethods.doubleClick(teilnehmer.tabelleRufnummer1);
        ReusableMethods.getVisibilityOfWait(teilnehmer.rufnummer).clear();
        teilnehmer.rufnummer.sendKeys("äüöÄÜÖß");
        ReusableMethods.getVisibilityOfWait(teilnehmer.sichernButton);
        //  Erwartetes  Ergebnis False(sichernButton soll deaktive sein), Aktueles Ergebnis auch False. Test ist erfolgreich
        Assert.assertFalse(teilnehmer.sichernButton.isEnabled());
    }

}
