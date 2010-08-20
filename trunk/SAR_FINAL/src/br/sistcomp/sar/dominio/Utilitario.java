package br.sistcomp.sar.dominio;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Utilitario {

    public static int retornaIdPessoa(int matricula){
        String idPessoa = Integer.toString(matricula);
        return Integer.parseInt(idPessoa.substring(0,idPessoa.length()-4));
    }

    public static int retornaMatricula(int idPessoa, String dataCadastro){
        String matriculaCompleta = (idPessoa) + dataCadastro.substring(3,5) + dataCadastro.substring(8,10);
        return Integer.parseInt(matriculaCompleta);
    }

    public String mes, dia, ano, dia_semana, hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");

    public void le_Hora() {
        Date horaAtual = new Date();
        hora = horaformatada.format(horaAtual);
    }

    public static String dataDoSistema() {
        DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date(System.currentTimeMillis());
        return dataFormatada.format(data);
    }

    public static String dataParaBanco(String data) {
        SimpleDateFormat formatoBrasil, novoFormato;
        formatoBrasil = new SimpleDateFormat("yyyy-MM-dd");
        novoFormato = new SimpleDateFormat("dd/MM/yyyy");
        String resultado;
        try {
           resultado = formatoBrasil.format(novoFormato.parse(data));
           //resultado = novoFormato.format(formatoBrasil.parse(data));
           return resultado;
        }
        catch (ParseException ex) {
            ex.printStackTrace();
            return "Erro na conversão da data";
        }
    }

    // Metodo que transforma de String para Date
    public static Date converteStringParaDate(String data) {
        Date d = null;
        try {
            data = data.substring(6) + "-" + data.substring(3, 5) + "-" +
                    data.substring(0, 2);
            d = java.sql.Date.valueOf(data);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Erro ao converter data");
        }
         return d;
     }

    // Metodo que transforma Date para String
    public static String converteDateParaString(java.util.Date dtData){
        SimpleDateFormat formatoBrasil, novoFormato;
        formatoBrasil = new SimpleDateFormat("yyyy-MM-dd");
        novoFormato = new SimpleDateFormat("dd/MM/yyyy");
        String resultado;
        try {
           resultado = novoFormato.format(formatoBrasil.parse(dtData.toString()));
           return resultado;
        }
        catch (ParseException ex) {
            ex.printStackTrace();
            return "Erro na conversão da data";
        }
     }

    public static String somaDoMesParaVencimentoDoPlano(int duracao){
       Calendar agora = Calendar.getInstance();
       DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
       agora.add(Calendar.MONTH, duracao);
       return dataFormatada.format(agora.getTime());
    }

    public void le_Data() {
        Date data = new Date();
        dia = "" + data.getDate();
        ano = "" + (1900 + data.getYear());
        switch (data.getDay()) {
            case 0:
                dia_semana = "Domingo";
                break;
            case 1:
                dia_semana = "Segunda";
                break;
            case 2:
                dia_semana = "Terça";
                break;
            case 3:
                dia_semana = "Quarta";
                break;
            case 4:
                dia_semana = "Quinta";
                break;
            case 5:
                dia_semana = "Sexta";
                break;
            case 6:
                dia_semana = "Sábado";
                break;
        }

        switch (data.getMonth()) {
            case 0:
                mes = "Janeiro";
                break;
            case 1:
                mes = "Fevereiro";
                break;
            case 2:
                mes = "Março";
                break;
            case 3:
                mes = "Abril";
                break;
            case 4:
                mes = "Maio";
                break;
            case 5:
                mes = "Junho";
                break;
            case 6:
                mes = "Julho";
                break;
            case 7:
                mes = "Agosto";
                break;
            case 8:
                mes = "Setembro";
                break;
            case 9:
                mes = "Outubro";
                break;
            case 10:
                mes = "Novembro";
                break;
            case 11:
                mes = "Dezembro";
                break;
        }
    }
}
