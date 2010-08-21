package br.sistcomp.sar.dominio;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Thiago Ramalho
 */


public class CustonDocument extends PlainDocument {

 public void insertString(int offset, String str, AttributeSet attr)
  throws BadLocationException {
     if (str == null)
         return;
     super.insertString(offset, str.toUpperCase(), attr);
     return;

 }

}