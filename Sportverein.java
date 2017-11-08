/**
* Blabla Test187
*/
public class Sportverein 
{
  /* Attribute */
	private Mitglied[] mitglied;
	private int anzahlMitglieder;
  /* Methoden */
  /** @return liefert mitglieder 
*/
  public int gibMitglieder(){
    return this.anzahlMitglieder;
  }

  /** setzt die Anzahl der Mitglieder 
* @param pMitglieder Integer
*/
  public void setzeMitglieder(int  pMitglieder){
    this.anzahlMitglieder = pMitglieder;
  }

  /** Diese Methode nimmt neue Mitglieder mit ihren unterschiedlichen Daten auf.
*@param pName String
*@param pVorname String
*@param pAdresse String
*@param pAnmeldedatum String
*@param pVereinsID Integer
*@param pAktiv Boolean
*/
  public void neuesMitgliedAufnehmen(String  pName, String  pVorname, String  pAdresse, String  anmeldedatum, int  vereinsID, boolean  aktiv){
  }

}//Ende Klasse: Sportverein

