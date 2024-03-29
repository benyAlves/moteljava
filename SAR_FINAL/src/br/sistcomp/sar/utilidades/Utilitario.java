package br.sistcomp.sar.utilidades;

import java.awt.Cursor;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.*;

public class Utilitario {

    public static int mesAtual() {
        GregorianCalendar calendar = new GregorianCalendar();
        return calendar.get(GregorianCalendar.MONTH) + 1;
    }

    public static int retornaIdPessoa(int matricula) {
        String idPessoa = Integer.toString(matricula);
        return Integer.parseInt(idPessoa.substring(0, idPessoa.length() - 4));
    }

    public static int retornaMatricula(int idPessoa, String dataCadastro) {
        String matriculaCompleta = (idPessoa) + dataCadastro.substring(3, 5) + dataCadastro.substring(8, 10);
        return Integer.parseInt(matriculaCompleta);
    }
    public String mes, dia, ano, dia_semana, hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");

    public void le_Hora() {
        Date horaAtual = new Date();
        hora = horaformatada.format(horaAtual);
    }

    public static String getHora() {

        // cria um StringBuilder
        StringBuilder sb = new StringBuilder();

        // cria um GregorianCalendar que vai conter a hora atual
        GregorianCalendar d = new GregorianCalendar();

        // anexa do StringBuilder os dados da hora
        sb.append(d.get(GregorianCalendar.HOUR_OF_DAY));
        sb.append(":");
        sb.append(d.get(GregorianCalendar.MINUTE));
        sb.append(":");
        sb.append(d.get(GregorianCalendar.SECOND));

        // retorna a String do StringBuilder
        return sb.toString();
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
        } catch (ParseException ex) {
            ex.printStackTrace();
            return "Erro na conversão da data";
        }
    }

    // Metodo que transforma de String para Date
    public static Date converteStringParaDate(String data) {
        Date d = null;
        try {
            data = data.substring(6) + "-" + data.substring(3, 5) + "-"
                    + data.substring(0, 2);
            d = java.sql.Date.valueOf(data);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Erro ao converter data");
        }
        return d;
    }

    // Metodo que transforma Date para String
    public static String converteDateParaString(java.util.Date dtData) {
        SimpleDateFormat formatoBrasil, novoFormato;
        formatoBrasil = new SimpleDateFormat("yyyy-MM-dd");
        novoFormato = new SimpleDateFormat("dd/MM/yyyy");
        String resultado;
        try {
            resultado = novoFormato.format(formatoBrasil.parse(dtData.toString()));
            return resultado;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return "Erro na conversão da data";
        }
    }

    public static String somaDoMesParaVencimentoDoPlano(int duracao) {
        Calendar agora = Calendar.getInstance();
        DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        agora.add(Calendar.MONTH, duracao);
        return dataFormatada.format(agora.getTime());
    }

    public static String somaMesPlanoAderido(int duracao, String dataAdesao) {
        Date data = converteStringParaDate(dataAdesao);
        Calendar vencimento = Calendar.getInstance();
        DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        vencimento.setTime(data);
        vencimento.add(Calendar.MONTH, duracao);
        return dataFormatada.format(vencimento.getTime());
    }

    public static Cursor startCursor() {
        return Cursor.getPredefinedCursor(3);
    }

    public static Cursor stopCursor() {
        return Cursor.getDefaultCursor();
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

    public static Boolean validarData(String data) {
        Pattern p = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
        Matcher m = p.matcher(data);
        if (!m.find()) {
            return false;
        }
        return true;
    }

    public static Boolean validarHora(String hora) {
        Pattern p = Pattern.compile("((0[0-9])|(1[0-9])|(2[0-3])){1}:((0[0-9])|(1[0-9])|(2[0-9])|(3[0-9])|(4[0-9])|(5[0-9])){1}");
        Matcher m = p.matcher(hora);
        if (!m.find()) {
            return false;
        }
        return true;
    }

}
