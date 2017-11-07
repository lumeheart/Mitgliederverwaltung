/**
*
*/
public class Spieler extends AktivesMitglied 
{
  /* Attribute */
	private String position;
	private int tore;
	private int anzahlEinsaetze;
	private int ehrungen;
  /* Methoden */
  /** @return liefert position 
*/
  public String gibPosition(){
    return this.position;
  }

  /** setzt position 
*@param pPosition String
*/
  public void setzePosition(String  pPosition){
    this.position = pPosition;
  }

  /** @return liefert tore 
*/
  public int gibTore(){
    return this.tore;
  }

  /** setzt tore 
*@param pTore Integer
*/
  public void setzeTore(int  pTore){
    this.tore = pTore;
  }

  /** @return liefert anzahlEinsaetze 
*/
  public int gibAnzahlEinsaetze(){
    return this.anzahlEinsaetze;
  }

  /** setzt anzahlEinsaetze 
*@param pAnzahlEinsaetze Integer
*/
  public void setzeAnzahlEinsaetze(int  pAnzahlEinsaetze){
    this.anzahlEinsaetze = pAnzahlEinsaetze;
  }

  /** @return liefert ehrungen 
*/
  public int gibEhrungen(){
    return this.ehrungen;
  }

  /** setzt ehrungen 
*@param pAnzahlEhrungen Integer
*/
  public void setzeEhrungen(int  pEhrungen){
    this.ehrungen = pEhrungen;
  }

}//Ende Klasse: Spieler

