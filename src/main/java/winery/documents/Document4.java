package winery.documents;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPTable;

/**
Klasa umożliwiająca generowanie sprecyzowanego  dokumentu, dziedzicząca po @see Dokument. 
@author Przemysław Iskra
@version 1.0  */

//Jeszcze bez pobierania danych wymaganych przez ten �w dokument. 
public class Document4 extends DocumentBasic {
/** Konstruktor  klasy tworz�cej sprecyzowany dokumentu*/
	

	public Document4()
	{     needtable=true;
		  horizontal= new String[6]; size=13;
	      vertical= new String[13]; size2=5;
	      horizontal[0]=" Kategorie produktów ";
	      horizontal[1]="Czerwone albo różowee";
	      horizontal[2]="Białe";
	      horizontal[3]="Zapasy ogłem (2+3) ";
	      horizontal[4]=" Pochodzace z Rzeczypospolitej Polskiej";
	      horizontal[5]="Pochodzące z poza Rzeczypospolitej Polskiej";
	      vertical[0]=" Wina pochodzące z Unii Europejskiej z Chronionę Nazwą Pochodzenia (ChNP)   ";
	      vertical[1]=" Wina pochodzące z Unii Europejskiej z Chronionym Oznaczeniem Geograficznym (ChOG)   ";
	      vertical[2]=" Wina pochodzące z Unii Europejskiej bez ChNP/ ChOG  z okreęlonej odmiany winorośli   ";
	      vertical[3]= " Wina pochodzące z Unii Europejskiej bez ChNP/ ChOG inne niż z określonej odmiany winorośli ";
	      vertical[4]= "Wina pochodzące z Unii Europejskiej  Pozostałe";
	      vertical[5]= "Wina pochodzące z poza Unii Europejskiej ";
	      vertical[6]= "Ogłem wina ";
	      vertical[7]= "Moszcze winogronowe zagęszczone ";
	      vertical[8]= "Moszcze winogronowe rektyfikowane zagęszczone  ";
	      vertical[9]= "Moszcze winogronowe rektyfikowane pozostałe ";
	      vertical[10]= "Moszcze winogronowe rektyfikowane pozostałe ";
	      vertical[11]= "Ogółem moszcze winogronowe ";
	      vertical[12]= "Suma zapasów win i moszczów winogronowych  ";
		  title= "Deklaracja o ilości win białych lub czerwonych wprowadzonych do obrotu w poprzednim roku gospodarczym";
	       date="31 sierpnia";
	       pathFile="hello.pdf";
	       
	}
	
/**Funkcja dodaj�c� do generowanego dokumentu i do wskazanej tablicy  zawarto�� dokumentu
 * @param table wskazana tablica
 * @param inData dane jakie wymaga dokument, jakie firma musi poda� */

	  public PdfPTable addtoTableNew(PdfPTable table, String [][] inData) {
    	  insertCell(table, horizontal[0],Element.ALIGN_CENTER, 5, f);
    	  insertCell(table,horizontal[1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,horizontal[2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,horizontal[3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,horizontal[4],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,horizontal[5],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[0],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[0][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[0][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[0][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[0][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[0][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  
    	  insertCell(table, vertical[1],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[1][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[1][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[1][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[1][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[1][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[2],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[2][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[2][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[2][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[2][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[2][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[3],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[3][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[3][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[3][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[3][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[3][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[4],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[4][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[4][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[4][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[4][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[4][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[5],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[5][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[5][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[5][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[5][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[5][4],Element.ALIGN_CENTER, 1, f);
    	
    	  insertCell(table, vertical[6],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[6][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[6][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[6][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[6][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[6][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[7],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[7][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[7][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[7][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[7][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[7][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[8],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[8][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[8][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[8][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[8][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[8][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[9],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[9][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[9][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[9][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[9][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[9][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[10],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[10][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[10][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[10][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[10][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[10][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[11],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[11][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[11][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[11][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[11][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[11][4],Element.ALIGN_CENTER, 1, f);
    	  
    	  insertCell(table, vertical[12],Element.ALIGN_LEFT, 5, f);
    	  insertCell(table,inData[12][0],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[12][1],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[12][2],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[12][3],Element.ALIGN_CENTER, 1, f);
    	  insertCell(table,inData[12][4],Element.ALIGN_CENTER, 1, f);
   
    	
		return table;
	}
	  
	  
 
 
}