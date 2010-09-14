package br.sistcomp.sar.utilidades;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Thiago Ramalho
 */


public class CaixaAlta extends PlainDocument {

 public void insertString(int offset, String str, AttributeSet attr)
  throws BadLocationException {
     if (str == null)
         return;
     super.insertString(offset, str.toUpperCase(), attr);
     return;

 }

}
