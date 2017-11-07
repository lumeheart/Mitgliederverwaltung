/**
*
*/
public abstract class AktivesMitglied extends Mitglied 
{
  /* Attribute */
	protected int aufwandsentschaedigung;
  /* Methoden */
  /** @return liefert aufwandsentschaedigung 
*/
  public int gibAufwandsentschaedigung(){
    return this.aufwandsentschaedigung;
  }

  /** setzt aufwandsentschaedigung 
*@param pAufwandsentschaedigung Integer
*/
  public void setzeAufwandsentschaedigung(int  pAufwandsentschaedigung){
    this.aufwandsentschaedigung = pAufwandsentschaedigung;
  }

}//Ende Klasse: AktivesMitglied

